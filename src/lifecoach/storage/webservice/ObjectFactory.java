
package lifecoach.storage.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lifecoach.storage.webservice package. 
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

    private final static QName _GetGoalTypeListResponse_QNAME = new QName("http://webservice.storage.lifecoach/", "getGoalTypeListResponse");
    private final static QName _GetLastMeasure_QNAME = new QName("http://webservice.storage.lifecoach/", "getLastMeasure");
    private final static QName _UpdateGoalResponse_QNAME = new QName("http://webservice.storage.lifecoach/", "updateGoalResponse");
    private final static QName _CreatePersonResponse_QNAME = new QName("http://webservice.storage.lifecoach/", "createPersonResponse");
    private final static QName _DeletePerson_QNAME = new QName("http://webservice.storage.lifecoach/", "deletePerson");
    private final static QName _GetMeasureTypeListResponse_QNAME = new QName("http://webservice.storage.lifecoach/", "getMeasureTypeListResponse");
    private final static QName _ReadMeasureTypeResponse_QNAME = new QName("http://webservice.storage.lifecoach/", "readMeasureTypeResponse");
    private final static QName _UpdateGoal_QNAME = new QName("http://webservice.storage.lifecoach/", "updateGoal");
    private final static QName _CreatePerson_QNAME = new QName("http://webservice.storage.lifecoach/", "createPerson");
    private final static QName _GetLastMeasureResponse_QNAME = new QName("http://webservice.storage.lifecoach/", "getLastMeasureResponse");
    private final static QName _ReadGoalType_QNAME = new QName("http://webservice.storage.lifecoach/", "readGoalType");
    private final static QName _GetGoalTypeList_QNAME = new QName("http://webservice.storage.lifecoach/", "getGoalTypeList");
    private final static QName _GetSomeMeasureResponse_QNAME = new QName("http://webservice.storage.lifecoach/", "getSomeMeasureResponse");
    private final static QName _ReadGoalTypeResponse_QNAME = new QName("http://webservice.storage.lifecoach/", "readGoalTypeResponse");
    private final static QName _ReadMeasure_QNAME = new QName("http://webservice.storage.lifecoach/", "readMeasure");
    private final static QName _ReadPersonResponse_QNAME = new QName("http://webservice.storage.lifecoach/", "readPersonResponse");
    private final static QName _CreateGoalResponse_QNAME = new QName("http://webservice.storage.lifecoach/", "createGoalResponse");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://webservice.storage.lifecoach/", "updatePersonResponse");
    private final static QName _ReadPerson_QNAME = new QName("http://webservice.storage.lifecoach/", "readPerson");
    private final static QName _UpdateMeasureResponse_QNAME = new QName("http://webservice.storage.lifecoach/", "updateMeasureResponse");
    private final static QName _CreateGoal_QNAME = new QName("http://webservice.storage.lifecoach/", "createGoal");
    private final static QName _DeleteGoal_QNAME = new QName("http://webservice.storage.lifecoach/", "deleteGoal");
    private final static QName _UpdatePerson_QNAME = new QName("http://webservice.storage.lifecoach/", "updatePerson");
    private final static QName _GetMeasureTypeList_QNAME = new QName("http://webservice.storage.lifecoach/", "getMeasureTypeList");
    private final static QName _DeleteGoalResponse_QNAME = new QName("http://webservice.storage.lifecoach/", "deleteGoalResponse");
    private final static QName _DeleteMeasure_QNAME = new QName("http://webservice.storage.lifecoach/", "deleteMeasure");
    private final static QName _ReadMeasureResponse_QNAME = new QName("http://webservice.storage.lifecoach/", "readMeasureResponse");
    private final static QName _ReadGoal_QNAME = new QName("http://webservice.storage.lifecoach/", "readGoal");
    private final static QName _GetMeasureHistoryResponse_QNAME = new QName("http://webservice.storage.lifecoach/", "getMeasureHistoryResponse");
    private final static QName _ReadMeasureType_QNAME = new QName("http://webservice.storage.lifecoach/", "readMeasureType");
    private final static QName _DeletePersonResponse_QNAME = new QName("http://webservice.storage.lifecoach/", "deletePersonResponse");
    private final static QName _GetMeasureHistory_QNAME = new QName("http://webservice.storage.lifecoach/", "getMeasureHistory");
    private final static QName _CreateMeasure_QNAME = new QName("http://webservice.storage.lifecoach/", "createMeasure");
    private final static QName _UpdateMeasure_QNAME = new QName("http://webservice.storage.lifecoach/", "updateMeasure");
    private final static QName _ReadGoalResponse_QNAME = new QName("http://webservice.storage.lifecoach/", "readGoalResponse");
    private final static QName _CreateMeasureResponse_QNAME = new QName("http://webservice.storage.lifecoach/", "createMeasureResponse");
    private final static QName _GetGoalHistoryResponse_QNAME = new QName("http://webservice.storage.lifecoach/", "getGoalHistoryResponse");
    private final static QName _DeleteMeasureResponse_QNAME = new QName("http://webservice.storage.lifecoach/", "deleteMeasureResponse");
    private final static QName _GetSomeMeasure_QNAME = new QName("http://webservice.storage.lifecoach/", "getSomeMeasure");
    private final static QName _GetGoalHistory_QNAME = new QName("http://webservice.storage.lifecoach/", "getGoalHistory");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lifecoach.storage.webservice
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link DeleteMeasure }
     * 
     */
    public DeleteMeasure createDeleteMeasure() {
        return new DeleteMeasure();
    }

    /**
     * Create an instance of {@link ReadMeasureResponse }
     * 
     */
    public ReadMeasureResponse createReadMeasureResponse() {
        return new ReadMeasureResponse();
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
     * Create an instance of {@link GetMeasureHistory }
     * 
     */
    public GetMeasureHistory createGetMeasureHistory() {
        return new GetMeasureHistory();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link ReadMeasureType }
     * 
     */
    public ReadMeasureType createReadMeasureType() {
        return new ReadMeasureType();
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
     * Create an instance of {@link CreateMeasureResponse }
     * 
     */
    public CreateMeasureResponse createCreateMeasureResponse() {
        return new CreateMeasureResponse();
    }

    /**
     * Create an instance of {@link GetGoalHistoryResponse }
     * 
     */
    public GetGoalHistoryResponse createGetGoalHistoryResponse() {
        return new GetGoalHistoryResponse();
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
     * Create an instance of {@link GetSomeMeasure }
     * 
     */
    public GetSomeMeasure createGetSomeMeasure() {
        return new GetSomeMeasure();
    }

    /**
     * Create an instance of {@link DeleteMeasureResponse }
     * 
     */
    public DeleteMeasureResponse createDeleteMeasureResponse() {
        return new DeleteMeasureResponse();
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link CreatePersonResponse }
     * 
     */
    public CreatePersonResponse createCreatePersonResponse() {
        return new CreatePersonResponse();
    }

    /**
     * Create an instance of {@link GetGoalTypeListResponse }
     * 
     */
    public GetGoalTypeListResponse createGetGoalTypeListResponse() {
        return new GetGoalTypeListResponse();
    }

    /**
     * Create an instance of {@link GetLastMeasure }
     * 
     */
    public GetLastMeasure createGetLastMeasure() {
        return new GetLastMeasure();
    }

    /**
     * Create an instance of {@link UpdateGoalResponse }
     * 
     */
    public UpdateGoalResponse createUpdateGoalResponse() {
        return new UpdateGoalResponse();
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
     * Create an instance of {@link GetLastMeasureResponse }
     * 
     */
    public GetLastMeasureResponse createGetLastMeasureResponse() {
        return new GetLastMeasureResponse();
    }

    /**
     * Create an instance of {@link ReadGoalType }
     * 
     */
    public ReadGoalType createReadGoalType() {
        return new ReadGoalType();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link CreateGoalResponse }
     * 
     */
    public CreateGoalResponse createCreateGoalResponse() {
        return new CreateGoalResponse();
    }

    /**
     * Create an instance of {@link ReadMeasure }
     * 
     */
    public ReadMeasure createReadMeasure() {
        return new ReadMeasure();
    }

    /**
     * Create an instance of {@link ReadPersonResponse }
     * 
     */
    public ReadPersonResponse createReadPersonResponse() {
        return new ReadPersonResponse();
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
     * Create an instance of {@link DeleteGoal }
     * 
     */
    public DeleteGoal createDeleteGoal() {
        return new DeleteGoal();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalTypeListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "getGoalTypeListResponse")
    public JAXBElement<GetGoalTypeListResponse> createGetGoalTypeListResponse(GetGoalTypeListResponse value) {
        return new JAXBElement<GetGoalTypeListResponse>(_GetGoalTypeListResponse_QNAME, GetGoalTypeListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "getLastMeasure")
    public JAXBElement<GetLastMeasure> createGetLastMeasure(GetLastMeasure value) {
        return new JAXBElement<GetLastMeasure>(_GetLastMeasure_QNAME, GetLastMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "updateGoalResponse")
    public JAXBElement<UpdateGoalResponse> createUpdateGoalResponse(UpdateGoalResponse value) {
        return new JAXBElement<UpdateGoalResponse>(_UpdateGoalResponse_QNAME, UpdateGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "createPersonResponse")
    public JAXBElement<CreatePersonResponse> createCreatePersonResponse(CreatePersonResponse value) {
        return new JAXBElement<CreatePersonResponse>(_CreatePersonResponse_QNAME, CreatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<DeletePerson>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureTypeListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "getMeasureTypeListResponse")
    public JAXBElement<GetMeasureTypeListResponse> createGetMeasureTypeListResponse(GetMeasureTypeListResponse value) {
        return new JAXBElement<GetMeasureTypeListResponse>(_GetMeasureTypeListResponse_QNAME, GetMeasureTypeListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "readMeasureTypeResponse")
    public JAXBElement<ReadMeasureTypeResponse> createReadMeasureTypeResponse(ReadMeasureTypeResponse value) {
        return new JAXBElement<ReadMeasureTypeResponse>(_ReadMeasureTypeResponse_QNAME, ReadMeasureTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "updateGoal")
    public JAXBElement<UpdateGoal> createUpdateGoal(UpdateGoal value) {
        return new JAXBElement<UpdateGoal>(_UpdateGoal_QNAME, UpdateGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "createPerson")
    public JAXBElement<CreatePerson> createCreatePerson(CreatePerson value) {
        return new JAXBElement<CreatePerson>(_CreatePerson_QNAME, CreatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "getLastMeasureResponse")
    public JAXBElement<GetLastMeasureResponse> createGetLastMeasureResponse(GetLastMeasureResponse value) {
        return new JAXBElement<GetLastMeasureResponse>(_GetLastMeasureResponse_QNAME, GetLastMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "readGoalType")
    public JAXBElement<ReadGoalType> createReadGoalType(ReadGoalType value) {
        return new JAXBElement<ReadGoalType>(_ReadGoalType_QNAME, ReadGoalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalTypeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "getGoalTypeList")
    public JAXBElement<GetGoalTypeList> createGetGoalTypeList(GetGoalTypeList value) {
        return new JAXBElement<GetGoalTypeList>(_GetGoalTypeList_QNAME, GetGoalTypeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSomeMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "getSomeMeasureResponse")
    public JAXBElement<GetSomeMeasureResponse> createGetSomeMeasureResponse(GetSomeMeasureResponse value) {
        return new JAXBElement<GetSomeMeasureResponse>(_GetSomeMeasureResponse_QNAME, GetSomeMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoalTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "readGoalTypeResponse")
    public JAXBElement<ReadGoalTypeResponse> createReadGoalTypeResponse(ReadGoalTypeResponse value) {
        return new JAXBElement<ReadGoalTypeResponse>(_ReadGoalTypeResponse_QNAME, ReadGoalTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "readMeasure")
    public JAXBElement<ReadMeasure> createReadMeasure(ReadMeasure value) {
        return new JAXBElement<ReadMeasure>(_ReadMeasure_QNAME, ReadMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "readPersonResponse")
    public JAXBElement<ReadPersonResponse> createReadPersonResponse(ReadPersonResponse value) {
        return new JAXBElement<ReadPersonResponse>(_ReadPersonResponse_QNAME, ReadPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "createGoalResponse")
    public JAXBElement<CreateGoalResponse> createCreateGoalResponse(CreateGoalResponse value) {
        return new JAXBElement<CreateGoalResponse>(_CreateGoalResponse_QNAME, CreateGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "readPerson")
    public JAXBElement<ReadPerson> createReadPerson(ReadPerson value) {
        return new JAXBElement<ReadPerson>(_ReadPerson_QNAME, ReadPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "updateMeasureResponse")
    public JAXBElement<UpdateMeasureResponse> createUpdateMeasureResponse(UpdateMeasureResponse value) {
        return new JAXBElement<UpdateMeasureResponse>(_UpdateMeasureResponse_QNAME, UpdateMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "createGoal")
    public JAXBElement<CreateGoal> createCreateGoal(CreateGoal value) {
        return new JAXBElement<CreateGoal>(_CreateGoal_QNAME, CreateGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "deleteGoal")
    public JAXBElement<DeleteGoal> createDeleteGoal(DeleteGoal value) {
        return new JAXBElement<DeleteGoal>(_DeleteGoal_QNAME, DeleteGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureTypeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "getMeasureTypeList")
    public JAXBElement<GetMeasureTypeList> createGetMeasureTypeList(GetMeasureTypeList value) {
        return new JAXBElement<GetMeasureTypeList>(_GetMeasureTypeList_QNAME, GetMeasureTypeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "deleteGoalResponse")
    public JAXBElement<DeleteGoalResponse> createDeleteGoalResponse(DeleteGoalResponse value) {
        return new JAXBElement<DeleteGoalResponse>(_DeleteGoalResponse_QNAME, DeleteGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "deleteMeasure")
    public JAXBElement<DeleteMeasure> createDeleteMeasure(DeleteMeasure value) {
        return new JAXBElement<DeleteMeasure>(_DeleteMeasure_QNAME, DeleteMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "readMeasureResponse")
    public JAXBElement<ReadMeasureResponse> createReadMeasureResponse(ReadMeasureResponse value) {
        return new JAXBElement<ReadMeasureResponse>(_ReadMeasureResponse_QNAME, ReadMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "readGoal")
    public JAXBElement<ReadGoal> createReadGoal(ReadGoal value) {
        return new JAXBElement<ReadGoal>(_ReadGoal_QNAME, ReadGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "getMeasureHistoryResponse")
    public JAXBElement<GetMeasureHistoryResponse> createGetMeasureHistoryResponse(GetMeasureHistoryResponse value) {
        return new JAXBElement<GetMeasureHistoryResponse>(_GetMeasureHistoryResponse_QNAME, GetMeasureHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "readMeasureType")
    public JAXBElement<ReadMeasureType> createReadMeasureType(ReadMeasureType value) {
        return new JAXBElement<ReadMeasureType>(_ReadMeasureType_QNAME, ReadMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<DeletePersonResponse>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "getMeasureHistory")
    public JAXBElement<GetMeasureHistory> createGetMeasureHistory(GetMeasureHistory value) {
        return new JAXBElement<GetMeasureHistory>(_GetMeasureHistory_QNAME, GetMeasureHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "createMeasure")
    public JAXBElement<CreateMeasure> createCreateMeasure(CreateMeasure value) {
        return new JAXBElement<CreateMeasure>(_CreateMeasure_QNAME, CreateMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "updateMeasure")
    public JAXBElement<UpdateMeasure> createUpdateMeasure(UpdateMeasure value) {
        return new JAXBElement<UpdateMeasure>(_UpdateMeasure_QNAME, UpdateMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "readGoalResponse")
    public JAXBElement<ReadGoalResponse> createReadGoalResponse(ReadGoalResponse value) {
        return new JAXBElement<ReadGoalResponse>(_ReadGoalResponse_QNAME, ReadGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "createMeasureResponse")
    public JAXBElement<CreateMeasureResponse> createCreateMeasureResponse(CreateMeasureResponse value) {
        return new JAXBElement<CreateMeasureResponse>(_CreateMeasureResponse_QNAME, CreateMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "getGoalHistoryResponse")
    public JAXBElement<GetGoalHistoryResponse> createGetGoalHistoryResponse(GetGoalHistoryResponse value) {
        return new JAXBElement<GetGoalHistoryResponse>(_GetGoalHistoryResponse_QNAME, GetGoalHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "deleteMeasureResponse")
    public JAXBElement<DeleteMeasureResponse> createDeleteMeasureResponse(DeleteMeasureResponse value) {
        return new JAXBElement<DeleteMeasureResponse>(_DeleteMeasureResponse_QNAME, DeleteMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSomeMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "getSomeMeasure")
    public JAXBElement<GetSomeMeasure> createGetSomeMeasure(GetSomeMeasure value) {
        return new JAXBElement<GetSomeMeasure>(_GetSomeMeasure_QNAME, GetSomeMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.lifecoach/", name = "getGoalHistory")
    public JAXBElement<GetGoalHistory> createGetGoalHistory(GetGoalHistory value) {
        return new JAXBElement<GetGoalHistory>(_GetGoalHistory_QNAME, GetGoalHistory.class, null, value);
    }

}
