package com.epita.tp2module.infra;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.epita.tp2module.entity.Planche;

@Repository
public class DaoPlancheImpl implements DaoPlanche {

	public void create(Planche p) {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
		session.close();
	}

}
