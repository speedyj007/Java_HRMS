package com.veer.login;


import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;


public class login_check {

        public boolean check_details(String email)
        {
         try{
         
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session  = sf.openSession();
        String hbm = "from userform where email = '"+email+"'";
        Criteria ct = session.createCriteria(login_dao.class);
        List mem = ct.list();
        
        Iterator it = mem.iterator();
        if(it.hasNext())
        {
            login_dao ld =  (login_dao) it.next();
            System.out.println("Success");
            return true;
            
        }
            
             
        }
        catch(Exception e)
        {
            e.printStackTrace();

            
    }
                        return false;
}
}
 
