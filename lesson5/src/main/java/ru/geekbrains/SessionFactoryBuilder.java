package ru.geekbrains;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryBuilder {

    public static SessionFactory getFactory() {
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        return configuration.buildSessionFactory();
    }
}
