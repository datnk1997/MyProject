package aht.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import aht.Entity.User;
import aht.Model.UserDTO;

@Repository
public class UserDAOimp implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addUser(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

	@Override
	public void updateUser(User user) {
		sessionFactory.getCurrentSession().merge(user);
	}

	@Override
	public void deleteUser(int id) {
		sessionFactory.getCurrentSession().delete(getUserByID(id));
	}

	@Override
	public User getUserByID(int id) {
		return (User) sessionFactory.getCurrentSession().get(User.class, id);
	}
	@Override
	public List<User> getAllUser() {
		/*String sql = "Select * from Users";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(sql);
		return query.list();*/
		Criteria cri = sessionFactory.getCurrentSession().createCriteria(User.class);
		return cri.list();
	}

}
