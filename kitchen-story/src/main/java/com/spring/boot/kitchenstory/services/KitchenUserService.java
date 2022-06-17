package com.spring.boot.kitchenstory.services;

import java.util.List;

import com.spring.boot.kitchenstory.entities.KitchenUserRegistered;

public interface KitchenUserService {
	
	public boolean addUserSignUp(KitchenUserRegistered user);
	
	public List<KitchenUserRegistered> getAllUser();
	
	public KitchenUserRegistered getUser(int user_id);
	
	public KitchenUserRegistered updateUserPassword(int user_id, KitchenUserRegistered user);

}
