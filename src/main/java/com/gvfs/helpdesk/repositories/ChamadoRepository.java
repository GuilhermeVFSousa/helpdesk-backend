package com.gvfs.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gvfs.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
