package com.generation.starbemfarma.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.starbemfarma.model.Produto;


@Repository
public interface ProdutoRepository  extends JpaRepository <Produto, Long>{
	public List <Produto> findAllByNomeoContainingIgnoreCaseOrderByNome
	(@Param("nome") String nome);
	
}