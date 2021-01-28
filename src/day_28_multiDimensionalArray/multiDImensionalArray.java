package day_28_multiDimensionalArray;

import java.util.Arrays;

public class multiDImensionalArray {
    public static void main(String[] args) {


        String[][] batch21 = {
                {"Lily","Lana","Igor"} ,   //0

                {"Polina", "Serhii", "Abdujilil", "Aziz", "Halzat" } ,  //1

                {"Justyna", "Adil","Ercan","Irina","Med", "Olesea","Vlad","Asuman","Guvanch"},//2

        };

for (int i=0;  i<=batch21.length-1;i++){
    System.out.println(Arrays.toString(batch21[i]));
    for (int j=0;j<=batch21[i].length-1;j++){
        System.out.println(batch21[i][j]);
    }
}





    }
}
