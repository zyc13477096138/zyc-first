/**
 * 
 */
package com.controller;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.pojo.User;
import com.service.UserService;

/**
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/userController")
public class UserController {
    @Autowired
    private UserService us;
	@RequestMapping("/login.do")
    @ResponseBody
  public Map<String,Object> login(User user,HttpSession session) {
	  Map<String,Object> json=new HashMap<String,Object>();
	  user=us.findUser(user);
	   if(user!=null) {
	    session.setAttribute("loginUser", user); 
		   json.put("data", true);
	   }else {
		   json.put("data",false); 
	   }
	        return json;
  }
   
}
