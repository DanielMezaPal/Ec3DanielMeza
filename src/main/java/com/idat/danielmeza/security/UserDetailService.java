package com.idat.danielmeza.security;

import java.util.ArrayList;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailService implements UserDetailsService{	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if("Daniel".equals(username)) {
		return new User("Daniel","qwerty",new ArrayList<>());
		}else
			throw new UsernameNotFoundException("Usuario no existe "+username);	
	}
}
