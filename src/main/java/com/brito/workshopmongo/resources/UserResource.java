package com.brito.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brito.workshopmongo.domain.User;

import ch.qos.logback.core.joran.spi.HttpUtil.RequestMethod;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll () {
		
		User maria = new User ("1", "Maria Silva", "maria@gmail.com");
		User maria = new User ("1", "Maria Silva", "maria@gmail.com");
		List<User> list = new ArrayList <>();
		list.addAll(Arrays.asList(maria,alex));
		return ResponseEntity.ok().body(list);
	}
	
}
