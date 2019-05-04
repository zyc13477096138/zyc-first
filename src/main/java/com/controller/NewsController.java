/**
 * 
 */
package com.controller;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;
import com.pojo.News;
import com.pojo.NewsType;
import com.pojo.User;
import com.service.NewsService;
import com.service.NewsTypeService;
import com.util.PageBean;
import com.util.Query;

/**
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/newsController")
public class NewsController {
	@Autowired
	private NewsTypeService nts;
	@Autowired
	private NewsService ns;
	@RequestMapping("/findAllNews.do")
    public ModelAndView findAllNewsByLimit(String page,Query query,PageBean pb) {
       ModelAndView mav=new ModelAndView();
	   List<News> news= ns.findAllNewsByFenye(pb, page, query);
       List<NewsType> newsType= nts.findNewsType();
	   mav.addObject("news", news);
       mav.addObject("newsType", newsType);
	   mav.addObject("pb", pb);
       mav.setViewName("/News");
	   return mav;
   }
	@RequestMapping("/findNewsType.do")
	public ModelAndView findNewsType() {
		 ModelAndView mav=new ModelAndView();
		 List<NewsType> newsType= nts.findNewsType();
		 mav.addObject("newsType",newsType);
		 mav.setViewName("/addNews");
		   return mav;
	}
	//增加新闻信息
	@RequestMapping("/addNews.do")
	 public ModelAndView addNews(News news,HttpSession session,@RequestParam("fimg") CommonsMultipartFile fimg) {
		ModelAndView mav=new ModelAndView();
		User loginUser=(User) session.getAttribute("loginUser");
		news.setUser(loginUser);
		 int num=ns.addNews(news,fimg);
		 if(num>0) {
		    mav.setViewName("forward:/newsController/findAllNews.do");
		 }else {
			mav.setViewName("forward:/newsController/findNewsType.do"); 
		 }
		 return mav;
	}
	//删除新闻信息
	@RequestMapping("/delNews.do")
	public ModelAndView delNews(String [] ids) {
		ModelAndView mav=new ModelAndView();
	    	 int num=ns.delNews(ids);     	
	         mav.setViewName("redirect:/newsController/findAllNews.do");	
		     return mav;
	}
	@RequestMapping("/findNewsById.do")
	public ModelAndView findNewsById(Integer id) {
		ModelAndView mav=new ModelAndView();
			 News news= ns.findNewsById(id);
			 mav.addObject("nw", news);
			 mav.setViewName("/updateNews");
		     return mav;
	}
	//修改新闻信息
	@RequestMapping("/updateNews.do")
	public ModelAndView updateNews(News news) {
		ModelAndView mav=new ModelAndView();
		int num=ns.updateNews(news);
		 if(num>0) {
			 mav.setViewName("forward:/newsController/findAllNews.do"); 
		 }else {
			 mav.setViewName("/updateNews");
		 }
		   return mav;
	 }
	//查看新闻信息
	@RequestMapping("/findNews.do")
	public ModelAndView findNews(Integer id) {
		 ModelAndView mav=new ModelAndView();
		 News news= ns.findNewsById(id);
		 mav.addObject("nw", news);
		 mav.setViewName("/findNews");
		   return mav;
	}
}
