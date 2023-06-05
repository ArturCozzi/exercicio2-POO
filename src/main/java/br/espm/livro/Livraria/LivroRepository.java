package br.espm.livro.Livraria;

import org.springframework.data.repository.CrudRepository;

public interface LivroRepository extends CrudRepository<LivroModel, String> {

}