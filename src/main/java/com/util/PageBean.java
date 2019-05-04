/**
 * 
 */
package com.util;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.pojo.News;

/**
 * @author Administrator
 *
 */
@Component
@Scope("prototype")
public class PageBean {
    private Integer currentPage; //当前页数
    private Integer pageSize=4;  //每页记录条数
    private Integer totalPage;   //总页数      
    private Integer countPageSize; //总记录条数
    private Integer startPageSize;  //查询的页数开始记录数
	private Integer endPageSize;    //查询的页数结束记录数
	private Query query;
	/**
	 * 新加的一个属性,用来接收存储过程执行完成后返回的新闻列表
	 */
	private  List<News> news;
	public PageBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param currentPage
	 * @param pageSize
	 * @param totalPage
	 * @param countPageSize
	 * @param startPageSize
	 * @param endPageSize
	 * @param query
	 */
	public PageBean(Integer currentPage, Integer pageSize, Integer totalPage, Integer countPageSize,
			Integer startPageSize, Integer endPageSize, Query query) {
		super();
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.totalPage = totalPage;
		this.countPageSize = countPageSize;
		this.startPageSize = startPageSize;
		this.endPageSize = endPageSize;
		this.query = query;
	}
	/**
	 * @return the currentPage
	 */
	public Integer getCurrentPage() {
		return currentPage;
	}
	/**
	 * @param currentPage the currentPage to set
	 */
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	/**
	 * @return the pageSize
	 */
	public Integer getPageSize() {
		return pageSize;
	}
	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	/**
	 * @return the totalPage
	 */
	public Integer getTotalPage() {
		if(getCountPageSize()%getPageSize()==0) {
			totalPage=getCountPageSize()/getPageSize();
		}else {
			totalPage=getCountPageSize()/getPageSize()+1;
		}
		    return totalPage;
	}
	/**
	 * @param totalPage the totalPage to set
	 */
	public void setTotalPage(Integer totalPage) {
		  this.totalPage = totalPage;
	}
	/**
	 * @return the countPageSize
	 */
	public Integer getCountPageSize() {
		return countPageSize;
	}
	/**
	 * @param countPageSize the countPageSize to set
	 */
	public void setCountPageSize(Integer countPageSize) {
		this.countPageSize = countPageSize;
	}
	/**
	 * @return the startPageSize
	 */
	public Integer getStartPageSize() {
		startPageSize=(getCurrentPage()-1)*getPageSize();
		  return startPageSize;
	}
	/**
	 * @param startPageSize the startPageSize to set
	 */
	public void setStartPageSize(Integer startPageSize) {
		this.startPageSize = startPageSize;
	}
	/**
	 * @return the endPageSize
	 */
	public Integer getEndPageSize() {
		endPageSize=getCurrentPage()*getPageSize();
		return endPageSize;
	}
	/**
	 * @param endPageSize the endPageSize to set
	 */
	public void setEndPageSize(Integer endPageSize) {
		this.endPageSize = endPageSize;
	}
	/**
	 * @return the query
	 */
	public Query getQuery() {
		return query;
	}
	/**
	 * @param query the query to set
	 */
	public void setQuery(Query query) {
		this.query = query;
	}
	/**
	 * @return the news
	 */
	public List<News> getNews() {
		return news;
	}
	/**
	 * @param news the news to set
	 */
	public void setNews(List<News> news) {
		this.news = news;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PageBean [currentPage=" + currentPage + ", pageSize=" + pageSize + ", totalPage=" + totalPage
				+ ", countPageSize=" + countPageSize + ", startPageSize=" + startPageSize + ", endPageSize="
				+ endPageSize + ", query=" + query + ", news=" + news + "]";
	}
   
}
