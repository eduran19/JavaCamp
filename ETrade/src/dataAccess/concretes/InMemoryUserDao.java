package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class InMemoryUserDao implements UserDao {

	List<User> users;

	public InMemoryUserDao() {
		users = new ArrayList<User>();
	}

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("Google ile �ye olundu " + user.getFirstName());

	}

	@Override
	public void delete(User user) {
		users.remove(user);
		System.out.println("Kullan�c� silindi : " + user.getFirstName());

	}

	@Override
	public void update(User user) { //sim�lasyon
		System.out.println("Kullan�c� g�ncellendi " + user.getFirstName());

	}

	@Override
	public User getEmail(String email) {
		for(User user:users) {
			if(user.getEmail()==email) {
				return user;
			}
		}
		
		return null;
	}

	@Override
	public User getEmailAndPassword(String email, String password) {
		for(User user:users) {
			if(user.getEmail()==email && user.getPassword()==password) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getAll() {
        
		return users;
	}

}
