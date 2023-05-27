public class Girafa extends Animal{
    private double tamanhoLingua;

    public Girafa() {
        super();
        this.setAlimentado(false);
    }
    
    public double getTamanhoLingua() {
        return tamanhoLingua;
    }

    public void setTamanhoLingua(double tamanhoLingua) {
        this.tamanhoLingua = tamanhoLingua;
    }

    public void comer(){
        this.setAlimentado(true);
        double alimento = this.getPeso() * 0.10;
        this.setQuantidadeAlimentado(alimento);
        System.out.println("Se alimentou com "+alimento+"g de comida");
    }
}
