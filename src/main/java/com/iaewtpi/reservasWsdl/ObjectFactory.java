
package com.iaewtpi.reservasWsdl;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.iaewtpi.reservasWsdl package. 
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

    private final static QName _StatusResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.ExceptionHandling", "StatusResponse");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _ConsultarCiudadesRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", "ConsultarCiudadesRequest");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _ConsultarVehiculosRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", "ConsultarVehiculosRequest");
    private final static QName _ArrayOfCiudadEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", "ArrayOfCiudadEntity");
    private final static QName _ArrayOfReservaEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", "ArrayOfReservaEntity");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _ConsultarVehiculosDisponiblesResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", "ConsultarVehiculosDisponiblesResponse");
    private final static QName _ConsultarCiudadesResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", "ConsultarCiudadesResponse");
    private final static QName _ConsultarReservasResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", "ConsultarReservasResponse");
    private final static QName _ConsultarReservasRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", "ConsultarReservasRequest");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _CancelarReservaResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", "CancelarReservaResponse");
    private final static QName _CiudadEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", "CiudadEntity");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _ArrayOfVehiculoModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", "ArrayOfVehiculoModel");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _VehiculoEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", "VehiculoEntity");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _ReservaEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", "ReservaEntity");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _EstadoReservaEnum_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", "EstadoReservaEnum");
    private final static QName _VehiculoPorCiudadEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", "VehiculoPorCiudadEntity");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _PaisEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", "PaisEntity");
    private final static QName _ReservarVehiculoRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", "ReservarVehiculoRequest");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _CancelarReservaRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", "CancelarReservaRequest");
    private final static QName _ConsultarPaisesResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", "ConsultarPaisesResponse");
    private final static QName _LugarRetiroDevolucion_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", "LugarRetiroDevolucion");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _ArrayOfPaisEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", "ArrayOfPaisEntity");
    private final static QName _VehiculoModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", "VehiculoModel");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _ReservarVehiculoResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", "ReservarVehiculoResponse");
    private final static QName _ConsultarCiudadesResponse2Ciudades_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", "Ciudades");
    private final static QName _ReservarVehiculoRequestNroDocumentoCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", "NroDocumentoCliente");
    private final static QName _ReservarVehiculoRequestApellidoNombreCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", "ApellidoNombreCliente");
    private final static QName _ReservarVehiculoResponseReservarVehiculoResult_QNAME = new QName("http://tempuri.org/", "ReservarVehiculoResult");
    private final static QName _ReservarVehiculoReservarVehiculoRequest_QNAME = new QName("http://tempuri.org/", "ReservarVehiculoRequest");
    private final static QName _ConsultarReservasConsultarReservasRequest_QNAME = new QName("http://tempuri.org/", "ConsultarReservasRequest");
    private final static QName _CancelarReservaResponse2Reserva_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", "Reserva");
    private final static QName _CancelarReservaCancelarReservaRequest_QNAME = new QName("http://tempuri.org/", "CancelarReservaRequest");
    private final static QName _CiudadEntityNombre_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", "Nombre");
    private final static QName _CancelarReservaResponseCancelarReservaResult_QNAME = new QName("http://tempuri.org/", "CancelarReservaResult");
    private final static QName _ConsultarVehiculosDisponiblesResponse2VehiculosEncontrados_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", "VehiculosEncontrados");
    private final static QName _CancelarReservaRequestCodigoReserva_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", "CodigoReserva");
    private final static QName _ReservaEntityApellidoNombreCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", "ApellidoNombreCliente");
    private final static QName _ReservaEntityUsuarioCancelacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", "UsuarioCancelacion");
    private final static QName _ReservaEntityLugarDevolucion_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", "LugarDevolucion");
    private final static QName _ReservaEntityLugarRetiro_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", "LugarRetiro");
    private final static QName _ReservaEntityFechaCancelacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", "FechaCancelacion");
    private final static QName _ReservaEntityCodigoReserva_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", "CodigoReserva");
    private final static QName _ReservaEntityNroDocumentoCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", "NroDocumentoCliente");
    private final static QName _ReservaEntityUsuarioReserva_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", "UsuarioReserva");
    private final static QName _ConsultarCiudadesConsultarCiudadesRequest_QNAME = new QName("http://tempuri.org/", "ConsultarCiudadesRequest");
    private final static QName _ConsultarVehiculosDisponiblesResponseConsultarVehiculosDisponiblesResult_QNAME = new QName("http://tempuri.org/", "ConsultarVehiculosDisponiblesResult");
    private final static QName _ConsultarReservasResponse2Reservas_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", "Reservas");
    private final static QName _VehiculoModelMarca_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", "Marca");
    private final static QName _VehiculoModelModelo_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", "Modelo");
    private final static QName _VehiculoModelTipoCambio_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", "TipoCambio");
    private final static QName _VehiculoModelPuntaje_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", "Puntaje");
    private final static QName _ConsultarVehiculosDisponiblesConsultarVehiculosRequest_QNAME = new QName("http://tempuri.org/", "ConsultarVehiculosRequest");
    private final static QName _StatusResponseErrorDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.ExceptionHandling", "ErrorDescription");
    private final static QName _StatusResponseInnerExceptionDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.ExceptionHandling", "InnerExceptionDescription");
    private final static QName _VehiculoEntityTipoCambio_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", "TipoCambio");
    private final static QName _VehiculoEntityPuntaje_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", "Puntaje");
    private final static QName _VehiculoEntityMarca_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", "Marca");
    private final static QName _VehiculoEntityModelo_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", "Modelo");
    private final static QName _ConsultarReservasResponseConsultarReservasResult_QNAME = new QName("http://tempuri.org/", "ConsultarReservasResult");
    private final static QName _ConsultarPaisesResponse2Paises_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", "Paises");
    private final static QName _ConsultarPaisesResponseConsultarPaisesResult_QNAME = new QName("http://tempuri.org/", "ConsultarPaisesResult");
    private final static QName _ConsultarCiudadesResponseConsultarCiudadesResult_QNAME = new QName("http://tempuri.org/", "ConsultarCiudadesResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.iaewtpi.reservasWsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StatusResponse }
     * 
     */
    public StatusResponse createStatusResponse() {
        return new StatusResponse();
    }

    /**
     * Create an instance of {@link VehiculoPorCiudadEntity }
     * 
     */
    public VehiculoPorCiudadEntity createVehiculoPorCiudadEntity() {
        return new VehiculoPorCiudadEntity();
    }

    /**
     * Create an instance of {@link CiudadEntity }
     * 
     */
    public CiudadEntity createCiudadEntity() {
        return new CiudadEntity();
    }

    /**
     * Create an instance of {@link ArrayOfCiudadEntity }
     * 
     */
    public ArrayOfCiudadEntity createArrayOfCiudadEntity() {
        return new ArrayOfCiudadEntity();
    }

    /**
     * Create an instance of {@link PaisEntity }
     * 
     */
    public PaisEntity createPaisEntity() {
        return new PaisEntity();
    }

    /**
     * Create an instance of {@link ArrayOfReservaEntity }
     * 
     */
    public ArrayOfReservaEntity createArrayOfReservaEntity() {
        return new ArrayOfReservaEntity();
    }

    /**
     * Create an instance of {@link VehiculoEntity }
     * 
     */
    public VehiculoEntity createVehiculoEntity() {
        return new VehiculoEntity();
    }

    /**
     * Create an instance of {@link ReservaEntity }
     * 
     */
    public ReservaEntity createReservaEntity() {
        return new ReservaEntity();
    }

    /**
     * Create an instance of {@link ArrayOfPaisEntity }
     * 
     */
    public ArrayOfPaisEntity createArrayOfPaisEntity() {
        return new ArrayOfPaisEntity();
    }

    /**
     * Create an instance of {@link ConsultarPaisesResponse }
     * 
     */
    public ConsultarPaisesResponse createConsultarPaisesResponse() {
        return new ConsultarPaisesResponse();
    }

    /**
     * Create an instance of {@link ConsultarPaisesResponse2 }
     * 
     */
    public ConsultarPaisesResponse2 createConsultarPaisesResponse2() {
        return new ConsultarPaisesResponse2();
    }

    /**
     * Create an instance of {@link ConsultarReservasResponse }
     * 
     */
    public ConsultarReservasResponse createConsultarReservasResponse() {
        return new ConsultarReservasResponse();
    }

    /**
     * Create an instance of {@link ConsultarReservasResponse2 }
     * 
     */
    public ConsultarReservasResponse2 createConsultarReservasResponse2() {
        return new ConsultarReservasResponse2();
    }

    /**
     * Create an instance of {@link CancelarReserva }
     * 
     */
    public CancelarReserva createCancelarReserva() {
        return new CancelarReserva();
    }

    /**
     * Create an instance of {@link CancelarReservaRequest }
     * 
     */
    public CancelarReservaRequest createCancelarReservaRequest() {
        return new CancelarReservaRequest();
    }

    /**
     * Create an instance of {@link ConsultarCiudades }
     * 
     */
    public ConsultarCiudades createConsultarCiudades() {
        return new ConsultarCiudades();
    }

    /**
     * Create an instance of {@link ConsultarCiudadesRequest }
     * 
     */
    public ConsultarCiudadesRequest createConsultarCiudadesRequest() {
        return new ConsultarCiudadesRequest();
    }

    /**
     * Create an instance of {@link ReservarVehiculo }
     * 
     */
    public ReservarVehiculo createReservarVehiculo() {
        return new ReservarVehiculo();
    }

    /**
     * Create an instance of {@link ReservarVehiculoRequest }
     * 
     */
    public ReservarVehiculoRequest createReservarVehiculoRequest() {
        return new ReservarVehiculoRequest();
    }

    /**
     * Create an instance of {@link CancelarReservaResponse }
     * 
     */
    public CancelarReservaResponse createCancelarReservaResponse() {
        return new CancelarReservaResponse();
    }

    /**
     * Create an instance of {@link CancelarReservaResponse2 }
     * 
     */
    public CancelarReservaResponse2 createCancelarReservaResponse2() {
        return new CancelarReservaResponse2();
    }

    /**
     * Create an instance of {@link ConsultarVehiculosDisponiblesResponse }
     * 
     */
    public ConsultarVehiculosDisponiblesResponse createConsultarVehiculosDisponiblesResponse() {
        return new ConsultarVehiculosDisponiblesResponse();
    }

    /**
     * Create an instance of {@link ConsultarVehiculosDisponiblesResponse2 }
     * 
     */
    public ConsultarVehiculosDisponiblesResponse2 createConsultarVehiculosDisponiblesResponse2() {
        return new ConsultarVehiculosDisponiblesResponse2();
    }

    /**
     * Create an instance of {@link ConsultarCiudadesResponse }
     * 
     */
    public ConsultarCiudadesResponse createConsultarCiudadesResponse() {
        return new ConsultarCiudadesResponse();
    }

    /**
     * Create an instance of {@link ConsultarCiudadesResponse2 }
     * 
     */
    public ConsultarCiudadesResponse2 createConsultarCiudadesResponse2() {
        return new ConsultarCiudadesResponse2();
    }

    /**
     * Create an instance of {@link ConsultarVehiculosDisponibles }
     * 
     */
    public ConsultarVehiculosDisponibles createConsultarVehiculosDisponibles() {
        return new ConsultarVehiculosDisponibles();
    }

    /**
     * Create an instance of {@link ConsultarVehiculosRequest }
     * 
     */
    public ConsultarVehiculosRequest createConsultarVehiculosRequest() {
        return new ConsultarVehiculosRequest();
    }

    /**
     * Create an instance of {@link ReservarVehiculoResponse }
     * 
     */
    public ReservarVehiculoResponse createReservarVehiculoResponse() {
        return new ReservarVehiculoResponse();
    }

    /**
     * Create an instance of {@link ReservarVehiculoResponse2 }
     * 
     */
    public ReservarVehiculoResponse2 createReservarVehiculoResponse2() {
        return new ReservarVehiculoResponse2();
    }

    /**
     * Create an instance of {@link ConsultarReservas }
     * 
     */
    public ConsultarReservas createConsultarReservas() {
        return new ConsultarReservas();
    }

    /**
     * Create an instance of {@link ConsultarReservasRequest }
     * 
     */
    public ConsultarReservasRequest createConsultarReservasRequest() {
        return new ConsultarReservasRequest();
    }

    /**
     * Create an instance of {@link ConsultarPaises }
     * 
     */
    public ConsultarPaises createConsultarPaises() {
        return new ConsultarPaises();
    }

    /**
     * Create an instance of {@link VehiculoModel }
     * 
     */
    public VehiculoModel createVehiculoModel() {
        return new VehiculoModel();
    }

    /**
     * Create an instance of {@link ArrayOfVehiculoModel }
     * 
     */
    public ArrayOfVehiculoModel createArrayOfVehiculoModel() {
        return new ArrayOfVehiculoModel();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.ExceptionHandling", name = "StatusResponse")
    public JAXBElement<StatusResponse> createStatusResponse(StatusResponse value) {
        return new JAXBElement<StatusResponse>(_StatusResponse_QNAME, StatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarCiudadesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", name = "ConsultarCiudadesRequest")
    public JAXBElement<ConsultarCiudadesRequest> createConsultarCiudadesRequest(ConsultarCiudadesRequest value) {
        return new JAXBElement<ConsultarCiudadesRequest>(_ConsultarCiudadesRequest_QNAME, ConsultarCiudadesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarVehiculosRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", name = "ConsultarVehiculosRequest")
    public JAXBElement<ConsultarVehiculosRequest> createConsultarVehiculosRequest(ConsultarVehiculosRequest value) {
        return new JAXBElement<ConsultarVehiculosRequest>(_ConsultarVehiculosRequest_QNAME, ConsultarVehiculosRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCiudadEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", name = "ArrayOfCiudadEntity")
    public JAXBElement<ArrayOfCiudadEntity> createArrayOfCiudadEntity(ArrayOfCiudadEntity value) {
        return new JAXBElement<ArrayOfCiudadEntity>(_ArrayOfCiudadEntity_QNAME, ArrayOfCiudadEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReservaEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", name = "ArrayOfReservaEntity")
    public JAXBElement<ArrayOfReservaEntity> createArrayOfReservaEntity(ArrayOfReservaEntity value) {
        return new JAXBElement<ArrayOfReservaEntity>(_ArrayOfReservaEntity_QNAME, ArrayOfReservaEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarVehiculosDisponiblesResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", name = "ConsultarVehiculosDisponiblesResponse")
    public JAXBElement<ConsultarVehiculosDisponiblesResponse2> createConsultarVehiculosDisponiblesResponse(ConsultarVehiculosDisponiblesResponse2 value) {
        return new JAXBElement<ConsultarVehiculosDisponiblesResponse2>(_ConsultarVehiculosDisponiblesResponse_QNAME, ConsultarVehiculosDisponiblesResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarCiudadesResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", name = "ConsultarCiudadesResponse")
    public JAXBElement<ConsultarCiudadesResponse2> createConsultarCiudadesResponse(ConsultarCiudadesResponse2 value) {
        return new JAXBElement<ConsultarCiudadesResponse2>(_ConsultarCiudadesResponse_QNAME, ConsultarCiudadesResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarReservasResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", name = "ConsultarReservasResponse")
    public JAXBElement<ConsultarReservasResponse2> createConsultarReservasResponse(ConsultarReservasResponse2 value) {
        return new JAXBElement<ConsultarReservasResponse2>(_ConsultarReservasResponse_QNAME, ConsultarReservasResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarReservasRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", name = "ConsultarReservasRequest")
    public JAXBElement<ConsultarReservasRequest> createConsultarReservasRequest(ConsultarReservasRequest value) {
        return new JAXBElement<ConsultarReservasRequest>(_ConsultarReservasRequest_QNAME, ConsultarReservasRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarReservaResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", name = "CancelarReservaResponse")
    public JAXBElement<CancelarReservaResponse2> createCancelarReservaResponse(CancelarReservaResponse2 value) {
        return new JAXBElement<CancelarReservaResponse2>(_CancelarReservaResponse_QNAME, CancelarReservaResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CiudadEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", name = "CiudadEntity")
    public JAXBElement<CiudadEntity> createCiudadEntity(CiudadEntity value) {
        return new JAXBElement<CiudadEntity>(_CiudadEntity_QNAME, CiudadEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVehiculoModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", name = "ArrayOfVehiculoModel")
    public JAXBElement<ArrayOfVehiculoModel> createArrayOfVehiculoModel(ArrayOfVehiculoModel value) {
        return new JAXBElement<ArrayOfVehiculoModel>(_ArrayOfVehiculoModel_QNAME, ArrayOfVehiculoModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehiculoEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", name = "VehiculoEntity")
    public JAXBElement<VehiculoEntity> createVehiculoEntity(VehiculoEntity value) {
        return new JAXBElement<VehiculoEntity>(_VehiculoEntity_QNAME, VehiculoEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservaEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", name = "ReservaEntity")
    public JAXBElement<ReservaEntity> createReservaEntity(ReservaEntity value) {
        return new JAXBElement<ReservaEntity>(_ReservaEntity_QNAME, ReservaEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstadoReservaEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", name = "EstadoReservaEnum")
    public JAXBElement<EstadoReservaEnum> createEstadoReservaEnum(EstadoReservaEnum value) {
        return new JAXBElement<EstadoReservaEnum>(_EstadoReservaEnum_QNAME, EstadoReservaEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehiculoPorCiudadEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", name = "VehiculoPorCiudadEntity")
    public JAXBElement<VehiculoPorCiudadEntity> createVehiculoPorCiudadEntity(VehiculoPorCiudadEntity value) {
        return new JAXBElement<VehiculoPorCiudadEntity>(_VehiculoPorCiudadEntity_QNAME, VehiculoPorCiudadEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaisEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", name = "PaisEntity")
    public JAXBElement<PaisEntity> createPaisEntity(PaisEntity value) {
        return new JAXBElement<PaisEntity>(_PaisEntity_QNAME, PaisEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservarVehiculoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", name = "ReservarVehiculoRequest")
    public JAXBElement<ReservarVehiculoRequest> createReservarVehiculoRequest(ReservarVehiculoRequest value) {
        return new JAXBElement<ReservarVehiculoRequest>(_ReservarVehiculoRequest_QNAME, ReservarVehiculoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarReservaRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", name = "CancelarReservaRequest")
    public JAXBElement<CancelarReservaRequest> createCancelarReservaRequest(CancelarReservaRequest value) {
        return new JAXBElement<CancelarReservaRequest>(_CancelarReservaRequest_QNAME, CancelarReservaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPaisesResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", name = "ConsultarPaisesResponse")
    public JAXBElement<ConsultarPaisesResponse2> createConsultarPaisesResponse(ConsultarPaisesResponse2 value) {
        return new JAXBElement<ConsultarPaisesResponse2>(_ConsultarPaisesResponse_QNAME, ConsultarPaisesResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LugarRetiroDevolucion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", name = "LugarRetiroDevolucion")
    public JAXBElement<LugarRetiroDevolucion> createLugarRetiroDevolucion(LugarRetiroDevolucion value) {
        return new JAXBElement<LugarRetiroDevolucion>(_LugarRetiroDevolucion_QNAME, LugarRetiroDevolucion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPaisEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", name = "ArrayOfPaisEntity")
    public JAXBElement<ArrayOfPaisEntity> createArrayOfPaisEntity(ArrayOfPaisEntity value) {
        return new JAXBElement<ArrayOfPaisEntity>(_ArrayOfPaisEntity_QNAME, ArrayOfPaisEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehiculoModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", name = "VehiculoModel")
    public JAXBElement<VehiculoModel> createVehiculoModel(VehiculoModel value) {
        return new JAXBElement<VehiculoModel>(_VehiculoModel_QNAME, VehiculoModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservarVehiculoResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", name = "ReservarVehiculoResponse")
    public JAXBElement<ReservarVehiculoResponse2> createReservarVehiculoResponse(ReservarVehiculoResponse2 value) {
        return new JAXBElement<ReservarVehiculoResponse2>(_ReservarVehiculoResponse_QNAME, ReservarVehiculoResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCiudadEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", name = "Ciudades", scope = ConsultarCiudadesResponse2 .class)
    public JAXBElement<ArrayOfCiudadEntity> createConsultarCiudadesResponse2Ciudades(ArrayOfCiudadEntity value) {
        return new JAXBElement<ArrayOfCiudadEntity>(_ConsultarCiudadesResponse2Ciudades_QNAME, ArrayOfCiudadEntity.class, ConsultarCiudadesResponse2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", name = "NroDocumentoCliente", scope = ReservarVehiculoRequest.class)
    public JAXBElement<String> createReservarVehiculoRequestNroDocumentoCliente(String value) {
        return new JAXBElement<String>(_ReservarVehiculoRequestNroDocumentoCliente_QNAME, String.class, ReservarVehiculoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", name = "ApellidoNombreCliente", scope = ReservarVehiculoRequest.class)
    public JAXBElement<String> createReservarVehiculoRequestApellidoNombreCliente(String value) {
        return new JAXBElement<String>(_ReservarVehiculoRequestApellidoNombreCliente_QNAME, String.class, ReservarVehiculoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservarVehiculoResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ReservarVehiculoResult", scope = ReservarVehiculoResponse.class)
    public JAXBElement<ReservarVehiculoResponse2> createReservarVehiculoResponseReservarVehiculoResult(ReservarVehiculoResponse2 value) {
        return new JAXBElement<ReservarVehiculoResponse2>(_ReservarVehiculoResponseReservarVehiculoResult_QNAME, ReservarVehiculoResponse2 .class, ReservarVehiculoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservarVehiculoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ReservarVehiculoRequest", scope = ReservarVehiculo.class)
    public JAXBElement<ReservarVehiculoRequest> createReservarVehiculoReservarVehiculoRequest(ReservarVehiculoRequest value) {
        return new JAXBElement<ReservarVehiculoRequest>(_ReservarVehiculoReservarVehiculoRequest_QNAME, ReservarVehiculoRequest.class, ReservarVehiculo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarReservasRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConsultarReservasRequest", scope = ConsultarReservas.class)
    public JAXBElement<ConsultarReservasRequest> createConsultarReservasConsultarReservasRequest(ConsultarReservasRequest value) {
        return new JAXBElement<ConsultarReservasRequest>(_ConsultarReservasConsultarReservasRequest_QNAME, ConsultarReservasRequest.class, ConsultarReservas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservaEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", name = "Reserva", scope = CancelarReservaResponse2 .class)
    public JAXBElement<ReservaEntity> createCancelarReservaResponse2Reserva(ReservaEntity value) {
        return new JAXBElement<ReservaEntity>(_CancelarReservaResponse2Reserva_QNAME, ReservaEntity.class, CancelarReservaResponse2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarReservaRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CancelarReservaRequest", scope = CancelarReserva.class)
    public JAXBElement<CancelarReservaRequest> createCancelarReservaCancelarReservaRequest(CancelarReservaRequest value) {
        return new JAXBElement<CancelarReservaRequest>(_CancelarReservaCancelarReservaRequest_QNAME, CancelarReservaRequest.class, CancelarReserva.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", name = "Nombre", scope = CiudadEntity.class)
    public JAXBElement<String> createCiudadEntityNombre(String value) {
        return new JAXBElement<String>(_CiudadEntityNombre_QNAME, String.class, CiudadEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaisEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", name = "PaisEntity", scope = CiudadEntity.class)
    public JAXBElement<PaisEntity> createCiudadEntityPaisEntity(PaisEntity value) {
        return new JAXBElement<PaisEntity>(_PaisEntity_QNAME, PaisEntity.class, CiudadEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarReservaResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CancelarReservaResult", scope = CancelarReservaResponse.class)
    public JAXBElement<CancelarReservaResponse2> createCancelarReservaResponseCancelarReservaResult(CancelarReservaResponse2 value) {
        return new JAXBElement<CancelarReservaResponse2>(_CancelarReservaResponseCancelarReservaResult_QNAME, CancelarReservaResponse2 .class, CancelarReservaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVehiculoModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", name = "VehiculosEncontrados", scope = ConsultarVehiculosDisponiblesResponse2 .class)
    public JAXBElement<ArrayOfVehiculoModel> createConsultarVehiculosDisponiblesResponse2VehiculosEncontrados(ArrayOfVehiculoModel value) {
        return new JAXBElement<ArrayOfVehiculoModel>(_ConsultarVehiculosDisponiblesResponse2VehiculosEncontrados_QNAME, ArrayOfVehiculoModel.class, ConsultarVehiculosDisponiblesResponse2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", name = "CodigoReserva", scope = CancelarReservaRequest.class)
    public JAXBElement<String> createCancelarReservaRequestCodigoReserva(String value) {
        return new JAXBElement<String>(_CancelarReservaRequestCodigoReserva_QNAME, String.class, CancelarReservaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", name = "ApellidoNombreCliente", scope = ReservaEntity.class)
    public JAXBElement<String> createReservaEntityApellidoNombreCliente(String value) {
        return new JAXBElement<String>(_ReservaEntityApellidoNombreCliente_QNAME, String.class, ReservaEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", name = "UsuarioCancelacion", scope = ReservaEntity.class)
    public JAXBElement<String> createReservaEntityUsuarioCancelacion(String value) {
        return new JAXBElement<String>(_ReservaEntityUsuarioCancelacion_QNAME, String.class, ReservaEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", name = "LugarDevolucion", scope = ReservaEntity.class)
    public JAXBElement<String> createReservaEntityLugarDevolucion(String value) {
        return new JAXBElement<String>(_ReservaEntityLugarDevolucion_QNAME, String.class, ReservaEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", name = "LugarRetiro", scope = ReservaEntity.class)
    public JAXBElement<String> createReservaEntityLugarRetiro(String value) {
        return new JAXBElement<String>(_ReservaEntityLugarRetiro_QNAME, String.class, ReservaEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", name = "FechaCancelacion", scope = ReservaEntity.class)
    public JAXBElement<XMLGregorianCalendar> createReservaEntityFechaCancelacion(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ReservaEntityFechaCancelacion_QNAME, XMLGregorianCalendar.class, ReservaEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", name = "CodigoReserva", scope = ReservaEntity.class)
    public JAXBElement<String> createReservaEntityCodigoReserva(String value) {
        return new JAXBElement<String>(_ReservaEntityCodigoReserva_QNAME, String.class, ReservaEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehiculoPorCiudadEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", name = "VehiculoPorCiudadEntity", scope = ReservaEntity.class)
    public JAXBElement<VehiculoPorCiudadEntity> createReservaEntityVehiculoPorCiudadEntity(VehiculoPorCiudadEntity value) {
        return new JAXBElement<VehiculoPorCiudadEntity>(_VehiculoPorCiudadEntity_QNAME, VehiculoPorCiudadEntity.class, ReservaEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", name = "NroDocumentoCliente", scope = ReservaEntity.class)
    public JAXBElement<String> createReservaEntityNroDocumentoCliente(String value) {
        return new JAXBElement<String>(_ReservaEntityNroDocumentoCliente_QNAME, String.class, ReservaEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", name = "UsuarioReserva", scope = ReservaEntity.class)
    public JAXBElement<String> createReservaEntityUsuarioReserva(String value) {
        return new JAXBElement<String>(_ReservaEntityUsuarioReserva_QNAME, String.class, ReservaEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarCiudadesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConsultarCiudadesRequest", scope = ConsultarCiudades.class)
    public JAXBElement<ConsultarCiudadesRequest> createConsultarCiudadesConsultarCiudadesRequest(ConsultarCiudadesRequest value) {
        return new JAXBElement<ConsultarCiudadesRequest>(_ConsultarCiudadesConsultarCiudadesRequest_QNAME, ConsultarCiudadesRequest.class, ConsultarCiudades.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarVehiculosDisponiblesResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConsultarVehiculosDisponiblesResult", scope = ConsultarVehiculosDisponiblesResponse.class)
    public JAXBElement<ConsultarVehiculosDisponiblesResponse2> createConsultarVehiculosDisponiblesResponseConsultarVehiculosDisponiblesResult(ConsultarVehiculosDisponiblesResponse2 value) {
        return new JAXBElement<ConsultarVehiculosDisponiblesResponse2>(_ConsultarVehiculosDisponiblesResponseConsultarVehiculosDisponiblesResult_QNAME, ConsultarVehiculosDisponiblesResponse2 .class, ConsultarVehiculosDisponiblesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReservaEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", name = "Reservas", scope = ConsultarReservasResponse2 .class)
    public JAXBElement<ArrayOfReservaEntity> createConsultarReservasResponse2Reservas(ArrayOfReservaEntity value) {
        return new JAXBElement<ArrayOfReservaEntity>(_ConsultarReservasResponse2Reservas_QNAME, ArrayOfReservaEntity.class, ConsultarReservasResponse2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", name = "Marca", scope = VehiculoModel.class)
    public JAXBElement<String> createVehiculoModelMarca(String value) {
        return new JAXBElement<String>(_VehiculoModelMarca_QNAME, String.class, VehiculoModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", name = "Modelo", scope = VehiculoModel.class)
    public JAXBElement<String> createVehiculoModelModelo(String value) {
        return new JAXBElement<String>(_VehiculoModelModelo_QNAME, String.class, VehiculoModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", name = "TipoCambio", scope = VehiculoModel.class)
    public JAXBElement<String> createVehiculoModelTipoCambio(String value) {
        return new JAXBElement<String>(_VehiculoModelTipoCambio_QNAME, String.class, VehiculoModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", name = "Puntaje", scope = VehiculoModel.class)
    public JAXBElement<String> createVehiculoModelPuntaje(String value) {
        return new JAXBElement<String>(_VehiculoModelPuntaje_QNAME, String.class, VehiculoModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarVehiculosRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConsultarVehiculosRequest", scope = ConsultarVehiculosDisponibles.class)
    public JAXBElement<ConsultarVehiculosRequest> createConsultarVehiculosDisponiblesConsultarVehiculosRequest(ConsultarVehiculosRequest value) {
        return new JAXBElement<ConsultarVehiculosRequest>(_ConsultarVehiculosDisponiblesConsultarVehiculosRequest_QNAME, ConsultarVehiculosRequest.class, ConsultarVehiculosDisponibles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservaEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", name = "Reserva", scope = ReservarVehiculoResponse2 .class)
    public JAXBElement<ReservaEntity> createReservarVehiculoResponse2Reserva(ReservaEntity value) {
        return new JAXBElement<ReservaEntity>(_CancelarReservaResponse2Reserva_QNAME, ReservaEntity.class, ReservarVehiculoResponse2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.ExceptionHandling", name = "ErrorDescription", scope = StatusResponse.class)
    public JAXBElement<String> createStatusResponseErrorDescription(String value) {
        return new JAXBElement<String>(_StatusResponseErrorDescription_QNAME, String.class, StatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.ExceptionHandling", name = "InnerExceptionDescription", scope = StatusResponse.class)
    public JAXBElement<String> createStatusResponseInnerExceptionDescription(String value) {
        return new JAXBElement<String>(_StatusResponseInnerExceptionDescription_QNAME, String.class, StatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", name = "TipoCambio", scope = VehiculoEntity.class)
    public JAXBElement<String> createVehiculoEntityTipoCambio(String value) {
        return new JAXBElement<String>(_VehiculoEntityTipoCambio_QNAME, String.class, VehiculoEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", name = "Puntaje", scope = VehiculoEntity.class)
    public JAXBElement<String> createVehiculoEntityPuntaje(String value) {
        return new JAXBElement<String>(_VehiculoEntityPuntaje_QNAME, String.class, VehiculoEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", name = "Marca", scope = VehiculoEntity.class)
    public JAXBElement<String> createVehiculoEntityMarca(String value) {
        return new JAXBElement<String>(_VehiculoEntityMarca_QNAME, String.class, VehiculoEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", name = "Modelo", scope = VehiculoEntity.class)
    public JAXBElement<String> createVehiculoEntityModelo(String value) {
        return new JAXBElement<String>(_VehiculoEntityModelo_QNAME, String.class, VehiculoEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarReservasResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConsultarReservasResult", scope = ConsultarReservasResponse.class)
    public JAXBElement<ConsultarReservasResponse2> createConsultarReservasResponseConsultarReservasResult(ConsultarReservasResponse2 value) {
        return new JAXBElement<ConsultarReservasResponse2>(_ConsultarReservasResponseConsultarReservasResult_QNAME, ConsultarReservasResponse2 .class, ConsultarReservasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPaisEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities", name = "Paises", scope = ConsultarPaisesResponse2 .class)
    public JAXBElement<ArrayOfPaisEntity> createConsultarPaisesResponse2Paises(ArrayOfPaisEntity value) {
        return new JAXBElement<ArrayOfPaisEntity>(_ConsultarPaisesResponse2Paises_QNAME, ArrayOfPaisEntity.class, ConsultarPaisesResponse2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CiudadEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", name = "CiudadEntity", scope = VehiculoPorCiudadEntity.class)
    public JAXBElement<CiudadEntity> createVehiculoPorCiudadEntityCiudadEntity(CiudadEntity value) {
        return new JAXBElement<CiudadEntity>(_CiudadEntity_QNAME, CiudadEntity.class, VehiculoPorCiudadEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehiculoEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", name = "VehiculoEntity", scope = VehiculoPorCiudadEntity.class)
    public JAXBElement<VehiculoEntity> createVehiculoPorCiudadEntityVehiculoEntity(VehiculoEntity value) {
        return new JAXBElement<VehiculoEntity>(_VehiculoEntity_QNAME, VehiculoEntity.class, VehiculoPorCiudadEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPaisesResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConsultarPaisesResult", scope = ConsultarPaisesResponse.class)
    public JAXBElement<ConsultarPaisesResponse2> createConsultarPaisesResponseConsultarPaisesResult(ConsultarPaisesResponse2 value) {
        return new JAXBElement<ConsultarPaisesResponse2>(_ConsultarPaisesResponseConsultarPaisesResult_QNAME, ConsultarPaisesResponse2 .class, ConsultarPaisesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.DataBaseModel", name = "Nombre", scope = PaisEntity.class)
    public JAXBElement<String> createPaisEntityNombre(String value) {
        return new JAXBElement<String>(_CiudadEntityNombre_QNAME, String.class, PaisEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarCiudadesResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConsultarCiudadesResult", scope = ConsultarCiudadesResponse.class)
    public JAXBElement<ConsultarCiudadesResponse2> createConsultarCiudadesResponseConsultarCiudadesResult(ConsultarCiudadesResponse2 value) {
        return new JAXBElement<ConsultarCiudadesResponse2>(_ConsultarCiudadesResponseConsultarCiudadesResult_QNAME, ConsultarCiudadesResponse2 .class, ConsultarCiudadesResponse.class, value);
    }

}
