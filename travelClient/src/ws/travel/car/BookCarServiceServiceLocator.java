/**
 * BookCarServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws.travel.car;

public class BookCarServiceServiceLocator extends org.apache.axis.client.Service implements ws.travel.car.BookCarServiceService {

    public BookCarServiceServiceLocator() {
    }


    public BookCarServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BookCarServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BookCarService
    private java.lang.String BookCarService_address = "http://localhost:8080/travel/services/BookCarService";

    public java.lang.String getBookCarServiceAddress() {
        return BookCarService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BookCarServiceWSDDServiceName = "BookCarService";

    public java.lang.String getBookCarServiceWSDDServiceName() {
        return BookCarServiceWSDDServiceName;
    }

    public void setBookCarServiceWSDDServiceName(java.lang.String name) {
        BookCarServiceWSDDServiceName = name;
    }

    public ws.travel.car.BookCarService getBookCarService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BookCarService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBookCarService(endpoint);
    }

    public ws.travel.car.BookCarService getBookCarService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ws.travel.car.BookCarServiceSoapBindingStub _stub = new ws.travel.car.BookCarServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getBookCarServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBookCarServiceEndpointAddress(java.lang.String address) {
        BookCarService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ws.travel.car.BookCarService.class.isAssignableFrom(serviceEndpointInterface)) {
                ws.travel.car.BookCarServiceSoapBindingStub _stub = new ws.travel.car.BookCarServiceSoapBindingStub(new java.net.URL(BookCarService_address), this);
                _stub.setPortName(getBookCarServiceWSDDServiceName());
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
        if ("BookCarService".equals(inputPortName)) {
            return getBookCarService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://car.travel.ws", "BookCarServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://car.travel.ws", "BookCarService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BookCarService".equals(portName)) {
            setBookCarServiceEndpointAddress(address);
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
