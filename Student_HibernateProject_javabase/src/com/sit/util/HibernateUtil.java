package com.sit.util;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import com.sit.model.Student;

public class HibernateUtil {
    private static final SessionFactory sessionFactory=null;

	public static SessionFactory getSessionFactory() {
		
		Map<Object, String> map=new HashMap<>();
		//database connection 
		map.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		map.put(Environment.URL, "jdbc:mysql://localhost:3306/Student-javabase");
		map.put(Environment.USER, "root");
		map.put(Environment.PASS, "root");
		//hibernate configurtion
		map.put(Environment.SHOW_SQL, "true");
		map.put(Environment.FORMAT_SQL, "true");
		map.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
		map.put(Environment.HBM2DDL_AUTO, "update");
		
		//load cfg file
		StandardServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(map).build();
		//it contain entity information and relationship mapping
		MetadataSources md=new MetadataSources(registry);
		md.addAnnotatedClass(Student.class);
		
		 Metadata metadata = md.getMetadataBuilder().build();
		 //create sessionFactory object
		 SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
		return sessionFactory;
	}

}
