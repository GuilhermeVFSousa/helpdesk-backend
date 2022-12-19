package com.gvfs.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gvfs.helpdesk.domain.Chamado;
import com.gvfs.helpdesk.domain.Cliente;
import com.gvfs.helpdesk.domain.Tecnico;
import com.gvfs.helpdesk.domain.enums.Perfil;
import com.gvfs.helpdesk.domain.enums.Prioridade;
import com.gvfs.helpdesk.domain.enums.Status;
import com.gvfs.helpdesk.repositories.ChamadoRepository;
import com.gvfs.helpdesk.repositories.ClienteRepository;
import com.gvfs.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	

	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	
	public void instanciaDB() {
		
		Tecnico tec1 = new Tecnico(null, "Guilherme Sousa", "44411122208", "guilherme@email.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1  = new Cliente(null, "Linus Torvalds", "11122233344", "linus@email.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
		
		
	}

}
