package aht.DAO;

import java.util.List;

import aht.Entity.User;
import aht.Model.UserDTO;


public interface UserDAO {
	
	public void addUser(User user); 
	
	public void updateUser(User user);
	
	public void deleteUser(int id);
	
	public User getUserByID(int id);
	
	public List<User> getAllUser();
	

}
