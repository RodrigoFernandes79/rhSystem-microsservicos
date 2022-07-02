package com.userapi.services;



import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userapi.domain.User;
import com.userapi.repositories.UserRepository;




@Service

public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	

	public User adicionarUsuarios(User user) {
		User obj = userRepository.save(user);
		
		return obj;
	}


	public List<User> listarUsuarios() {
		List<User> obj = userRepository.findAll();
		return obj;
	}


	public User listarUsuariosPorId(Long id) {
	
		Optional<User> obj = userRepository.findById(id);
				obj.orElseThrow(()-> new RuntimeException("Id " +id + " Não encontrado"));
		return obj.get();
	}

}
