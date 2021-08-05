package com.jit.Entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;


import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.ListIndexBase;

import com.jit.model.Emp;

import lombok.Data;

@Entity
@Table(name = "productDetails")
@Data
public class ProductEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

/*//	@OneToMany(targetEntity=Emp.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY,orphanRemoval=true)
//	@JoinColumn(name="EmpId",referencedColumnName="mobile")
//	@LazyCollection(LazyCollectionOption.EXTRA)
//	@Fetch(FetchMode.JOIN)
//	@OrderColumn(name="ist_indx")
//	@ListIndexBase(value=1)
*/	private String id;
	@Column(name = "Name")
	private String name;
	//private Set<Emp> emp;

	
	 public   ProductEntity(){
		System.out.println("ProductEntity.ProductEntity()");
	}
	
}
