package com.gvfs.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gvfs.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
