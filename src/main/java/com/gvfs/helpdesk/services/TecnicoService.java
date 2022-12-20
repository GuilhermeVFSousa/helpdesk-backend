package com.gvfs.helpdesk.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gvfs.helpdesk.domain.Tecnico;
import com.gvfs.helpdesk.repositories.TecnicoRepository;
import com.gvfs.helpdesk.services.exceptions.ObjectNotFoundException;

@Service
public class TecnicoService {
	
	@Autowired
	private TecnicoRepository repository;
	
	public Tecnico fidnById(Integer id) {
		Optional<Tecnico> obj = repository.findById(id);
		return obj.orElseThrow(() ->  new ObjectNotFoundException("Objeto não encontrado! Id: " + id));
	}

}
