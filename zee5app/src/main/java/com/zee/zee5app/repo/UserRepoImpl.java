package com.zee.zee5app.repo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.zee.zee5app.dto.User;
import com.zee.zee5app.exceptions.NoDataFoundException;

public class UserRepoImpl implements UserRepo {
	
	//private List<User> users=new ArrayList<User>();
	//private List<User> users=new LinkedList<User>();
	
	Set<User> users=new HashSet<User>();
	
	private UserRepoImpl() {
		// TODO Auto-generated constructor stub
	}
	
	
	private static UserRepo userRepo;
	public static UserRepo getInstance()
	{
		if(userRepo==null)
			userRepo=new UserRepoImpl();
		
		return userRepo;
	}
	

	@Override
	public User insertUser(User user) {
		// TODO Auto-generated method stub
		
		boolean result=users.add(user);
		if(result)
		{
			return user;
		}
		else
		return null;
	}

	@Override
	public User updateUser(String userId, User user) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public String deleteUser(String userId) throws NoDataFoundException {
		// TODO Auto-generated method stub
		Optional<User> optional=this.getUserByUserId(userId);
		
//		int index=users.indexOf(optional.get());
		
		
		if(optional.isPresent())
		{
			users.remove(optional.get());
			return "success";
		}
			throw new NoDataFoundException("id not present");
		
	}
	
	
	

	/*
	 @Override
	public Optional<User[]> getAllUsers() {
		// TODO Auto-generated method stub
		if(this.users.isEmpty())
		{
			return Optional.empty();
		}
		User[] users=new User[this.users.size()];
		this.users.toArray(users);
		
		
		return Optional.of(users);
	
	}
	*/
	
	
	@Override
	public Optional<List<User>> getAllUsers() {
		// TODO Auto-generated method stub
		if(this.users.isEmpty())
		{
			return Optional.empty();
		}
		
		
		return Optional.of(new ArrayList<>(this.users));
	
	}
	
	

	@Override
	public Optional<User> getUserByUserId(String userId) {
		// TODO Auto-generated method stub
	for (User user : users) {
		if(user!=null && userId.equals(user.getUserId()))
		{
			return Optional.of(user);
		}
		
			
	}
		return Optional.empty();//instead of null use optional class from java 8 to handle null ptr exception
	}

}
