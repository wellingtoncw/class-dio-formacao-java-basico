package aulas.oo.part03.exercicios;

public class ArrayMult {
    public static void main(String[] args) {
        int [][] meuArrayMulti = {{1,2,3,4,}, {5,6,7,}};

        //percorrendo Arrays Multidimensionais
        for(int i = 0; i < meuArrayMulti.length; i++){
            for(int j = 0; j < meuArrayMulti[i].length; j++){
                System.out.println(meuArrayMulti[i][j]);
            }
        }
    }
}
