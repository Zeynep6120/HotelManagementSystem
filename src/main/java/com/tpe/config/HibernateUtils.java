package com.tpe.config;

import com.tpe.domain.Guest;
import com.tpe.domain.Hotel;
import com.tpe.domain.Reservation;
import com.tpe.domain.Room;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtils {
    //static blocklar tüm class lardan ve methodlardan önce çalıştırılır

    private static SessionFactory sessionFactory;

    static{
        try {
            Configuration configuration= new Configuration().configure().
                    addAnnotatedClass(Hotel.class).
                    addAnnotatedClass(Room.class).
                    addAnnotatedClass(Reservation.class).
                    addAnnotatedClass(Guest.class);

            sessionFactory=configuration.buildSessionFactory();
        } catch (Exception e) {
            System.out.println("Initialization of session factory is FAILED!!!! ");
        }

    }

    //getter
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    //SF KAPATALIM
    public static  void  shutDown(){
        getSessionFactory().close();
        //önce sessionfactory yi getir sonra da kapat
    }

    //sessionu kapatalım
    public static void closeSession(Session session){
        if(session!=null && session.isOpen()){
            session.close();
        }

    }
}
