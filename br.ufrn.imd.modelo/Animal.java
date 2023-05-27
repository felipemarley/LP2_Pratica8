import java.time.LocalDate;
import java.time.Period;

public abstract class Animal{

    private String nome;
    private LocalDate dataNascimento;
    private double peso;
    private String tipoAlimentacao;
    private boolean alimentado;
    private double quantidadeAlimentado;

    public abstract void comer();

    public int calcularIdade(Animal a){
        LocalDate hoje = LocalDate.now();
        return Period.between(a.dataNascimento, hoje).getYears();
    }

    public String getNome() {
        return nome;
    }
    public void setIdade(String nome) {
        this.nome = nome;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getTipoAlimentacao() {
        return tipoAlimentacao;
    }
    public void setTipoAlimentacao(String tipoAlimentacao) {
        this.tipoAlimentacao = tipoAlimentacao;
    }
    public boolean isAlimentado() {
        return alimentado;
    }
    public void setAlimentado(boolean alimentado) {
        this.alimentado = alimentado;
    }

    public double getQuantidadeAlimentado() {
        return quantidadeAlimentado;
    }

    public void setQuantidadeAlimentado(double quantidadeAlimentado){
        this.quantidadeAlimentado = quantidadeAlimentado;
    }
    
    public double setQuantidadeAlimentado(){
        return quantidadeAlimentado;
    }
    
}