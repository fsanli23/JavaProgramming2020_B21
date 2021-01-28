package day_28_multiDimensionalArray;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

      /*  ScrumTeam
        Testers:  {"Dorin", "Adil", "Fatih", "Subhi"}
        Developers: {"Kastrinsi", "Mustafa", "Ruslan"}
        SM: {"Ayse"}
        PO: {"Omid"}
        BA: {"Agalar"}
*/

String[][] ScrumTeam={
        {"Dorin", "Adil", "Fatih", "Subhi"},
        {"Kastrinsi", "Mustafa", "Ruslan"},
        {"Ayse"},
        {"Omid"},
        {"Agalar"}
};

        System.out.println(Arrays.deepToString(ScrumTeam));

       for(int i=0;i<=ScrumTeam.length-1;i++){
           System.out.println(Arrays.toString(ScrumTeam[i]));
       }





    }
}
