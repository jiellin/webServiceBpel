<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleBookTicketServiceProxyid" scope="session" class="ws.travel.ticket.BookTicketServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleBookTicketServiceProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleBookTicketServiceProxyid.getEndpoint();
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
        sampleBookTicketServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        ws.travel.ticket.BookTicketService getBookTicketService10mtemp = sampleBookTicketServiceProxyid.getBookTicketService();
if(getBookTicketService10mtemp == null){
%>
<%=getBookTicketService10mtemp %>
<%
}else{
        if(getBookTicketService10mtemp!= null){
        String tempreturnp11 = getBookTicketService10mtemp.toString();
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
        String cityFrom_2id=  request.getParameter("cityFrom18");
            java.lang.String cityFrom_2idTemp = null;
        if(!cityFrom_2id.equals("")){
         cityFrom_2idTemp  = cityFrom_2id;
        }
        String cityTo_3id=  request.getParameter("cityTo20");
            java.lang.String cityTo_3idTemp = null;
        if(!cityTo_3id.equals("")){
         cityTo_3idTemp  = cityTo_3id;
        }
        java.lang.String bookTicket13mtemp = sampleBookTicketServiceProxyid.bookTicket(date_1idTemp,cityFrom_2idTemp,cityTo_3idTemp);
if(bookTicket13mtemp == null){
%>
<%=bookTicket13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(bookTicket13mtemp));
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