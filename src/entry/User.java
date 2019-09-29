package entry;

import java.io.Serializable;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String nameString;
	private String sex;
	
	
	public User() {}


	public User(int id, String nameString, String sex) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.sex = sex;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNameString() {
		return nameString;
	}


	public void setNameString(String nameString) {
		this.nameString = nameString;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	@Override
	public String toString() {
		return "id=" + id + ", nameString=" + nameString + ", sex=" + sex ;
	}
	

}
