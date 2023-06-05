package br.espm.livro.Livraria;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LivroService {

    @Autowired
    private LivroRepository repositorio;

    public List<Livro> list() {
        List<Livro> livros = new ArrayList<>();
        repositorio.findAll().forEach(l ->
            livros.add(new Livro(l.getId(), l.getTitulo(), l.getAutor(), l.getEditora(), l.getAno(), l.getPreco())));
        return livros;
    }

    public Livro find(String id) {
        return repositorio.findById(id)
            .map(l -> new Livro(l.getId(), l.getTitulo(), l.getAutor(), l.getEditora(), l.getAno(), l.getPreco()))
            .orElse(null);
    }

    public void create(Livro livro) {
        repositorio.save(new LivroModel(livro));
    }

    public void delete(String id) {
        repositorio.deleteById(id);
    }
    
}