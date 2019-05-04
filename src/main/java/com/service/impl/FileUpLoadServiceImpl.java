/**
 * 
 */
package com.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.pojo.News;
import com.service.FileUpLoadService;

/**
 * @author Administrator
 *
 */
@Service
public class FileUpLoadServiceImpl implements FileUpLoadService{
	public News fileUpLoad(News news,CommonsMultipartFile fimg) {
		 if(fimg.getSize()>0) {
			  //��ȡԭʼ�ļ���
			   String oldFileName=fimg.getOriginalFilename();
			   //�����µ��ļ�����
			   String newFileName=UUID.randomUUID().toString()+oldFileName.substring(oldFileName.lastIndexOf("."));
			   //�������ļ�
			   File newFile=new File("D:/tomServer/apache-tomcat-8.0.53/webapps/img/"+newFileName);
			   //����ļ��������ֶ�����
			   if(!newFile.exists()) {
				   newFile.mkdir();
			   }

				   //�Ѿ��ļ�������д�����ļ�
			 try {
				 fimg.transferTo(newFile);
			 } catch (IOException e) {
				 e.printStackTrace();
			 }

			 news.setImg("../img/"+newFileName);
		 }
		     return news;
	}
 
}
