package org.itstep.dao;

import java.util.List;

import org.hibernate.Session;
import org.itstep.entity.User;


public class UserDAO {

	private static Session getSession() {
		return HibernateFactory.getSessionFactory().openSession();
	}
	
	public static void saveOrUpdate(User user) {
		Session session = getSession();
		session.getTransaction().begin();
		session.saveOrUpdate(user);
		session.getTransaction().commit();
		session.close();
	};
	
	public static User findOne(Integer id){
		Session session = getSession();
		session.getTransaction().begin();
		User userFromDb = session.find(User.class, id);
		session.getTransaction().commit();
		session.close();
		return userFromDb;
	};
	
	public static List<User> findAll(){
		Session session = getSession();
		session.getTransaction().begin();
		
		String sql = "SELECT * FROM users";
		List<User> usersFromDb = session.createNativeQuery(sql).getResultList();

		return usersFromDb;
	};
	
	public static void delete(User user) {
		Session session = getSession();
		session.getTransaction().begin();
		session.delete(user);
		session.getTransaction().commit();
		session.close();
	};

}
