package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.model.Products;

public class Productsdao {
	HibernateTemplate template;  
	
	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  
	}  

	public void saveEmployee(Products e){  
	    template.save(e);  
	}  
 
	public List<Products> getEmployees(){  
	    List<Products> list=new ArrayList<Products>();  
	    list=template.loadAll(Products.class);  
	    return list;  
	}  
}
