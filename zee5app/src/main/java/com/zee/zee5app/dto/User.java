package com.zee.zee5app.dto;

import java.time.LocalDate;
import java.util.Objects;

import lombok.AccessLevel;
//import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
//@AllArgsConstructor
//@NoArgsConstructor

//@ToString(exclude = "userId")
@ToString
public class User {//implements Comparable<User> {
	//@Setter(value = AccessLevel.NONE)
	private String userId;
	private String firstName;
	private String lastName;
	private String email;
	private LocalDate doj;
	private LocalDate dob;	
	private boolean active;
	
		public User() {
		// TODO Auto-generated constructor stub
		//System.out.println("constructor");
	}


	public User(String firstName, String lastName, String email) {
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}


	public User(String firstName, String lastName, String email, LocalDate doj, LocalDate dob,
			boolean active) {
		
		this(firstName,lastName,email,doj,dob);
		this.active = active;
	}


	public User(String firstName, String lastName, String email, LocalDate doj, LocalDate dob) {
		
		this(firstName,lastName,email);
		//this.userId = userId;
		
		this.doj = doj;
		this.dob = dob;
	}


	@Override
	public int hashCode() {
		return Objects.hash(active, dob, doj, email, firstName, lastName, userId);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return active == other.active && Objects.equals(dob, other.dob) && Objects.equals(doj, other.doj)
				&& Objects.equals(email, other.email) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(userId, other.userId);
	}


/*	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return this.userId.compareTo(o.userId);
	}


	*/
	


	
	
	
	
}
