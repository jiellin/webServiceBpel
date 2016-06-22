package ws.travel.ticket;

public class BookTicketServiceProxy implements ws.travel.ticket.BookTicketService {
  private String _endpoint = null;
  private ws.travel.ticket.BookTicketService bookTicketService = null;
  
  public BookTicketServiceProxy() {
    _initBookTicketServiceProxy();
  }
  
  public BookTicketServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initBookTicketServiceProxy();
  }
  
  private void _initBookTicketServiceProxy() {
    try {
      bookTicketService = (new ws.travel.ticket.BookTicketServiceServiceLocator()).getBookTicketService();
      if (bookTicketService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bookTicketService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bookTicketService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bookTicketService != null)
      ((javax.xml.rpc.Stub)bookTicketService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ws.travel.ticket.BookTicketService getBookTicketService() {
    if (bookTicketService == null)
      _initBookTicketServiceProxy();
    return bookTicketService;
  }
  
  public java.lang.String bookTicket(java.lang.String date, java.lang.String cityFrom, java.lang.String cityTo) throws java.rmi.RemoteException{
    if (bookTicketService == null)
      _initBookTicketServiceProxy();
    return bookTicketService.bookTicket(date, cityFrom, cityTo);
  }
  
  
}