/**
 * 
 */
package com.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.pojo.News;
import com.util.PageBean;
import com.util.Query;

/**
 * @author Administrator
 *
 */
public interface NewsService{
	  public List<News> findAllNewsByFenye(PageBean pb,String page,Query query);
	   
	//   public int findPageSizeCount(Query q);
	   //增加新闻
	   public int addNews(News news,CommonsMultipartFile fimg);
	   //通过ID查询新闻
	   public News findNewsById(Integer id);  
	   
	   //删除新闻信息
	    public int delNews(String [] id);
	   //更新新闻信息
	    public int updateNews(News news);
}
