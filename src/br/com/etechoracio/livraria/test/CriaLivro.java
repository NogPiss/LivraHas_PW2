package br.com.etechoracio.livraria.test;

import br.com.etechoracio.livraria.enums.TipoCapaEnum;
import br.com.etechoracio.livraria.model.Editora;
import br.com.etechoracio.livraria.model.Kindle;
import br.com.etechoracio.livraria.model.Livro;

public class CriaLivro {
    public static void main(String[] args) {
        Editora rocco = new Editora();
        rocco.setNome("Rocco");
        rocco.setSite("http://www.rocco.com.br");

        Livro primeiroLivro = new Livro();
        primeiroLivro.setTitulo("Harry Potter e as preda");
        primeiroLivro.setSinopse("Uma pá de magia");
        primeiroLivro.setValor(100);
        primeiroLivro.setAutor("J.K.Rowling");
        primeiroLivro.setEditora(rocco);
        primeiroLivro.setTipoCapa(TipoCapaEnum.DURA);
        primeiroLivro.setQtdPaginas(321);
        primeiroLivro.cobrarCapa();
        primeiroLivro.exibirLivro();

        Livro segundoLivro = new Livro();
        segundoLivro.setTitulo("Receba essa pedrada");
        segundoLivro.setAutor("Qorrex");
        segundoLivro.setEditora(rocco);
        segundoLivro.exibirLivro();

        Kindle terceiroLivro = new Kindle();
        terceiroLivro.setAutor("and_nog");
        terceiroLivro.setTitulo("pedrada");
        terceiroLivro.setSinopse("brabo");
        segundoLivro.setEditora(rocco);
        terceiroLivro.exibirLivro();


    }
}


