package br.ufrn.imd.modelo;

public class Tigre extends Animal{
    private String tipoTigre;

    public Tigre() {
        super();
        this.setAlimentado(false);
    }

    public String getTipoTigre() {
        return tipoTigre;
    }

    public void setTipoTigre(String tipoTigre) {
        this.tipoTigre = tipoTigre;
    }

    public void comer(){
        this.setAlimentado(true);
        double alimento = this.getPeso() * 0.04;
        this.setQuantidadeAlimentado(alimento);
        System.out.println("Se alimentou com "+alimento+"g de comida");
    }
}
