package aulas.oo.part03.exercicios;

public class Gerente extends Funcionario {

    private double imposto = 0.001;

    public double calculaImposto(){
        return this.getSalario() * imposto;
    }
}
