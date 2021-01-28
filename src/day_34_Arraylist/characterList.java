package day_34_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class characterList {
    public static void main(String[] args) {

        String str = "abcd234#$T$%rwe35667r45fgf#$%$^";
        ArrayList<String> digits = new ArrayList<>(Arrays.asList(str.split("")));
        digits.removeIf(p->Character.isDigit(p.charAt(0)));

        ArrayList<String> letter = new ArrayList<>();


        ArrayList<String> special = new ArrayList<>();


    }
}
