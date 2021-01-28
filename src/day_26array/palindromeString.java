package day_26array;

public class palindromeString {
    public static void main(String[] args) {

        String[]names={"anna","nalan","hannah","emma","aidai","chris","yasin"};


int count=0;




for (int j=0;j<=names.length-1;j++) {
    String originalname = names[j];//anna
    String reversed = "";
    for (int i = originalname.length() - 1; i >= 0; i--) {
        reversed += originalname.charAt(i);
    }

    if (originalname.equalsIgnoreCase(reversed)) {
        count++;
    }
}

        System.out.println(count);
    }
}
