package br.com.unitary.tests;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.unitary.tests.domain.Categoria;
import br.com.unitary.tests.domain.Livro;
import br.com.unitary.tests.repositories.CategoriaRepository;
import br.com.unitary.tests.repositories.LivroRepository;

@SpringBootApplication
public class UnitaryTestsApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private LivroRepository livroRepository;

	
	public static void main(String[] args) {
		SpringApplication.run(UnitaryTestsApplication.class, args);		
		
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática", "Livros de TI");
		
		Livro l1 = new Livro(null, "Clean Code", "Robert Martin", "Loren ipsum", cat1);
		
		cat1.getLivros().addAll(Arrays.asList(l1));
		
		this.categoriaRepository.saveAll(Arrays.asList(cat1));
		this.livroRepository.saveAll(Arrays.asList(l1));

		
		
	}
	
	

}
