package officeHour.practice_11_27_2020;

public class CharacterPractice {
    public static void main(String[] args) {
int count=0;
        for (int i=1;i<=Character.MAX_VALUE;i++){
            char each=(char)i;
            if (Character.isLetter(each))
            System.out.print(each+" ");
count++;
        }

        System.out.println(count);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
