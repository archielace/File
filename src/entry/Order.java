package entry;

import java.sql.Date;



public class Order {
	private int id;
	private String nameString;
	private Date date;
	private User user;
	public Order() {}
	public Order(int id, String nameString, Date date, User user) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.date = date;
		this.user = user;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "id=" + id + ", nameString=" + nameString + ", date=" + date + ", user=" + user + "]";
	}
	
	

}
