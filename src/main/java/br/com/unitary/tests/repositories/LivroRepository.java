package br.com.unitary.tests.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unitary.tests.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer>{

	
	
}
