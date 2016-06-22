<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleBookHotelServiceProxyid" scope="session" class="ws.travel.hotel.BookHotelServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleBookHotelServiceProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleBookHotelServiceProxyid.getEndpoint();
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
        sampleBookHotelServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        ws.travel.hotel.BookHotelService getBookHotelService10mtemp = sampleBookHotelServiceProxyid.getBookHotelService();
if(getBookHotelService10mtemp == null){
%>
<%=getBookHotelService10mtemp %>
<%
}else{
        if(getBookHotelService10mtemp!= null){
        String tempreturnp11 = getBookHotelService10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String date_1id=  request.getParameter("date16");
            java.lang.String date_1idTemp = null;
        if(!date_1id.equals("")){
         date_1idTemp  = date_1id;
        }
        String city_2id=  request.getParameter("city18");
            java.lang.String city_2idTemp = null;
        if(!city_2id.equals("")){
         city_2idTemp  = city_2id;
        }
        java.lang.String bookHotel13mtemp = sampleBookHotelServiceProxyid.bookHotel(date_1idTemp,city_2idTemp);
if(bookHotel13mtemp == null){
%>
<%=bookHotel13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(bookHotel13mtemp));
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