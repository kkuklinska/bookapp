package org.example.repository.Classroom;


import java.io.File;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {

        private static final SessionFactory sessionFactory = buildSessionFactory();

        private static SessionFactory buildSessionFactory() {
            try {
                final File configFile = new File("/Users/kamilakuklinska/IdeaProjects/bookapp/src/main/java/hibernate.cfg.xml");
                return new Configuration()
                        .configure(configFile)
                        .buildSessionFactory();
            }
            catch (Throwable ex) {
                System.err.println("Initial SessionFactory creation failed." + ex);
                throw new ExceptionInInitializerError(ex);
            }
        }

        public static SessionFactory getSessionFactory() {
            return sessionFactory;
        }

        public static void shutdown() {
            getSessionFactory().close();
        }
    }

