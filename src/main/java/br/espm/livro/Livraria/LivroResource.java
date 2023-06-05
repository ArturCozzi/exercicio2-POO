package br.espm.livro.Livraria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class LivroResource {

    @Autowired
    public LivroService service;

    @GetMapping("/livros")
    public List<Livro> getLivros(@RequestParam(name = "titulo", defaultValue = "") String titulo) {
        return (titulo.length() > 0)
            ? service.list().stream().filter(l -> l.titulo().toLowerCase().contains(titulo.toLowerCase())).toList()
            : service.list();
    }

    @GetMapping("/livros/{id}")
    public Livro getLivro(@PathVariable("id") String id) {
        return service.find(id);
    }
    
    @PostMapping("/livros")
    public void postLivro(@RequestBody Livro in) {
        service.create(in);
    }

    @DeleteMapping("/livros/{id}")
    public void deleteLivro(@PathVariable("id") String id) {
        service.delete(id);
    }
    
}
