package lifecoach.business.webservice;

import lifecoach.storage.webservice.StorageService;
import lifecoach.storage.webservice.Storage;
import lifecoach.localdb.webservice.Person;
import lifecoach.localdb.webservice.Measure;
import lifecoach.localdb.webservice.Goal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		// gen date
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

	Goal g = storage.getGoalByTitle(oldGoal);
	if(g == null)
		g = new Goal();

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
}
