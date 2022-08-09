package com.zee.zee5app.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Optional;

import com.zee.zee5app.dto.User;
import com.zee.zee5app.exceptions.NoDataFoundException;
import com.zee.zee5app.utils.DBUtils;

public class UserRepo2Impl implements UserRepo {

	private DBUtils dbUtils=DBUtils.getInstance();
	@Override
	public User insertUser(User user) {
		// TODO Auto-generated method stub
		
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		connection=dbUtils.getConnection();
		
		
		
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
		return null;
	}

	@Override
	public Optional<List<User>> getAllUsers() {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<User> getUserByUserId(String userId) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
