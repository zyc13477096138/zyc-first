/**
 * 
 */
package com.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author Administrator
 *
 */
public class News {
	private Integer id; 
	private Integer newsId; 
	private NewsType newsType; 
	private String title; 
	private String newContext; 
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date newDate; 
	private String publish; 
	private User user;
	private String img;
	/**
	 * 
	 */
	public News() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param newsId
	 * @param newsType
	 * @param title
	 * @param newContext
	 * @param newDate
	 * @param publish
	 * @param user
	 */
	public News(Integer id, Integer newsId, NewsType newsType, String title, String newContext, Date newDate,
			String publish, User user,String img) {
		super();
		this.id = id;
		this.newsId = newsId;
		this.newsType = newsType;
		this.title = title;
		this.newContext = newContext;
		this.newDate = newDate;
		this.publish = publish;
		this.user = user;
		this.img = img;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the newsId
	 */
	public Integer getNewsId() {
		return newsId;
	}
	/**
	 * @param newsId the newsId to set
	 */
	public void setNewsId(Integer newsId) {
		this.newsId = newsId;
	}
	/**
	 * @return the newsType
	 */
	public NewsType getNewsType() {
		return newsType;
	}
	/**
	 * @param newsType the newsType to set
	 */
	public void setNewsType(NewsType newsType) {
		this.newsType = newsType;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the newContext
	 */
	public String getNewContext() {
		return newContext;
	}
	/**
	 * @param newContext the newContext to set
	 */
	public void setNewContext(String newContext) {
		this.newContext = newContext;
	}
	/**
	 * @return the newDate
	 */
	public Date getNewDate() {
		return newDate;
	}
	/**
	 * @param newDate the newDate to set
	 */
	public void setNewDate(Date newDate) {
		this.newDate = newDate;
	}
	/**
	 * @return the publish
	 */
	public String getPublish() {
		return publish;
	}
	/**
	 * @param publish the publish to set
	 */
	public void setPublish(String publish) {
		this.publish = publish;
	}
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "News [id=" + id + ", newsId=" + newsId + ", newsType=" + newsType + ", title=" + title + ", newContext="
				+ newContext + ", newDate=" + newDate + ", publish=" + publish + ", user=" + user + ", img=" + img
				+ "]";
	}
	/**
	 * @return the img
	 */
	public String getImg() {
		return img;
	}
	/**
	 * @param img the img to set
	 */
	public void setImg(String img) {
		this.img = img;
	}
	
	
}
