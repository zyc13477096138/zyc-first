/**
 * 
 */
package com.service;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.pojo.News;

/**
 * @author Administrator
 *
 */
public interface FileUpLoadService {
   public News fileUpLoad(News news,CommonsMultipartFile fimg);
}
