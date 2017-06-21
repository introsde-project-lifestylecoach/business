package lifecoach.business.webservice;

import lifecoach.storage.webservice.StorageService;
import lifecoach.storage.webservice.Storage;

import lifecoach.localdb.webservice.Person;
import lifecoach.localdb.webservice.Measure;
import lifecoach.localdb.webservice.Goal;

import lifecoach.adaptor.webservice.Bmi;
import lifecoach.business.model.GoalBusiness;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.jws.WebService;


//Service Implementation

@WebService(endpointInterface = "lifecoach.business.webservice.Business",
    serviceName="BusinessService")
public class BusinessImplementation implements Business 
{
	StorageService service;
	Storage storage;
	
	public void init()
	{
		service = new StorageService();
        storage = service.getStorageImplementationPort();
	}
	
	
	/* Manage Person*/

    @Override
    public int addPerson(Person person) {
    	init();
    	System.out.println("Save Person with id = " + person.getIdPerson());
    	return storage.createPerson(person);
    }

    @Override
    public int updatePerson(Person person) {
    	init();
    	if(person == null)
    	{
    		System.out.println("Zio billy");
    		return 1;
    	}    	
    	System.out.println("Update Person with id = " + person.getIdPerson());
        return storage.updatePerson(person);
    }

    @Override
    public int deletePerson(int id) {
    	init();
    	System.out.println("Delete Person with id = " + id);           
        return storage.deletePerson(id);
    }
    
    
    /* Manage Measure */

    @Override
    public int addMeasure(int pId, Measure measure) {
    	init();
    	System.out.println("Save Measure with id = " + measure.getIdMeasure());
        
    	if(measure.getMeasureType()==null)
    	{
    		System.out.println("QUi");
    	}
    	else
    	{
		// Gen date
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		// Add date to measure
		measure.setDate(dateFormat.format(date));

    		System.out.println("QUa " + measure.getMeasureType().getType());
    	}
    	
        return storage.createMeasure(pId, measure);
    }

    @Override
    public int updateMeasure(int pId, Measure measure) {
    	init();
    	System.out.println("Update Measure with id = " + measure.getIdMeasure());  	
    	return storage.updateMeasure(pId, measure);
    }
    
    @Override
    public int deleteMeasure(int id) {
    	init();
    	System.out.println("Delete Measure with id = " + id);
    	return storage.deleteMeasure(id);
    }
    
    
    /* Manage MeasureType */
    
    @Override
    public List<GoalBusiness> getGoals(int pId) {
    	init();
    	float measure_value, goal_value; 
    	List<GoalBusiness> gbList = new ArrayList<GoalBusiness>();
    	List<Goal> gList = storage.getGoals(pId);
    	GoalBusiness gb = null;
    	for(Goal g: gList)
    	{
    		gb = new GoalBusiness(g, false);	// TODO Check that gb is a new instance every cycle  
    		gbList.add(gb);
    		switch(g.getGoalType().getType())
    		{
    			case "increase":
    				System.out.println("Check goal for increase");
    				measure_value = storage.getLastMeasureByType(pId, g.getMeasureType().getType()).getValue();
    				goal_value = g.getValue();
    				System.out.println("->" + measure_value + " > " + goal_value);
    				if(measure_value > goal_value)
    				{
    					gb.setDone(true);
    				}
    				break;
    			case "decrease":
    				System.out.println("Check goal for decrease");
    				measure_value = storage.getLastMeasureByType(pId, g.getMeasureType().getType()).getValue();
    				goal_value = g.getValue();
    				System.out.println("->" + measure_value + " < " + goal_value);
    				if(measure_value < goal_value)
    				{
    					gb.setDone(true);
    				}
    				break;
    			case "daily":
    				System.out.println("Check goal for daily");
    				// TODO
    				break;
    			case "amount":
    				System.out.println("Check goal for amount");
    				// TODO
    				break;
    		}
    	}
    	
    	return gbList;
    }
    
    @Override
    public int addGoal(int pId, Goal goal) {
    	init();
    	System.out.println("Save Goal with id = " + goal.getIdGoal());
        
    	if(goal.getMeasureType()==null)
    	{
    		System.out.println("QUi");
    	}
    	else
    	{
    		System.out.println("QUa " + goal.getMeasureType().getType());
    	}
    	
    	return storage.createGoal(pId, goal);
    }

    @Override
    public int updateGoal(int pId, Goal goal, String oldGoal) {
    	init();
    	System.out.println("Update Goal with id = " + goal.getIdGoal());

		Goal g = storage.getGoalByTitle(pId, oldGoal);
		if(g == null)
			g = new Goal();

		g.setIdGoal(goal.getIdGoal());
		g.setTitle(goal.getTitle());
		g.setDescription(goal.getDescription());
		g.setGoalType(goal.getGoalType());
		g.setValue(goal.getValue());	
		g.setMeasureType(goal.getMeasureType());

    	return storage.updateGoal(pId, g);
    }
    
    @Override
    public int deleteGoal(int id) {
    	init();
    	System.out.println("Delete Goal with id = " + id);
    	return storage.deleteGoal(id);
    }
   
    
    /* Bmi */
    
    @Override
    public Bmi getBmi(int pId) {
    	int age;
    	float height, weight;
    	Bmi b;
    	Person p;
    	List<Measure> mL;
    	
    	init();    	
    	System.out.println("Calcolate Bmi for person with id = " + pId);
        
        height = weight = age = 0; 
        p = storage.readPerson(pId);
        System.out.println("---> Found Person by id = " + pId + " => " + p.getFirstname());
    	mL = storage.getLastMeasure(pId);
    	
        for(Measure m: mL)
        {
        	System.out.println("---> Found measure " + m.getMeasureType().getType() + " " + m.getValue());
        	switch(m.getMeasureType().getType())
        	{
        		case "height":
        			height = m.getValue();
        			break;
        		case "weight":
        			weight = m.getValue();
        			break;
        	}
        }
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate birthday = null;
        LocalDate today = LocalDate.now();
        try 
        {
        	birthday = LocalDate.parse(p.getBirthdate(), formatter);        	    	 
         	Period period = Period.between(birthday, today);     	 
         	age = period.getYears();
         	System.out.println("--> Age = " + age);
        }
	    catch (DateTimeParseException e) 
        {
	        e.printStackTrace();
	    }
        
        if(weight == 0 || height == 0 || age == 0)
        {
        	System.out.println("Error with height,weight or age");
        	b = null;
        }
        else
        {
        	System.out.println("Calcolate Bmi with: weight=" + weight + ", height=" + height + ", sex=" + p.getSex().toCharArray()[0]
              		 + ", age=" + age + ", waist=" + p.getWaist() + ", hip=" + p.getHip());
        	b = storage.getBmi(weight, height, p.getSex().toLowerCase().toCharArray()[0], age, p.getWaist(), p.getHip());
        }
        
        if (b!=null) 
        {
            System.out.println("---> Bmi for = "+weight+" and "+height);
        } 
        else 
        {
            System.out.println("---> Error in calculating Bmi for = "+weight+" and "+height);
        }
        
        return b;
    }
}
