package lifecoach.business.webservice;

import lifecoach.localdb.webservice.Person;
import lifecoach.localdb.webservice.Measure;
import lifecoach.localdb.webservice.Goal;

import lifecoach.adaptor.webservice.Bmi;
import lifecoach.business.model.GoalBusiness;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.WebResult;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL) //optional
public interface Business 
{
	/* Person */

    @WebMethod(operationName="createPerson")
    @WebResult(name="personId") 
    public int addPerson(@WebParam(name="person", targetNamespace="http://webservice.business.lifecoach/") Person person);

    @WebMethod(operationName="updatePerson")
    @WebResult(name="personId") 
    public int updatePerson(@WebParam(name="person", targetNamespace="http://webservice.business.lifecoach/") Person person);

    @WebMethod(operationName="deletePerson")
    @WebResult(name="result") 
    public int deletePerson(@WebParam(name="personId") int id);
    
    
    /* Measure */
    
    @WebMethod(operationName="createMeasure")
    @WebResult(name="measureId") 
    public int addMeasure(@WebParam(name="personId") int pId, @WebParam(name="measure", targetNamespace="http://webservice.business.lifecoach/") Measure measure);

    @WebMethod(operationName="updateMeasure")
    @WebResult(name="measureId") 
    public int updateMeasure(@WebParam(name="personId") int pId, @WebParam(name="measure", targetNamespace="http://webservice.business.lifecoach/") Measure measure);
    
    @WebMethod(operationName="deleteMeasure")
    @WebResult(name="result") 
    public int deleteMeasure(@WebParam(name="measureId") int id);
       
    
    /* Goal */
    
    @WebMethod(operationName="getGoals")
    @WebResult(name="listGoalBusiness") 
    public List<GoalBusiness> getGoals(@WebParam(name="personId") int pId);
    
    @WebMethod(operationName="createGoal")
    @WebResult(name="goalId") 
    public int addGoal(@WebParam(name="personId") int pId, @WebParam(name="goal", targetNamespace="http://webservice.business.lifecoach/") Goal goal);

    @WebMethod(operationName="updateGoal")
    @WebResult(name="goalId") 
    public int updateGoal(@WebParam(name="personId") int pId, @WebParam(name="goal", targetNamespace="http://webservice.business.lifecoach/") Goal goal, @WebParam(name="oldTitle") String oldTitle);
    
    @WebMethod(operationName="deleteGoal")
    @WebResult(name="result") 
    public int deleteGoal(@WebParam(name="goalId") int id);
    
    @WebMethod(operationName="deleteGoalByTitle")
    @WebResult(name="result") 
    public int deleteGoalByTitle(@WebParam(name="goalId") int id, @WebParam(name="title") String title);
    
    
    /* Bmi */
    @WebMethod(operationName="getBmi")
    @WebResult(name="bmi") 
    public Bmi getBmi(@WebParam(name="personId") int pId);
    
}
