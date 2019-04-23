//package org.itstep.dao;
//
//import java.util.List;
//
//import org.hibernate.Session;
//
//public abstract class EntityDAO<T> {
//	
//	private static Session getSession() {
//		return HibernateFactory.getSessionFactory().openSession();
//	}
//	
//	public void saveOrUpdate(T entity) {
//		Session session = getSession();
//		session.getTransaction().begin();
//		session.saveOrUpdate(entity);
//		session.getTransaction().commit();
//		session.close();
//	};
//	
//	public T findOne(Integer id){
//		Session session = getSession();
//		session.getTransaction().begin();
//		T entity = session.find(, id);
//		session.getTransaction().commit();
//		session.close();
//	};
//	
//	public abstract List<T> findAll();
//	
//	public abstract void delete(T entity);
//
//}
