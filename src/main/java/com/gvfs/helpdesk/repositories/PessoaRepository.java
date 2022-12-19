package com.gvfs.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gvfs.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
