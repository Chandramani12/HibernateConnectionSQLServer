package com.hibernate.HibernateProjecct;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
       UserDetails userdetails=new UserDetails();
       
       userdetails.setId(1);
       userdetails.setName("chandramani");
       
      
       System.out.println(userdetails.getId()+" "+userdetails.getName());
       
       Configuration configure=new Configuration().configure();
       try{
    	   SessionFactory sf=configure.buildSessionFactory();
    	   Session session=sf.openSession();
    	   Transaction ts=session.beginTransaction();
    	   session.persist(userdetails);
    	   ts.commit();
    	   
       }
       catch(Exception e) {
    	   e.printStackTrace();
       }
      
       
       
       
    }
}
