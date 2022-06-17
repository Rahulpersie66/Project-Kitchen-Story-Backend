package com.spring.boot.kitchenstory.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.kitchenstory.entities.KitchenUserRegistered;
import com.spring.boot.kitchenstory.repositories.KitchenUserDao;
import com.spring.boot.kitchenstory.services.KitchenUserService;

@Service
public class KitchenUserServiceImpl implements KitchenUserService {

	@Autowired
	private KitchenUserDao userDao; 
	
	//addd the USer signUp
	@Override
	public boolean addUserSignUp(KitchenUserRegistered user) {
		boolean flag=false;
		userDao.save(user);
		flag=true;
		return flag;
	}

	@Override
	public List<KitchenUserRegistered> getAllUser() {
		return userDao.findAll();
	}

	@Override
	public KitchenUserRegistered getUser(int user_id) {
		return userDao.findById(user_id).get();
	}

	@Override
	public KitchenUserRegistered updateUserPassword(int user_id, KitchenUserRegistered user) {
		KitchenUserRegistered user1=userDao.findById(user_id).get();
		user1.setPassword(user.getPassword());
		user1.setFullName(user.getFullName());
		user1.setEmail(user.getEmail());
		user1.setAddress(user.getAddress());
		return userDao.save(user1);
	}

}
