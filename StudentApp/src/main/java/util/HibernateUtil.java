package util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;

public class HibernateUtil {

    public static StandardServiceRegistry registry;

    public static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory(){

        if(sessionFactory == null){
            try{
                registry = new StandardServiceRegistry() {
                }
            }
        }
    }
}
