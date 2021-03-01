package aulas.oo.part01.paradigma.exemplo001;

public class Carro {
    private int assentos = 5;

    public int getAssentos(){
        return assentos;
    }

    public int adicionaPessoas() {
        assentos = assentos +1;
        return assentos;
    }

    public int removePessoas() {
        assentos = assentos - 1;
        return assentos;
    }
}
