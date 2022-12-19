package com.gvfs.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gvfs.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
