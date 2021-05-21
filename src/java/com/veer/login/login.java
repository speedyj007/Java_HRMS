package com.veer.login;



import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(urlPatterns = {"/login"})
public class login extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws Exception
     */
    
    

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    
    {
        try{
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        login_check lc = new login_check();
        
       
       if(lc.check_details(email)) 
        {
            HttpSession s = request.getSession();
            
            s.setAttribute("email", email);
            
            
            response.sendRedirect("welcome.jsp");
        }
       else{
           response.sendRedirect("index.html");
       }
        }
        catch(Exception e)
    {
        e.printStackTrace();
    }
     
    }
    
}


