package br.com.etechoracio.livraria.model;

public class Kindle extends Livro{
    private String MarcaDAgua;

    @Override
    double descontoParam(double paramDesconto) {
        return super.descontoParam(paramDesconto);
    }
}
