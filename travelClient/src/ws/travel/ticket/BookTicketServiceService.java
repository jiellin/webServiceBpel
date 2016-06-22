/**
 * BookTicketServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws.travel.ticket;

public interface BookTicketServiceService extends javax.xml.rpc.Service {
    public java.lang.String getBookTicketServiceAddress();

    public ws.travel.ticket.BookTicketService getBookTicketService() throws javax.xml.rpc.ServiceException;

    public ws.travel.ticket.BookTicketService getBookTicketService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
