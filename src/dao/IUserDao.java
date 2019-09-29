package dao;



import entry.User;

public interface IUserDao {
	
	
	
	//通过ID查询用户
	User serlectUserById(int uid);

}
