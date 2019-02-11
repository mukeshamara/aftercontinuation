package com.main;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.model.Products;
public class Main {
	public static void main(String[] args) {
		SessionFactory fact1=new Configuration().
				             configure("hibernate.cfg.xml").
				              addAnnotatedClass(Products.class).
				              buildSessionFactory();
	    Session session=fact1.getCurrentSession();
	    session.beginTransaction(); 

	    Criteria cr=session.createCriteria(Products.class);
	    cr.add(Restrictions.lt("price",30000));
	    List<Products> list=cr.list();
	    for(Products x:list)
	    	System.out.println(x.getPid()+" "+x.getPname()+" "+x.getPrice());
	}
}
