package aulas.oo.part02.construtores.exercicios;

public class ExemploInstanciaCarro {
    public static void main(String[] args) {

        Carro carro = new Carro("Volksvagem", "Gol", 2010);

        carro.setVariante("Gol Bolinha");

        System.out.println("Ano do veículo: " +carro.getAno());
        System.out.println("Marca do veículo: " +carro.getMarca());
        System.out.println("Modelo do veículo: " +carro.getModelo());
        System.out.println("Variante do veículo: " +carro.getVariante());
    }
}
