package io.github.lucaslira.domain.repository;

import io.github.lucaslira.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Integer> {
}
