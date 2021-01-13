package com.maven.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maven.curso.entities.User;
import com.maven.curso.repositories.UserRepository;
import com.maven.curso.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {
	
	@Autowired // faz a injeção de dependência
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);		
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	//Salvar um usuário no banco de dados retornando o usuário salvo
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public User update(Long id, User obj) {
		User entity = repository.getOne(id);
		updateDate(entity, obj);
		return repository.save(entity);	
	}

	private void updateDate(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}

}
