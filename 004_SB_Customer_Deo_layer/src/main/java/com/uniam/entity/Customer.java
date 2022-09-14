package com.uniam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cust_dtls")
public class Customer {
	@Id
	@Column(name = "cno")
	private int cno;
	@Column(name = "cname")
	private String cname;
	@Column(name = "cadd")
	private String cadd;

}
