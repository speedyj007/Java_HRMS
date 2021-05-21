
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
    </head>
    <body>
        
        <%
            if(session.getAttribute("email")==null)
            {
                response.sendRedirect("index.html");
            }
        %>
        
        <jsp:include page="header.jsp"/>
        <div class ="w3-container">
        <h1>Welcome ${email} </h1>
        
        <form action ='logout' method='post'>
            <button type="submit" value="Submit" class="w3-button w3-blue w3-border w3-border-white w3-round-large">Logout</button> 
        </form>
        </div>
    </body>
</html>
