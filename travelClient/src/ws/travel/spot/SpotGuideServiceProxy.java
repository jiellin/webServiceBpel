package ws.travel.spot;

public class SpotGuideServiceProxy implements ws.travel.spot.SpotGuideService {
  private String _endpoint = null;
  private ws.travel.spot.SpotGuideService spotGuideService = null;
  
  public SpotGuideServiceProxy() {
    _initSpotGuideServiceProxy();
  }
  
  public SpotGuideServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initSpotGuideServiceProxy();
  }
  
  private void _initSpotGuideServiceProxy() {
    try {
      spotGuideService = (new ws.travel.spot.SpotGuideServiceServiceLocator()).getSpotGuideService();
      if (spotGuideService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)spotGuideService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)spotGuideService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (spotGuideService != null)
      ((javax.xml.rpc.Stub)spotGuideService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ws.travel.spot.SpotGuideService getSpotGuideService() {
    if (spotGuideService == null)
      _initSpotGuideServiceProxy();
    return spotGuideService;
  }
  
  public java.lang.String spotGuide(java.lang.String spot, boolean isNational) throws java.rmi.RemoteException{
    if (spotGuideService == null)
      _initSpotGuideServiceProxy();
    return spotGuideService.spotGuide(spot, isNational);
  }
  
  
}