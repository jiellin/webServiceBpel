/**
 * BookHotelServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws.travel.hotel;

public class BookHotelServiceServiceLocator extends org.apache.axis.client.Service implements ws.travel.hotel.BookHotelServiceService {

    public BookHotelServiceServiceLocator() {
    }


    public BookHotelServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BookHotelServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BookHotelService
    private java.lang.String BookHotelService_address = "http://localhost:8080/travel/services/BookHotelService";

    public java.lang.String getBookHotelServiceAddress() {
        return BookHotelService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BookHotelServiceWSDDServiceName = "BookHotelService";

    public java.lang.String getBookHotelServiceWSDDServiceName() {
        return BookHotelServiceWSDDServiceName;
    }

    public void setBookHotelServiceWSDDServiceName(java.lang.String name) {
        BookHotelServiceWSDDServiceName = name;
    }

    public ws.travel.hotel.BookHotelService getBookHotelService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BookHotelService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBookHotelService(endpoint);
    }

    public ws.travel.hotel.BookHotelService getBookHotelService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ws.travel.hotel.BookHotelServiceSoapBindingStub _stub = new ws.travel.hotel.BookHotelServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getBookHotelServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBookHotelServiceEndpointAddress(java.lang.String address) {
        BookHotelService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ws.travel.hotel.BookHotelService.class.isAssignableFrom(serviceEndpointInterface)) {
                ws.travel.hotel.BookHotelServiceSoapBindingStub _stub = new ws.travel.hotel.BookHotelServiceSoapBindingStub(new java.net.URL(BookHotelService_address), this);
                _stub.setPortName(getBookHotelServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BookHotelService".equals(inputPortName)) {
            return getBookHotelService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://hotel.travel.ws", "BookHotelServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://hotel.travel.ws", "BookHotelService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BookHotelService".equals(portName)) {
            setBookHotelServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
