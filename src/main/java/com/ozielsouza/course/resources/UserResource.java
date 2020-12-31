package com.ozielsouza.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ozielsouza.course.entities.User;

@RestController  //Para implementar um recurso web
@RequestMapping(value = "/users") //Inclusão de nome para o recurso
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Oziel", "ozysouza@gmail.com", "865974697", "123456");
		return ResponseEntity.ok().body(u);
	}

}
