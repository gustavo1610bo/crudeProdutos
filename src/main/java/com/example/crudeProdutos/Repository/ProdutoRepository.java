package com.example.crudeProdutos.Repository;

import com.example.crudeProdutos.Models.ProdutoModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModels, Long> {
}
