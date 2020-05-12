package com.master4.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "tags")
public class Tag {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "name", nullable = false, unique = true, length = 150)
	private String title;

	@Column(name = "created")
	@CreationTimestamp
	private Date created;

	@Column(name = "modified")
	@UpdateTimestamp
	private Date modified;

	@ManyToMany(mappedBy = "tagList")
	List<Article> articles;

	@Transient
	private Boolean used;

	public Tag(long id, String title, Date created, Date modified, List<Article> articles,
			Boolean used) {
		super();
		this.id = id;
		this.title = title;
		this.created = created;
		this.modified = modified;
		this.articles = articles;
		this.used = used;
	}

	public Tag() {
		super();
	}

	public Tag(long id) {
		super();
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public Boolean getUsed() {
		return used;
	}

	public void setUsed(Boolean used) {
		this.used = used;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

}
