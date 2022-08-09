package com.zee.zee5app.utils;

import java.util.Comparator;

import com.zee.zee5app.dto.User;

public class IdComparator implements Comparator<User> {

	@Override
	public int compare(User u1, User u2) {
		// TODO Auto-generated method stub
		return u1.getUserId().compareTo(u2.getUserId());
	}

}
