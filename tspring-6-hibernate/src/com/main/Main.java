package com.main;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.dao.HibUtils;
import com.model.Products;
public class Main {
	public static void main(String args[])
	{
	try{
		Session session = HibUtils.getSessionFactory().openSession();
        Transaction t=session.beginTransaction();
		Products p=new Products();
		p.setPid(1);
		p.setDescription("electronic");
		p.setPname("fridge");
		p.setPrice(500);
		Integer id=(Integer)session.save(p);
		System.out.println("insertion succssful");
		t.commit();
		session.close();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}