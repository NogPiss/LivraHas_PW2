package br.com.etechoracio.livraria.model;

import br.com.etechoracio.livraria.enums.TipoCapaEnum;

public class Livro {
    private String titulo;
    private String sinopse;
    private double valor;
    private String autor;
    private TipoCapaEnum tipoCapa;
    private int qtdPaginas;
    private Editora editora;

    public void exibirLivro(){
        System.out.println("\n-- Detalhes do livro --");
        System.out.println("Título: " + titulo);
        System.out.println("Sinopse: " + sinopse);
        System.out.println("Valor: " + formataValor(descontoParam(10)));
        System.out.println("Taxa de Envio: " + formataValor(getTaxaEnvio()));
        System.out.println("Autor: " + autor);
        System.out.println("Tipo de capa: " + tipoCapa);
        System.out.println("Quantidade de páginas: " + qtdPaginas);
        //editora.exibirEditora();
    }
    double getTaxaEnvio(){
        return valor * 0.05;
    }
    String formataValor(double param){
        return String.format("R$ %.2f", param);
    }

    double descontoLivro(double valorDescontado){
        return valor - (valor * 0.15);
    }
    double descontoParam(double paramDesconto){
        return valor - (valor * (paramDesconto / 100));
    }

    public void cobrarCapa(){
        if (tipoCapa == TipoCapaEnum.DURA){
            valor = valor + 5;
        } else if (tipoCapa == TipoCapaEnum.PERSONALIZADA) {
            valor = valor + 10;
        }
    }
    public Livro() {
        System.out.println("\nConstruindo um livro........");
        tipoCapa = TipoCapaEnum.COMUM;
    }
    public void setTipoCapa(TipoCapaEnum tipoCapa) {
        this.tipoCapa = tipoCapa;
        cobrarCapa();
    }
    public void setValor(double valor){
        this.valor = valor;
        cobrarCapa();
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo.toUpperCase();
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor.toUpperCase();
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }



}
