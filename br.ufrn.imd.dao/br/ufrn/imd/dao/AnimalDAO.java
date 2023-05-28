package br.ufrn.imd.dao;

import br.ufrn.imd.modelo.*;
import java.util.ArrayList;


public class AnimalDAO{

    private ArrayList<Animal> jaulas;

    public AnimalDAO(){
        jaulas = new ArrayList<Animal>();
    }

    public void adicionarAnimal(Animal a){
        jaulas.add(a);
        System.out.println("Animal Adicionado!");
    }

    public void removerAnimal(int index){
        jaulas.remove(index);
        System.out.println("Animal Removido!");
    }

    public void listarAnimais(){
        for(Animal a : jaulas){
            if(a instanceof Girafa){
                System.out.println("----------------------------------");
                System.out.println("Nome: "+ a.getNome()+ " Idade: "+ a.calcularIdade(a)+ " Peso: "+ a.getPeso()
                +"Tipo de Alimento: "+ a.getTipoAlimentacao()+ "Tamanho da Lingua: "+ a.getTamanhoLingua());
            }
            if(a instanceof Elefante){
                System.out.println("----------------------------------");
                System.out.println("Nome: "+ a.getNome()+ " Idade: "+ a.calcularIdade(a)+ " Peso: "+ a.getPeso()
                +"Tipo de Alimento: "+ a.getTipoAlimentacao()+ "Tamanho da Tromba: "+ a.getTamanhoTromba());
            }
            if(a instanceof Tigre){
                System.out.println("----------------------------------");
                System.out.println("Nome: "+ a.getNome()+ " Idade: "+ a.calcularIdade(a)+ " Peso: "+ a.getPeso()
                +"Tipo de Alimento: "+ a.getTipoAlimentacao()+ "Tipo de Tigre: "+ (a.getTipoTigre()));
            }
        }
    }
}