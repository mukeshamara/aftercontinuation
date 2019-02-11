package com.main;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  

import com.dao.Productsdao;
import com.model.Products;
  
public class Main {  
public static void main(String[] args) {  
      
    Resource r=new ClassPathResource("applicationContext.xml");  
    BeanFactory factory=new XmlBeanFactory(r);  
      
    Productsdao dao=(Productsdao)factory.getBean("d");  
      
    Products p=new Products(); 
    p.setPid(1);
    p.setPname("v");
    p.setDescription("electronic");
    p.setPrice(10000);
    dao.saveEmployee(p);  
      
}  
} 




