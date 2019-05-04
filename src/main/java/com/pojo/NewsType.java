/**
 * 
 */
package com.pojo;

/**
 * @author Administrator
 *
 */
public class NewsType {
  private Integer id;
  private String newtype;
/**
 * 
 */
public NewsType() {
	super();
	// TODO Auto-generated constructor stub
}
/**
 * @param id
 * @param newtype
 */
public NewsType(Integer id, String newtype) {
	super();
	this.id = id;
	this.newtype = newtype;
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
 * @return the newtype
 */
public String getNewtype() {
	return newtype;
}
/**
 * @param newtype the newtype to set
 */
public void setNewtype(String newtype) {
	this.newtype = newtype;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "NewsType [id=" + id + ", newtype=" + newtype + "]";
}

}
