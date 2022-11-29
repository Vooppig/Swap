package entities;

import java.io.Serializable;
import java.util.Date;

public class TsUser implements Serializable {
	/**
	 * yu ch bolood baigaam haha herwee hen negen end ajilj baival amjilt
	 */
	private static final long serialVersionUID = 1L;
	private Integer userId;
	private String userName;
	private Integer userType;
	private Date createdDate;
	private String password;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}