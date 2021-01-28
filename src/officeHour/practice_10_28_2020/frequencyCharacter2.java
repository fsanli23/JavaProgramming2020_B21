package officeHour.practice_10_28_2020;

public class frequencyCharacter2 {
    public static void main(String[] args) {

    String str="abababab";

    char ch='a';
    int count=0;
while(str.contains(ch+"")){
    str=str.replaceFirst(""+ch,"");
    count++;
}

        System.out.println(count);








    }
}
