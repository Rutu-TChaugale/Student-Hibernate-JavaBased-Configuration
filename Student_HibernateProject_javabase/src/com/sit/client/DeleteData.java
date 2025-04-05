package com.sit.client;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import com.sit.model.Student;
import com.sit.util.HibernateUtil;

public class DeleteData {
public static void main(String[] args) {
		
	Session session = HibernateUtil.getSessionFactory().openSession();
	Transaction tx = session.beginTransaction();
		 
	Student stu=session.get(Student.class, 1);
	
	
	
	session.delete(stu);
	tx.commit();
	
	
}
}
