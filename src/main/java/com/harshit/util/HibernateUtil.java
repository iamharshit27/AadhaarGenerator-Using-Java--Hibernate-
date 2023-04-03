package com.harshit.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {


	static Session session = null;
	static Configuration cfg = null;
	static SessionFactory sessionFactory = null;
	static {
		try {
			cfg = new Configuration();
			cfg.configure();
			sessionFactory = cfg.buildSessionFactory();

		} catch (HibernateException ex) {
			ex.printStackTrace();
		}

	}

	public static Session getSession() {
		if (session == null) {
			session = sessionFactory.openSession();
		}
		return session;
	}

	public static void closeSession(Session session) {
		if (session != null) {
			session.close();
		}
	}

	public static void closeSessionFactory(SessionFactory sessionFactory) {
		if (sessionFactory != null) {
			sessionFactory.close();
		}
	}

}
