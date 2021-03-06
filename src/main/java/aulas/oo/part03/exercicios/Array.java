package aulas.oo.part03.exercicios;

public class Array {
    public static void main(String[] args) {
        //declarando array simpes
        int[] meuArray = new int[7];

        //declaração de array atribuindo valores
        int[] meuArray2 = {1,2,3,4,5,6,7};

        System.out.println(meuArray[5]);
        System.out.println(meuArray2[0]);

        //alterando o valor do indice 2 para 10
        //meuArray2[2] = 10;
        //System.out.println(meuArray2[2]);

        //comprimento do Array
        System.out.println(meuArray2.length);

        // enquanto o i for menor que o tamanho do array...
        for (int i =0; i<meuArray2.length; i++){
            System.out.println(meuArray2[i]);
        }
    }
}
