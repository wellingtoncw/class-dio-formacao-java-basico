package aulas.oo.part03.exercicios;

public class ExemploInstancia {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSalario(5000);
        gerente.setNome("Daniel");

        Supervisor supervisor = new Supervisor();
        supervisor.setSalario(2000);
        supervisor.setNome("Bruna");

        Atendente atendente = new Atendente();
        atendente.setSalario(1000);
        atendente.setNome("Marcos");

        System.out.println("O funcionário " +gerente.getNome() +" terá que pagar R$ " +gerente.calculaImposto() +" de imposto!");
        System.out.println("O funcionário " +supervisor.getNome() +" terá que pagar R$ " +supervisor.calculaImposto() +" de imposto!");
        System.out.println("O funcionário " +atendente.getNome() +" terá que pagar R$ " +atendente.calculaImposto() +" de imposto!");
    }
}
