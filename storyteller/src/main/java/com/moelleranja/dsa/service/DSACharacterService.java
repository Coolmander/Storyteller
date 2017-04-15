package com.moelleranja.dsa.service;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moelleranja.dsa.model.DSACharacter;
import com.moelleranja.dsa.repository.DSACharacterRepository;

@Service
@Transactional
public class DSACharacterService {
	
	@Autowired
	private DSACharacterRepository characterRepository;
	
	public DSACharacterService(DSACharacterRepository characterRepository) {
		this.characterRepository = characterRepository;
	}

	public List<DSACharacter> findAll() {
		return characterRepository.findAll();
	}

}
