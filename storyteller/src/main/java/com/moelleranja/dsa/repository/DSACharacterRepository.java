package com.moelleranja.dsa.repository;

import java.util.List;
import com.moelleranja.dsa.model.DSACharacter;

import org.springframework.data.repository.CrudRepository;

public interface DSACharacterRepository extends CrudRepository<DSACharacter, String> {
	public List<DSACharacter> findAll();
}
