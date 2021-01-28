package officeHour.practice_11_04_2020;

import java.util.Scanner;

public class frequencyOfsingleChar {
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
      String str =scan.next();
        char ch=scan.next().charAt(0);
        scan.close();
        int frequency=0;
        for (int i=0;i<str.length();i++){
            if (ch==str.charAt(i)){
                frequency++;
            }
        }
        System.out.println(frequency);


    }
}
