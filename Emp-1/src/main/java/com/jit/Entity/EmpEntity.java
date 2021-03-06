package com.jit.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "EmpDetails")
public class EmpEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "mobileNo", length = 12)
	private Long mobile;
	@Column(name = "Email")
	private String Email;

}
