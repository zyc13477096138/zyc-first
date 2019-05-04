/**
 * 
 */
package com.util;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 *
 */
@Component
@Scope("prototype")
public class Query {
  private String qTitle;
  private Integer qNewsTypeId;
  @DateTimeFormat(pattern="yyyy-MM-dd")
  private Date startTime;
  @DateTimeFormat(pattern="yyyy-MM-dd")
  private Date endTime;
/**
 * 
 */
public Query() {
	super();
	// TODO Auto-generated constructor stub
}
/**
 * @param qTitle
 * @param qNewsTypeId
 * @param startTime
 * @param endTime
 */
public Query(String qTitle, Integer qNewsTypeId, Date startTime, Date endTime) {
	super();
	this.qTitle = qTitle;
	this.qNewsTypeId = qNewsTypeId;
	this.startTime = startTime;
	this.endTime = endTime;
}
/**
 * @return the qTitle
 */
public String getqTitle() {
	return qTitle;
}
/**
 * @param qTitle the qTitle to set
 */
public void setqTitle(String qTitle) {
	this.qTitle = qTitle;
}
/**
 * @return the qNewsTypeId
 */
public Integer getqNewsTypeId() {
	return qNewsTypeId;
}
/**
 * @param qNewsTypeId the qNewsTypeId to set
 */
public void setqNewsTypeId(Integer qNewsTypeId) {
	this.qNewsTypeId = qNewsTypeId;
}
/**
 * @return the startTime
 */
public Date getStartTime() {
	return startTime;
}
/**
 * @param startTime the startTime to set
 */
public void setStartTime(Date startTime) {
	this.startTime = startTime;
}
/**
 * @return the endTime
 */
public Date getEndTime() {
	return endTime;
}
/**
 * @param endTime the endTime to set
 */
public void setEndTime(Date endTime) {
	this.endTime = endTime;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Query [qTitle=" + qTitle + ", qNewsTypeId=" + qNewsTypeId + ", startTime=" + startTime + ", endTime="
			+ endTime + "]";
}

}
