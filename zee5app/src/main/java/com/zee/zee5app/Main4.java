package com.zee.zee5app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import com.zee.zee5app.dto.User;
import com.zee.zee5app.exceptions.NoDataFoundException;
import com.zee.zee5app.service.UserService;
import com.zee.zee5app.service.UserServiceImpl;
import com.zee.zee5app.utils.IdComparator;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserService userService=UserServiceImpl.getUserServiceInstance();
		
		userService.insertUser(new User("110","lakshmi","m","lakshmi@iitk.ac.in",LocalDate.of(2000,5,9),LocalDate.of(2022,7,18),true) );

		userService.insertUser(new User("101","mamtha","m","mamtha@iitk.ac.in",LocalDate.of(2000,5,9),LocalDate.of(2022,7,18),true) );
		
		
		Optional<User> result=userService.getUserByUserId("100");
		
		if(!result.isPresent())
		{
			System.out.println("no record found");
		}
		else
		{
			User user=result.get();
			System.out.println(user);
		}
		
		Optional<User[]> all=userService.getAllUsers();
		
		User[] user=all.get();
		
		//Collections.sort(all);
		
		for (User i : user) {
			System.out.println(i);
			
		}
		
		
		try {
			String d=userService.deleteUser("101");
			System.out.println(d);
			
		} catch (NoDataFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		List<User> list=new ArrayList<>();
		for (User u : user) {
			list.add(u);
			
		}
		//using separate class
		Collections.sort(list,new IdComparator());
		list.forEach(System.out::print);
		
		//same class declaration
		Comparator<User> comparator=new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		//method3 
		
		Comparator<User> com=(e1,e2)->{
				
			return 0;
		};
		
		
		//method4
		
		Comparator<User> com4=(e1,e2)->
		e1.getUserId().compareTo(e2.getUserId());
				
		
	}


}
