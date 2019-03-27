package aht.Service;

import java.util.List;

import aht.Model.UserDTO;



public interface UserService {
	
	public void addUser(UserDTO user); 
	
	public void updateUser(UserDTO user);
	
	public void deleteUser(int id);
	
	public UserDTO getUserByID(int id);
	
	public List<UserDTO> getAllUser();
}
