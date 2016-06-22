<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleSpotGuideServiceProxyid" scope="session" class="ws.travel.spot.SpotGuideServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleSpotGuideServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleSpotGuideServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleSpotGuideServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        ws.travel.spot.SpotGuideService getSpotGuideService10mtemp = sampleSpotGuideServiceProxyid.getSpotGuideService();
if(getSpotGuideService10mtemp == null){
%>
<%=getSpotGuideService10mtemp %>
<%
}else{
        if(getSpotGuideService10mtemp!= null){
        String tempreturnp11 = getSpotGuideService10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String spot_1id=  request.getParameter("spot16");
            java.lang.String spot_1idTemp = null;
        if(!spot_1id.equals("")){
         spot_1idTemp  = spot_1id;
        }
        String isNational_2id=  request.getParameter("isNational18");
        boolean isNational_2idTemp  = Boolean.valueOf(isNational_2id).booleanValue();
        java.lang.String spotGuide13mtemp = sampleSpotGuideServiceProxyid.spotGuide(spot_1idTemp,isNational_2idTemp);
if(spotGuide13mtemp == null){
%>
<%=spotGuide13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(spotGuide13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>