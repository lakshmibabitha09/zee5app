package com.zee.zee5app;

import java.time.LocalDate;

import com.zee.zee5app.dto.User;
import com.zee.zee5app.exceptions.UnableToGenerateIdException;
import com.zee.zee5app.service.UserService;
import com.zee.zee5app.service.UserServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserService userService = UserServiceImpl.getInstance();
		try {
			userService.insertUser(new User("abhi","chivate","abhi6@gmail.com",LocalDate.now(),LocalDate.of(1988, 12, 9)));
			userService.insertUser(new User("abhii","chivatee","abhii7@gmail.com",LocalDate.now(),LocalDate.of(1988, 12, 10)));
		} catch (UnableToGenerateIdException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
