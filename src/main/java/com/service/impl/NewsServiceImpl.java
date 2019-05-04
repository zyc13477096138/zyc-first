/**
 * 
 */
package com.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.dao.NewsDao;
import com.pojo.News;
import com.service.FileUpLoadService;
import com.service.NewsService;
import com.util.PageBean;
import com.util.Query;

/**
 * @author Administrator
 *
 */
@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsDao nd;
    @Autowired
	private FileUpLoadService fus;
	@Override
	public List<News> findAllNewsByFenye(PageBean pb,String page,Query query) {
		 if(page==null) {
		    	pb.setCurrentPage(1);
		    }else {
		    	pb.setCurrentPage(new Integer(page));
		    }
		    //   pb.setCountPageSize(findPageSizeCount(query));
		      // pb.setQuery(query);   
		       nd.findAllNewsByFenye(pb);
		        return pb.getNews();
	}
//	@Override
//	public int findPageSizeCount(Query q) {
//		return nd.findPageSizeCount(q);
//	}

	@Override
	public int addNews(News news,CommonsMultipartFile fimg) {
		     news=fus.fileUpLoad(news, fimg);
		     news.setNewDate(new Date());
		      return nd.addNews(news);
	}
	
	@Override
	public News findNewsById(Integer id) {
		return nd.findNewsById(id);
	}
	
	@Override
	 public int delNews(String [] id) {
	 for(String i:id) {
		return nd.delNews(new Integer(i));
	  }
	   return 1;
	}
	@Override
	public int updateNews(News news) {
		return nd.updateNews(news);
	}

}
