<%@page import="org.hibernate.criterion.Order"%>
<%@page import="org.hibernate.criterion.CriteriaQuery"%>
<%@page import="javax.transaction.Transaction"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="com.veer.login.login_dao"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee List</title>

        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href = "w3.css">
        <link rel="stylesheet" type="text/css" href="style.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>

    </head>
    <body>
        
         <jsp:include page="header.jsp"/>
        
        <div class ="w3-container">
            
            <h1><u>Employee</u> <u>List</u></h1>
            <br>
            
            <table class="w3-table w3-striped w3-bordered w3-hoverable">
                <thead>
                <tr class="w3-gray">
                    <th >ID</th>
                    <th>Emp Code</th>
                    <th>Full Name</th>
                    <th>Email</th>
                    <th>Joined Date</th>
                </tr>
                </thead>
                
                <%
                  Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
                  SessionFactory sf = cfg.buildSessionFactory();
                Session session1  = sf.openSession();
                String hbm = "from userform";
                Transaction tx = null;
                Criteria ct = session1.createCriteria(login_dao.class);
                ct.addOrder(Order.desc("time_updated"));
                List mem = ct.list();
                Iterator it = mem.iterator();

                while(it.hasNext())
            {
                login_dao ld = (login_dao) it.next();  
                int id = ld.getId();
                String empcode = ld.getEmp_id();
                String Name = ld.getFirst_name()+" "+ld.getLast_name();
                String email = ld.getEmail();
                String time = ld.getTime_updated();
                
                %>
                <tbody>
                
                    <tr>
                     <% out.println("<td>"+id+"</td>"
                    +"<td>"+empcode+"</td>"
                    + "<td>"+Name+"</td>"
                    + "<td>"+email+"</td>"
                    + "<td>"+time+"</td>"); %>
                    </tr>
                
                    
                    
               
                
              <% } %>
                </tbody>
                
                
            </table>
            
                <br><br>
        </div>
        
        
    </body>
</html>
