/**
 * 
 */
package com.dao;

import java.util.List;
import com.pojo.News;
import com.util.PageBean;
import com.util.Query;

/**
 * @author Administrator
 *
 */
public interface NewsDao {
  //分页查询所有新闻
   public List<News> findAllNewsByFenye(PageBean pb);
   
  // public int findPageSizeCount(Query q);
   //增加新闻
    public int addNews(News news);
   
   public News findNewsById(Integer id);  
   
   //删除新闻信息
    public int delNews(Integer id);
   //更新新闻信息
    public int updateNews(News news);
}
