package com.example.hibernate_tutorial;

import org.hibernate.cfg.Configuration;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Alien alien=new Alien();
        alien.setAid(1);
        alien.setColor("Blue");
        alien.setName("Jadu");

        Configuration con=new Configuration().configure("/resources/hibernate.cfg.xml").
        addAnnotatedClass(Alien.class);
        SessionFactory sf =con.buildSessionFactory();
        Session session=sf.openSession();

        // session.save(alien);
        
    }
}
