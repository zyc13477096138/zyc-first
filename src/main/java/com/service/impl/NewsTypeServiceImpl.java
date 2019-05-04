/**
 * 
 */
package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.NewsTypeDao;
import com.pojo.News;
import com.pojo.NewsType;
import com.service.NewsService;
import com.service.NewsTypeService;
import com.util.PageBean;
import com.util.Query;

/**
 * @author Administrator
 *
 */
@Service
public class NewsTypeServiceImpl implements NewsTypeService {
    @Autowired
    private NewsTypeDao ntd;
	@Override
	public List<NewsType> findNewsType() {	
		return ntd.findNewsType();
	}

}
