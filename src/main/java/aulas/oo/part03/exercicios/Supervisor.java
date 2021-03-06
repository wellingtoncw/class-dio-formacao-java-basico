package aulas.oo.part03.exercicios;

public class Supervisor extends Funcionario{
    private double imposto = 0.0005;

    public double calculaImposto(){
        return this.getSalario() * imposto;
    }
}
