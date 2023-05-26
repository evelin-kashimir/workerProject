package io.github.evelinferraz.worker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.evelinferraz.worker.entity.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
