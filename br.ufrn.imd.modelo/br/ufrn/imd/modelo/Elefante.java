package br.ufrn.imd.modelo;

public class Elefante extends Animal{
    private double tamanhoTromba;

    public Elefante() {
        super();
        this.setAlimentado(false);
    }

    public double getTamanhoTromba() {
        return tamanhoTromba;
    }

    public void setTamanhoTromba(double tamanhoTromba) {
        this.tamanhoTromba = tamanhoTromba;
    }

    public void comer(){
        this.setAlimentado(true);
        double alimento = this.getPeso() * 0.15;
        this.setQuantidadeAlimentado(alimento);
        System.out.println("Se alimentou com "+alimento+"g de comida");
    }
}
