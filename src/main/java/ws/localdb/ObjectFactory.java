
package ws.localdb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.localdb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeleteMeasureResponse_QNAME = new QName("http://webservice.localdb.lifecoach/", "deleteMeasureResponse");
    private final static QName _MeasureType_QNAME = new QName("http://webservice.localdb.lifecoach/", "measureType");
    private final static QName _GetGoalHistory_QNAME = new QName("http://webservice.localdb.lifecoach/", "getGoalHistory");
    private final static QName _ReadGoalResponse_QNAME = new QName("http://webservice.localdb.lifecoach/", "readGoalResponse");
    private final static QName _CreateMeasureResponse_QNAME = new QName("http://webservice.localdb.lifecoach/", "createMeasureResponse");
    private final static QName _ReadLastMeasureResponse_QNAME = new QName("http://webservice.localdb.lifecoach/", "readLastMeasureResponse");
    private final static QName _ReadMeasureType_QNAME = new QName("http://webservice.localdb.lifecoach/", "readMeasureType");
    private final static QName _GetMeasureHistory_QNAME = new QName("http://webservice.localdb.lifecoach/", "getMeasureHistory");
    private final static QName _ReadMeasureResponse_QNAME = new QName("http://webservice.localdb.lifecoach/", "readMeasureResponse");
    private final static QName _GetMeasureTypeList_QNAME = new QName("http://webservice.localdb.lifecoach/", "getMeasureTypeList");
    private final static QName _DeleteGoalResponse_QNAME = new QName("http://webservice.localdb.lifecoach/", "deleteGoalResponse");
    private final static QName _GetPeopleList_QNAME = new QName("http://webservice.localdb.lifecoach/", "getPeopleList");
    private final static QName _ReadLastMeasureByType_QNAME = new QName("http://webservice.localdb.lifecoach/", "readLastMeasureByType");
    private final static QName _UpdatePerson_QNAME = new QName("http://webservice.localdb.lifecoach/", "updatePerson");
    private final static QName _GetGoalsResponse_QNAME = new QName("http://webservice.localdb.lifecoach/", "getGoalsResponse");
    private final static QName _UpdateMeasureResponse_QNAME = new QName("http://webservice.localdb.lifecoach/", "updateMeasureResponse");
    private final static QName _DeleteGoal_QNAME = new QName("http://webservice.localdb.lifecoach/", "deleteGoal");
    private final static QName _GetGoals_QNAME = new QName("http://webservice.localdb.lifecoach/", "getGoals");
    private final static QName _GetPeopleListResponse_QNAME = new QName("http://webservice.localdb.lifecoach/", "getPeopleListResponse");
    private final static QName _ReadPersonResponse_QNAME = new QName("http://webservice.localdb.lifecoach/", "readPersonResponse");
    private final static QName _GetIdMeasureTypeByTypeResponse_QNAME = new QName("http://webservice.localdb.lifecoach/", "getIdMeasureTypeByTypeResponse");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://webservice.localdb.lifecoach/", "updatePersonResponse");
    private final static QName _GetGoalTypeList_QNAME = new QName("http://webservice.localdb.lifecoach/", "getGoalTypeList");
    private final static QName _ReadGoalType_QNAME = new QName("http://webservice.localdb.lifecoach/", "readGoalType");
    private final static QName _ReadGoalTypeResponse_QNAME = new QName("http://webservice.localdb.lifecoach/", "readGoalTypeResponse");
    private final static QName _GetSomeMeasureResponse_QNAME = new QName("http://webservice.localdb.lifecoach/", "getSomeMeasureResponse");
    private final static QName _GetMeasureTypeListResponse_QNAME = new QName("http://webservice.localdb.lifecoach/", "getMeasureTypeListResponse");
    private final static QName _CreatePerson_QNAME = new QName("http://webservice.localdb.lifecoach/", "createPerson");
    private final static QName _ReadLastMeasureByTypeResponse_QNAME = new QName("http://webservice.localdb.lifecoach/", "readLastMeasureByTypeResponse");
    private final static QName _CreatePersonResponse_QNAME = new QName("http://webservice.localdb.lifecoach/", "createPersonResponse");
    private final static QName _GoalType_QNAME = new QName("http://webservice.localdb.lifecoach/", "goalType");
    private final static QName _GetSomeMeasure_QNAME = new QName("http://webservice.localdb.lifecoach/", "getSomeMeasure");
    private final static QName _GetGoalHistoryResponse_QNAME = new QName("http://webservice.localdb.lifecoach/", "getGoalHistoryResponse");
    private final static QName _CreateMeasure_QNAME = new QName("http://webservice.localdb.lifecoach/", "createMeasure");
    private final static QName _UpdateMeasure_QNAME = new QName("http://webservice.localdb.lifecoach/", "updateMeasure");
    private final static QName _ReadLastMeasure_QNAME = new QName("http://webservice.localdb.lifecoach/", "readLastMeasure");
    private final static QName _DeletePersonResponse_QNAME = new QName("http://webservice.localdb.lifecoach/", "deletePersonResponse");
    private final static QName _GetIdMeasureTypeByType_QNAME = new QName("http://webservice.localdb.lifecoach/", "getIdMeasureTypeByType");
    private final static QName _GetMeasureHistoryResponse_QNAME = new QName("http://webservice.localdb.lifecoach/", "getMeasureHistoryResponse");
    private final static QName _ReadGoal_QNAME = new QName("http://webservice.localdb.lifecoach/", "readGoal");
    private final static QName _DeleteMeasure_QNAME = new QName("http://webservice.localdb.lifecoach/", "deleteMeasure");
    private final static QName _GetGoalByTitleResponse_QNAME = new QName("http://webservice.localdb.lifecoach/", "getGoalByTitleResponse");
    private final static QName _GetGoalByTitle_QNAME = new QName("http://webservice.localdb.lifecoach/", "getGoalByTitle");
    private final static QName _CreateGoal_QNAME = new QName("http://webservice.localdb.lifecoach/", "createGoal");
    private final static QName _Person_QNAME = new QName("http://webservice.localdb.lifecoach/", "person");
    private final static QName _ReadPerson_QNAME = new QName("http://webservice.localdb.lifecoach/", "readPerson");
    private final static QName _CreateGoalResponse_QNAME = new QName("http://webservice.localdb.lifecoach/", "createGoalResponse");
    private final static QName _Measure_QNAME = new QName("http://webservice.localdb.lifecoach/", "measure");
    private final static QName _ReadMeasure_QNAME = new QName("http://webservice.localdb.lifecoach/", "readMeasure");
    private final static QName _ReadMeasureTypeResponse_QNAME = new QName("http://webservice.localdb.lifecoach/", "readMeasureTypeResponse");
    private final static QName _UpdateGoal_QNAME = new QName("http://webservice.localdb.lifecoach/", "updateGoal");
    private final static QName _GetGoalTypeListResponse_QNAME = new QName("http://webservice.localdb.lifecoach/", "getGoalTypeListResponse");
    private final static QName _Goal_QNAME = new QName("http://webservice.localdb.lifecoach/", "goal");
    private final static QName _UpdateGoalResponse_QNAME = new QName("http://webservice.localdb.lifecoach/", "updateGoalResponse");
    private final static QName _DeletePerson_QNAME = new QName("http://webservice.localdb.lifecoach/", "deletePerson");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.localdb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link DeleteMeasure }
     * 
     */
    public DeleteMeasure createDeleteMeasure() {
        return new DeleteMeasure();
    }

    /**
     * Create an instance of {@link GetGoalByTitleResponse }
     * 
     */
    public GetGoalByTitleResponse createGetGoalByTitleResponse() {
        return new GetGoalByTitleResponse();
    }

    /**
     * Create an instance of {@link GetMeasureHistoryResponse }
     * 
     */
    public GetMeasureHistoryResponse createGetMeasureHistoryResponse() {
        return new GetMeasureHistoryResponse();
    }

    /**
     * Create an instance of {@link ReadGoal }
     * 
     */
    public ReadGoal createReadGoal() {
        return new ReadGoal();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link GetIdMeasureTypeByType }
     * 
     */
    public GetIdMeasureTypeByType createGetIdMeasureTypeByType() {
        return new GetIdMeasureTypeByType();
    }

    /**
     * Create an instance of {@link CreateMeasure }
     * 
     */
    public CreateMeasure createCreateMeasure() {
        return new CreateMeasure();
    }

    /**
     * Create an instance of {@link UpdateMeasure }
     * 
     */
    public UpdateMeasure createUpdateMeasure() {
        return new UpdateMeasure();
    }

    /**
     * Create an instance of {@link ReadLastMeasure }
     * 
     */
    public ReadLastMeasure createReadLastMeasure() {
        return new ReadLastMeasure();
    }

    /**
     * Create an instance of {@link GetGoalHistoryResponse }
     * 
     */
    public GetGoalHistoryResponse createGetGoalHistoryResponse() {
        return new GetGoalHistoryResponse();
    }

    /**
     * Create an instance of {@link GetSomeMeasure }
     * 
     */
    public GetSomeMeasure createGetSomeMeasure() {
        return new GetSomeMeasure();
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link GetGoalTypeListResponse }
     * 
     */
    public GetGoalTypeListResponse createGetGoalTypeListResponse() {
        return new GetGoalTypeListResponse();
    }

    /**
     * Create an instance of {@link Goal }
     * 
     */
    public Goal createGoal() {
        return new Goal();
    }

    /**
     * Create an instance of {@link UpdateGoalResponse }
     * 
     */
    public UpdateGoalResponse createUpdateGoalResponse() {
        return new UpdateGoalResponse();
    }

    /**
     * Create an instance of {@link ReadMeasureTypeResponse }
     * 
     */
    public ReadMeasureTypeResponse createReadMeasureTypeResponse() {
        return new ReadMeasureTypeResponse();
    }

    /**
     * Create an instance of {@link UpdateGoal }
     * 
     */
    public UpdateGoal createUpdateGoal() {
        return new UpdateGoal();
    }

    /**
     * Create an instance of {@link CreateGoalResponse }
     * 
     */
    public CreateGoalResponse createCreateGoalResponse() {
        return new CreateGoalResponse();
    }

    /**
     * Create an instance of {@link Measure }
     * 
     */
    public Measure createMeasure() {
        return new Measure();
    }

    /**
     * Create an instance of {@link ReadMeasure }
     * 
     */
    public ReadMeasure createReadMeasure() {
        return new ReadMeasure();
    }

    /**
     * Create an instance of {@link ReadPerson }
     * 
     */
    public ReadPerson createReadPerson() {
        return new ReadPerson();
    }

    /**
     * Create an instance of {@link CreateGoal }
     * 
     */
    public CreateGoal createCreateGoal() {
        return new CreateGoal();
    }

    /**
     * Create an instance of {@link GetGoalByTitle }
     * 
     */
    public GetGoalByTitle createGetGoalByTitle() {
        return new GetGoalByTitle();
    }

    /**
     * Create an instance of {@link DeleteGoalResponse }
     * 
     */
    public DeleteGoalResponse createDeleteGoalResponse() {
        return new DeleteGoalResponse();
    }

    /**
     * Create an instance of {@link GetMeasureTypeList }
     * 
     */
    public GetMeasureTypeList createGetMeasureTypeList() {
        return new GetMeasureTypeList();
    }

    /**
     * Create an instance of {@link ReadMeasureResponse }
     * 
     */
    public ReadMeasureResponse createReadMeasureResponse() {
        return new ReadMeasureResponse();
    }

    /**
     * Create an instance of {@link GetMeasureHistory }
     * 
     */
    public GetMeasureHistory createGetMeasureHistory() {
        return new GetMeasureHistory();
    }

    /**
     * Create an instance of {@link ReadMeasureType }
     * 
     */
    public ReadMeasureType createReadMeasureType() {
        return new ReadMeasureType();
    }

    /**
     * Create an instance of {@link ReadLastMeasureResponse }
     * 
     */
    public ReadLastMeasureResponse createReadLastMeasureResponse() {
        return new ReadLastMeasureResponse();
    }

    /**
     * Create an instance of {@link CreateMeasureResponse }
     * 
     */
    public CreateMeasureResponse createCreateMeasureResponse() {
        return new CreateMeasureResponse();
    }

    /**
     * Create an instance of {@link ReadGoalResponse }
     * 
     */
    public ReadGoalResponse createReadGoalResponse() {
        return new ReadGoalResponse();
    }

    /**
     * Create an instance of {@link GetGoalHistory }
     * 
     */
    public GetGoalHistory createGetGoalHistory() {
        return new GetGoalHistory();
    }

    /**
     * Create an instance of {@link DeleteMeasureResponse }
     * 
     */
    public DeleteMeasureResponse createDeleteMeasureResponse() {
        return new DeleteMeasureResponse();
    }

    /**
     * Create an instance of {@link MeasureType }
     * 
     */
    public MeasureType createMeasureType() {
        return new MeasureType();
    }

    /**
     * Create an instance of {@link CreatePersonResponse }
     * 
     */
    public CreatePersonResponse createCreatePersonResponse() {
        return new CreatePersonResponse();
    }

    /**
     * Create an instance of {@link GoalType }
     * 
     */
    public GoalType createGoalType() {
        return new GoalType();
    }

    /**
     * Create an instance of {@link ReadLastMeasureByTypeResponse }
     * 
     */
    public ReadLastMeasureByTypeResponse createReadLastMeasureByTypeResponse() {
        return new ReadLastMeasureByTypeResponse();
    }

    /**
     * Create an instance of {@link CreatePerson }
     * 
     */
    public CreatePerson createCreatePerson() {
        return new CreatePerson();
    }

    /**
     * Create an instance of {@link GetMeasureTypeListResponse }
     * 
     */
    public GetMeasureTypeListResponse createGetMeasureTypeListResponse() {
        return new GetMeasureTypeListResponse();
    }

    /**
     * Create an instance of {@link ReadGoalTypeResponse }
     * 
     */
    public ReadGoalTypeResponse createReadGoalTypeResponse() {
        return new ReadGoalTypeResponse();
    }

    /**
     * Create an instance of {@link GetSomeMeasureResponse }
     * 
     */
    public GetSomeMeasureResponse createGetSomeMeasureResponse() {
        return new GetSomeMeasureResponse();
    }

    /**
     * Create an instance of {@link GetGoalTypeList }
     * 
     */
    public GetGoalTypeList createGetGoalTypeList() {
        return new GetGoalTypeList();
    }

    /**
     * Create an instance of {@link ReadGoalType }
     * 
     */
    public ReadGoalType createReadGoalType() {
        return new ReadGoalType();
    }

    /**
     * Create an instance of {@link GetIdMeasureTypeByTypeResponse }
     * 
     */
    public GetIdMeasureTypeByTypeResponse createGetIdMeasureTypeByTypeResponse() {
        return new GetIdMeasureTypeByTypeResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link ReadPersonResponse }
     * 
     */
    public ReadPersonResponse createReadPersonResponse() {
        return new ReadPersonResponse();
    }

    /**
     * Create an instance of {@link GetPeopleListResponse }
     * 
     */
    public GetPeopleListResponse createGetPeopleListResponse() {
        return new GetPeopleListResponse();
    }

    /**
     * Create an instance of {@link GetGoals }
     * 
     */
    public GetGoals createGetGoals() {
        return new GetGoals();
    }

    /**
     * Create an instance of {@link DeleteGoal }
     * 
     */
    public DeleteGoal createDeleteGoal() {
        return new DeleteGoal();
    }

    /**
     * Create an instance of {@link GetGoalsResponse }
     * 
     */
    public GetGoalsResponse createGetGoalsResponse() {
        return new GetGoalsResponse();
    }

    /**
     * Create an instance of {@link UpdateMeasureResponse }
     * 
     */
    public UpdateMeasureResponse createUpdateMeasureResponse() {
        return new UpdateMeasureResponse();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link GetPeopleList }
     * 
     */
    public GetPeopleList createGetPeopleList() {
        return new GetPeopleList();
    }

    /**
     * Create an instance of {@link ReadLastMeasureByType }
     * 
     */
    public ReadLastMeasureByType createReadLastMeasureByType() {
        return new ReadLastMeasureByType();
    }

    /**
     * Create an instance of {@link Person.HealthProfile }
     * 
     */
    public Person.HealthProfile createPersonHealthProfile() {
        return new Person.HealthProfile();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "deleteMeasureResponse")
    public JAXBElement<DeleteMeasureResponse> createDeleteMeasureResponse(DeleteMeasureResponse value) {
        return new JAXBElement<DeleteMeasureResponse>(_DeleteMeasureResponse_QNAME, DeleteMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "measureType")
    public JAXBElement<MeasureType> createMeasureType(MeasureType value) {
        return new JAXBElement<MeasureType>(_MeasureType_QNAME, MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "getGoalHistory")
    public JAXBElement<GetGoalHistory> createGetGoalHistory(GetGoalHistory value) {
        return new JAXBElement<GetGoalHistory>(_GetGoalHistory_QNAME, GetGoalHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "readGoalResponse")
    public JAXBElement<ReadGoalResponse> createReadGoalResponse(ReadGoalResponse value) {
        return new JAXBElement<ReadGoalResponse>(_ReadGoalResponse_QNAME, ReadGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "createMeasureResponse")
    public JAXBElement<CreateMeasureResponse> createCreateMeasureResponse(CreateMeasureResponse value) {
        return new JAXBElement<CreateMeasureResponse>(_CreateMeasureResponse_QNAME, CreateMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadLastMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "readLastMeasureResponse")
    public JAXBElement<ReadLastMeasureResponse> createReadLastMeasureResponse(ReadLastMeasureResponse value) {
        return new JAXBElement<ReadLastMeasureResponse>(_ReadLastMeasureResponse_QNAME, ReadLastMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "readMeasureType")
    public JAXBElement<ReadMeasureType> createReadMeasureType(ReadMeasureType value) {
        return new JAXBElement<ReadMeasureType>(_ReadMeasureType_QNAME, ReadMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "getMeasureHistory")
    public JAXBElement<GetMeasureHistory> createGetMeasureHistory(GetMeasureHistory value) {
        return new JAXBElement<GetMeasureHistory>(_GetMeasureHistory_QNAME, GetMeasureHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "readMeasureResponse")
    public JAXBElement<ReadMeasureResponse> createReadMeasureResponse(ReadMeasureResponse value) {
        return new JAXBElement<ReadMeasureResponse>(_ReadMeasureResponse_QNAME, ReadMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureTypeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "getMeasureTypeList")
    public JAXBElement<GetMeasureTypeList> createGetMeasureTypeList(GetMeasureTypeList value) {
        return new JAXBElement<GetMeasureTypeList>(_GetMeasureTypeList_QNAME, GetMeasureTypeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "deleteGoalResponse")
    public JAXBElement<DeleteGoalResponse> createDeleteGoalResponse(DeleteGoalResponse value) {
        return new JAXBElement<DeleteGoalResponse>(_DeleteGoalResponse_QNAME, DeleteGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPeopleList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "getPeopleList")
    public JAXBElement<GetPeopleList> createGetPeopleList(GetPeopleList value) {
        return new JAXBElement<GetPeopleList>(_GetPeopleList_QNAME, GetPeopleList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadLastMeasureByType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "readLastMeasureByType")
    public JAXBElement<ReadLastMeasureByType> createReadLastMeasureByType(ReadLastMeasureByType value) {
        return new JAXBElement<ReadLastMeasureByType>(_ReadLastMeasureByType_QNAME, ReadLastMeasureByType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "getGoalsResponse")
    public JAXBElement<GetGoalsResponse> createGetGoalsResponse(GetGoalsResponse value) {
        return new JAXBElement<GetGoalsResponse>(_GetGoalsResponse_QNAME, GetGoalsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "updateMeasureResponse")
    public JAXBElement<UpdateMeasureResponse> createUpdateMeasureResponse(UpdateMeasureResponse value) {
        return new JAXBElement<UpdateMeasureResponse>(_UpdateMeasureResponse_QNAME, UpdateMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "deleteGoal")
    public JAXBElement<DeleteGoal> createDeleteGoal(DeleteGoal value) {
        return new JAXBElement<DeleteGoal>(_DeleteGoal_QNAME, DeleteGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoals }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "getGoals")
    public JAXBElement<GetGoals> createGetGoals(GetGoals value) {
        return new JAXBElement<GetGoals>(_GetGoals_QNAME, GetGoals.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPeopleListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "getPeopleListResponse")
    public JAXBElement<GetPeopleListResponse> createGetPeopleListResponse(GetPeopleListResponse value) {
        return new JAXBElement<GetPeopleListResponse>(_GetPeopleListResponse_QNAME, GetPeopleListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "readPersonResponse")
    public JAXBElement<ReadPersonResponse> createReadPersonResponse(ReadPersonResponse value) {
        return new JAXBElement<ReadPersonResponse>(_ReadPersonResponse_QNAME, ReadPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdMeasureTypeByTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "getIdMeasureTypeByTypeResponse")
    public JAXBElement<GetIdMeasureTypeByTypeResponse> createGetIdMeasureTypeByTypeResponse(GetIdMeasureTypeByTypeResponse value) {
        return new JAXBElement<GetIdMeasureTypeByTypeResponse>(_GetIdMeasureTypeByTypeResponse_QNAME, GetIdMeasureTypeByTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalTypeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "getGoalTypeList")
    public JAXBElement<GetGoalTypeList> createGetGoalTypeList(GetGoalTypeList value) {
        return new JAXBElement<GetGoalTypeList>(_GetGoalTypeList_QNAME, GetGoalTypeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "readGoalType")
    public JAXBElement<ReadGoalType> createReadGoalType(ReadGoalType value) {
        return new JAXBElement<ReadGoalType>(_ReadGoalType_QNAME, ReadGoalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoalTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "readGoalTypeResponse")
    public JAXBElement<ReadGoalTypeResponse> createReadGoalTypeResponse(ReadGoalTypeResponse value) {
        return new JAXBElement<ReadGoalTypeResponse>(_ReadGoalTypeResponse_QNAME, ReadGoalTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSomeMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "getSomeMeasureResponse")
    public JAXBElement<GetSomeMeasureResponse> createGetSomeMeasureResponse(GetSomeMeasureResponse value) {
        return new JAXBElement<GetSomeMeasureResponse>(_GetSomeMeasureResponse_QNAME, GetSomeMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureTypeListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "getMeasureTypeListResponse")
    public JAXBElement<GetMeasureTypeListResponse> createGetMeasureTypeListResponse(GetMeasureTypeListResponse value) {
        return new JAXBElement<GetMeasureTypeListResponse>(_GetMeasureTypeListResponse_QNAME, GetMeasureTypeListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "createPerson")
    public JAXBElement<CreatePerson> createCreatePerson(CreatePerson value) {
        return new JAXBElement<CreatePerson>(_CreatePerson_QNAME, CreatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadLastMeasureByTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "readLastMeasureByTypeResponse")
    public JAXBElement<ReadLastMeasureByTypeResponse> createReadLastMeasureByTypeResponse(ReadLastMeasureByTypeResponse value) {
        return new JAXBElement<ReadLastMeasureByTypeResponse>(_ReadLastMeasureByTypeResponse_QNAME, ReadLastMeasureByTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "createPersonResponse")
    public JAXBElement<CreatePersonResponse> createCreatePersonResponse(CreatePersonResponse value) {
        return new JAXBElement<CreatePersonResponse>(_CreatePersonResponse_QNAME, CreatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "goalType")
    public JAXBElement<GoalType> createGoalType(GoalType value) {
        return new JAXBElement<GoalType>(_GoalType_QNAME, GoalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSomeMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "getSomeMeasure")
    public JAXBElement<GetSomeMeasure> createGetSomeMeasure(GetSomeMeasure value) {
        return new JAXBElement<GetSomeMeasure>(_GetSomeMeasure_QNAME, GetSomeMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "getGoalHistoryResponse")
    public JAXBElement<GetGoalHistoryResponse> createGetGoalHistoryResponse(GetGoalHistoryResponse value) {
        return new JAXBElement<GetGoalHistoryResponse>(_GetGoalHistoryResponse_QNAME, GetGoalHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "createMeasure")
    public JAXBElement<CreateMeasure> createCreateMeasure(CreateMeasure value) {
        return new JAXBElement<CreateMeasure>(_CreateMeasure_QNAME, CreateMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "updateMeasure")
    public JAXBElement<UpdateMeasure> createUpdateMeasure(UpdateMeasure value) {
        return new JAXBElement<UpdateMeasure>(_UpdateMeasure_QNAME, UpdateMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadLastMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "readLastMeasure")
    public JAXBElement<ReadLastMeasure> createReadLastMeasure(ReadLastMeasure value) {
        return new JAXBElement<ReadLastMeasure>(_ReadLastMeasure_QNAME, ReadLastMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<DeletePersonResponse>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdMeasureTypeByType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "getIdMeasureTypeByType")
    public JAXBElement<GetIdMeasureTypeByType> createGetIdMeasureTypeByType(GetIdMeasureTypeByType value) {
        return new JAXBElement<GetIdMeasureTypeByType>(_GetIdMeasureTypeByType_QNAME, GetIdMeasureTypeByType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "getMeasureHistoryResponse")
    public JAXBElement<GetMeasureHistoryResponse> createGetMeasureHistoryResponse(GetMeasureHistoryResponse value) {
        return new JAXBElement<GetMeasureHistoryResponse>(_GetMeasureHistoryResponse_QNAME, GetMeasureHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "readGoal")
    public JAXBElement<ReadGoal> createReadGoal(ReadGoal value) {
        return new JAXBElement<ReadGoal>(_ReadGoal_QNAME, ReadGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "deleteMeasure")
    public JAXBElement<DeleteMeasure> createDeleteMeasure(DeleteMeasure value) {
        return new JAXBElement<DeleteMeasure>(_DeleteMeasure_QNAME, DeleteMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalByTitleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "getGoalByTitleResponse")
    public JAXBElement<GetGoalByTitleResponse> createGetGoalByTitleResponse(GetGoalByTitleResponse value) {
        return new JAXBElement<GetGoalByTitleResponse>(_GetGoalByTitleResponse_QNAME, GetGoalByTitleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalByTitle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "getGoalByTitle")
    public JAXBElement<GetGoalByTitle> createGetGoalByTitle(GetGoalByTitle value) {
        return new JAXBElement<GetGoalByTitle>(_GetGoalByTitle_QNAME, GetGoalByTitle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "createGoal")
    public JAXBElement<CreateGoal> createCreateGoal(CreateGoal value) {
        return new JAXBElement<CreateGoal>(_CreateGoal_QNAME, CreateGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "readPerson")
    public JAXBElement<ReadPerson> createReadPerson(ReadPerson value) {
        return new JAXBElement<ReadPerson>(_ReadPerson_QNAME, ReadPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "createGoalResponse")
    public JAXBElement<CreateGoalResponse> createCreateGoalResponse(CreateGoalResponse value) {
        return new JAXBElement<CreateGoalResponse>(_CreateGoalResponse_QNAME, CreateGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Measure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "measure")
    public JAXBElement<Measure> createMeasure(Measure value) {
        return new JAXBElement<Measure>(_Measure_QNAME, Measure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "readMeasure")
    public JAXBElement<ReadMeasure> createReadMeasure(ReadMeasure value) {
        return new JAXBElement<ReadMeasure>(_ReadMeasure_QNAME, ReadMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "readMeasureTypeResponse")
    public JAXBElement<ReadMeasureTypeResponse> createReadMeasureTypeResponse(ReadMeasureTypeResponse value) {
        return new JAXBElement<ReadMeasureTypeResponse>(_ReadMeasureTypeResponse_QNAME, ReadMeasureTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "updateGoal")
    public JAXBElement<UpdateGoal> createUpdateGoal(UpdateGoal value) {
        return new JAXBElement<UpdateGoal>(_UpdateGoal_QNAME, UpdateGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalTypeListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "getGoalTypeListResponse")
    public JAXBElement<GetGoalTypeListResponse> createGetGoalTypeListResponse(GetGoalTypeListResponse value) {
        return new JAXBElement<GetGoalTypeListResponse>(_GetGoalTypeListResponse_QNAME, GetGoalTypeListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Goal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "goal")
    public JAXBElement<Goal> createGoal(Goal value) {
        return new JAXBElement<Goal>(_Goal_QNAME, Goal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "updateGoalResponse")
    public JAXBElement<UpdateGoalResponse> createUpdateGoalResponse(UpdateGoalResponse value) {
        return new JAXBElement<UpdateGoalResponse>(_UpdateGoalResponse_QNAME, UpdateGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<DeletePerson>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

}
