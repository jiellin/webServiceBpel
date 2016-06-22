/**
 * BookTicketServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws.travel.ticket;

public class BookTicketServiceServiceLocator extends org.apache.axis.client.Service implements ws.travel.ticket.BookTicketServiceService {

    public BookTicketServiceServiceLocator() {
    }


    public BookTicketServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BookTicketServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BookTicketService
    private java.lang.String BookTicketService_address = "http://localhost:8080/travel/services/BookTicketService";

    public java.lang.String getBookTicketServiceAddress() {
        return BookTicketService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BookTicketServiceWSDDServiceName = "BookTicketService";

    public java.lang.String getBookTicketServiceWSDDServiceName() {
        return BookTicketServiceWSDDServiceName;
    }

    public void setBookTicketServiceWSDDServiceName(java.lang.String name) {
        BookTicketServiceWSDDServiceName = name;
    }

    public ws.travel.ticket.BookTicketService getBookTicketService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BookTicketService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBookTicketService(endpoint);
    }

    public ws.travel.ticket.BookTicketService getBookTicketService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ws.travel.ticket.BookTicketServiceSoapBindingStub _stub = new ws.travel.ticket.BookTicketServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getBookTicketServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBookTicketServiceEndpointAddress(java.lang.String address) {
        BookTicketService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ws.travel.ticket.BookTicketService.class.isAssignableFrom(serviceEndpointInterface)) {
                ws.travel.ticket.BookTicketServiceSoapBindingStub _stub = new ws.travel.ticket.BookTicketServiceSoapBindingStub(new java.net.URL(BookTicketService_address), this);
                _stub.setPortName(getBookTicketServiceWSDDServiceName());
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
        if ("BookTicketService".equals(inputPortName)) {
            return getBookTicketService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ticket.travel.ws", "BookTicketServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ticket.travel.ws", "BookTicketService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BookTicketService".equals(portName)) {
            setBookTicketServiceEndpointAddress(address);
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
