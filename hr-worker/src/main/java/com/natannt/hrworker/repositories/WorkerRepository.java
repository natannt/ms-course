package com.natannt.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natannt.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
