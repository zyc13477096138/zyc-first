/**
 * 
 */
package com.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 *
 */
@Component
@Scope("prototype")
public class User {
	    private Integer id;
	    private String userName;
	    private String pwd;
		/**
		 * 
		 */
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		/**
		 * @param id
		 * @param userName
		 * @param pwd
		 */
		public User(Integer id, String userName, String pwd) {
			super();
			this.id = id;
			this.userName = userName;
			this.pwd = pwd;
		}

		/**
		 * @return the id
		 */
		public Integer getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(Integer id) {
			this.id = id;
		}

		/**
		 * @return the userName
		 */
		public String getUserName() {
			return userName;
		}

		/**
		 * @param userName the userName to set
		 */
		public void setUserName(String userName) {
			this.userName = userName;
		}

		/**
		 * @return the pwd
		 */
		public String getPwd() {
			return pwd;
		}

		/**
		 * @param pwd the pwd to set
		 */
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "User [id=" + id + ", userName=" + userName + ", pwd=" + pwd + "]";
		}
	    
}
