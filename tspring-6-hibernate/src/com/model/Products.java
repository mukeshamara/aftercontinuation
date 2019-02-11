package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
	   @Entity
	   @Table(name="products")
	   public class Products{		   
			   @Id
			   @Column(name="pid")
			   private Integer pid;
			   @Column(name="pname")
			   private String pname;
			   @Column(name="description")
			   private String description;	   
			   @Column(name="price")
			   private Integer price;
			public Integer getPid() {
				return pid;
			}
			public void setPid(Integer pid) {
				this.pid = pid;
			}
			public String getPname() {
				return pname;
			}
			public void setPname(String pname) {
				this.pname = pname;
			}
			public String getDescription() {
				return description;
			}
			public void setDescription(String description) {
				this.description = description;
			}
			public Integer getPrice() {
				return price;
			}
			public void setPrice(Integer price) {
				this.price = price;
			}		   
}
