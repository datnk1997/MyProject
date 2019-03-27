package aht.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aht.DAO.UserDAO;
import aht.DAO.UserDAOimp;
import aht.Entity.User;
import aht.Model.UserDTO;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserDAO UserDAOimp;
	
	@Override
	public void addUser(UserDTO userdto) {
		User user = new User();
		user.setId(userdto.getId());
		user.setName(userdto.getName());
		user.setAddress(userdto.getAddress());
		UserDAOimp.addUser(user);

	}

	@Override
	public void updateUser(UserDTO userdto) {
		User user = UserDAOimp.getUserByID(userdto.getId());
		if(user != null) {
			user.setId(userdto.getId());
			user.setName(userdto.getName());
			user.setAddress(userdto.getAddress());
			UserDAOimp.updateUser(user);
		}
		
	}

	@Override
	public void deleteUser(int id) {
		User user = UserDAOimp.getUserByID(id);
		if(user != null){
			UserDAOimp.deleteUser(id);
		}
	}

	@Override
	public UserDTO getUserByID(int id) {
		User user = UserDAOimp.getUserByID(id);
		UserDTO userdto = new UserDTO();
		userdto.setId(user.getId());
		userdto.setName(user.getName());
		userdto.setAddress(user.getAddress());
		return userdto;
	}

	@Override
	public List<UserDTO> getAllUser() {
		List<UserDTO> ls = new ArrayList<UserDTO>();
		List<User> luser = UserDAOimp.getAllUser();
		for(User user : luser) {
			UserDTO us = new UserDTO();
			us.setId(user.getId());
			us.setName(user.getName());
			us.setAddress(user.getAddress());
			ls.add(us);
		}
		return ls;

	}

}
