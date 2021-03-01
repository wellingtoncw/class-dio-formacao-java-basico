package aulas.oo.part01.paradigma.exemplo001;

public class ExemploInstanciaCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(carro.getAssentos());
        System.out.println(carro.adicionaPessoas());
        System.out.println(carro.removePessoas());
    }
}
