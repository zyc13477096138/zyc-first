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
  //��ҳ��ѯ��������
   public List<News> findAllNewsByFenye(PageBean pb);
   
  // public int findPageSizeCount(Query q);
   //��������
    public int addNews(News news);
   
   public News findNewsById(Integer id);  
   
   //ɾ��������Ϣ
    public int delNews(Integer id);
   //����������Ϣ
    public int updateNews(News news);
}
