package ws.travel.car;

public class BookCarServiceProxy implements ws.travel.car.BookCarService {
  private String _endpoint = null;
  private ws.travel.car.BookCarService bookCarService = null;
  
  public BookCarServiceProxy() {
    _initBookCarServiceProxy();
  }
  
  public BookCarServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initBookCarServiceProxy();
  }
  
  private void _initBookCarServiceProxy() {
    try {
      bookCarService = (new ws.travel.car.BookCarServiceServiceLocator()).getBookCarService();
      if (bookCarService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bookCarService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bookCarService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bookCarService != null)
      ((javax.xml.rpc.Stub)bookCarService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ws.travel.car.BookCarService getBookCarService() {
    if (bookCarService == null)
      _initBookCarServiceProxy();
    return bookCarService;
  }
  
  public java.lang.String bookCar(java.lang.String size, boolean isAT, java.lang.String cityBook, java.lang.String cityBack) throws java.rmi.RemoteException{
    if (bookCarService == null)
      _initBookCarServiceProxy();
    return bookCarService.bookCar(size, isAT, cityBook, cityBack);
  }
  
  
}