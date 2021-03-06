package aulas.oo.part03.exercicios;

public class Atendente extends Funcionario{
    private double imposto = 0.0001;

    public double calculaImposto(){
        return this.getSalario() * imposto;
    }
}
