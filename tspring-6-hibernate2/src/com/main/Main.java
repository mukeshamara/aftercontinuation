package com.main;
import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.model.Products;
public class Main {
	public static void main(String[] args) {
		SessionFactory fact1=new Configuration().
				             configure("hibernate.cfg.xml").
				              addAnnotatedClass(Products.class).
				              buildSessionFactory();
	    Session session=fact1.getCurrentSession();
	    session.beginTransaction(); 
	    Products p=new Products();
	    p.setPid(10);
	    p.setPname("Mixer");
	    p.setDescription("Kitchen");
	    p.setPrice(2500);
	    session.save(p);
	    //session.delete(p.getPid());
	    session.getTransaction().commit();
	    session=fact1.getCurrentSession();
	    session.beginTransaction();
	    String sql="select * from products";
	    SQLQuery query=session.createSQLQuery(sql);
	    query.addEntity(Products.class);
	    List<Products> list=query.list();
	    for(Products x:list)
	    	System.out.println(x.getPid()+" "+x.getPname());
	}
}
