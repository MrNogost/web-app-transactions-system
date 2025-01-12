package com.portfolio.web_app_transactions_system.repositories;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import com.portfolio.web_app_transactions_system.model.Client;

public interface ClientsRepository extends CrudRepository<Client, Long> { //First generic type value = Model Class. Second type = Primary Key. 
	
	@Query("SELECT * FROM clients WHERE name = :name")
	List<Client> findClientByName(String name);
	
	@Modifying
	@Query("UPDATE clients SET amount = :amount WHERE id = :id")
	void changeAmount(long id, BigDecimal amount);
}
