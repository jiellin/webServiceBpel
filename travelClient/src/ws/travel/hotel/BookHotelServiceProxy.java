package ws.travel.hotel;

public class BookHotelServiceProxy implements ws.travel.hotel.BookHotelService {
  private String _endpoint = null;
  private ws.travel.hotel.BookHotelService bookHotelService = null;
  
  public BookHotelServiceProxy() {
    _initBookHotelServiceProxy();
  }
  
  public BookHotelServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initBookHotelServiceProxy();
  }
  
  private void _initBookHotelServiceProxy() {
    try {
      bookHotelService = (new ws.travel.hotel.BookHotelServiceServiceLocator()).getBookHotelService();
      if (bookHotelService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bookHotelService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bookHotelService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bookHotelService != null)
      ((javax.xml.rpc.Stub)bookHotelService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ws.travel.hotel.BookHotelService getBookHotelService() {
    if (bookHotelService == null)
      _initBookHotelServiceProxy();
    return bookHotelService;
  }
  
  public java.lang.String bookHotel(java.lang.String date, java.lang.String city) throws java.rmi.RemoteException{
    if (bookHotelService == null)
      _initBookHotelServiceProxy();
    return bookHotelService.bookHotel(date, city);
  }
  
  
}