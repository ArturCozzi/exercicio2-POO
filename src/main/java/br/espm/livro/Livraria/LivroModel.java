package br.espm.livro.Livraria;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "livro")
public class LivroModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private String id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "autor")
    private String autor;

    @Column(name = "editora")
    private String editora;

    @Column(name = "ano")
    private int ano;
    
    @Column(name = "preco")
    private Double preco;

    public String getId() {
        return this.id;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public String getAutor() {
        return this.autor;
    }
    public String getEditora() {
        return this.editora;
    }
    public int getAno() {
        return this.ano;
    }
    public double getPreco() {
        return this.preco;
    }
    
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public LivroModel(){

    }
    public LivroModel(Livro to) {
        this.id = to.id();
        this.titulo = to.titulo();
        this.autor = to.autor();
        this.editora = to.editora();
        this.ano = to.ano();
        this.preco = to.preco();
    }
}


