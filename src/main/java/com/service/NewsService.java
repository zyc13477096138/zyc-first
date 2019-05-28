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
	   //��������
	   public int addNews(News news,CommonsMultipartFile fimg);
	   //ͨ��ID��ѯ����
	   public News findNewsById(Integer id);  
	   
	   //ɾ��������Ϣ
	    public int delNews(String [] id);
	   //����������Ϣ
	    public int updateNews(News news);
}
