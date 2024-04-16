package br.com.etechoracio.livraria.test;

import br.com.etechoracio.livraria.model.Livro;

public class TestaReferencias {

    public static void main(String[] args) {
        Livro livroA = new Livro();
        livroA.setTitulo("Teste_de_Referencia");
        livroA.setAutor("Adonias");
        System.out.println("LivroA: " + livroA.getTitulo());
        System.out.println("LivroA: " + livroA.getAutor());

        Livro livroB = livroA;
        System.out.println("LivroB: " + livroB.getTitulo());
        System.out.println("LivroB: " + livroA.getAutor());
        livroB.setTitulo("Teste_de_Referencia2");
        System.out.println("LivroB: " + livroB.getTitulo());
        System.out.println("LivroA: " + livroA.getTitulo());

        System.out.println(livroA);
        System.out.println(livroB);


    }

}
