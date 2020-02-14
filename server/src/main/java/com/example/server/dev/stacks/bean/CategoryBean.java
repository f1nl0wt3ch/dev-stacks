package com.example.server.dev.stacks.bean;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "ds_category")
public class CategoryBean {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ds_category_id", nullable=false)
	private int id;
	
	@Column(name="ds_name")
	private String name;
	
	@Column(name="ds_created_date")
	private Date createdDate;
	
	@OneToMany(mappedBy = "category", cascade=CascadeType.ALL)
	@JsonIgnore
	private List<StackBean> stacks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public List<StackBean> getStacks() {
		return stacks;
	}

	public void setStacks(List<StackBean> stacks) {
		this.stacks = stacks;
	}
	

}
