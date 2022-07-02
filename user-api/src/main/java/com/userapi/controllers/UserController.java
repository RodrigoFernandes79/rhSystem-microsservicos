package com.userapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userapi.domain.User;
import com.userapi.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping
	public ResponseEntity<User> adicionarUsuarios(@RequestBody User user){
		
		User obj = userService.adicionarUsuarios(user);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(obj);
	}
	
	
	@GetMapping
	public ResponseEntity<List<User>> listarUsuarios(){
		
		List<User> obj = userService.listarUsuarios();
		
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> listarUsuariosPorId( @PathVariable Long id){
		
		User obj = userService.listarUsuariosPorId(id);
		return ResponseEntity.ok().body(obj);
		
	}

}
