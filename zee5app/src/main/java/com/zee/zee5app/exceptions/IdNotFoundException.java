package com.zee.zee5app.exceptions;

public class IdNotFoundException extends Exception {
	//toString method
	//super call
	
	public IdNotFoundException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
	
	

}
