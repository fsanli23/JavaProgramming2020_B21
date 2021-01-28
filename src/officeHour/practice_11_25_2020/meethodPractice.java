package officeHour.practice_11_25_2020;

public class meethodPractice {
    public static void main(String[] args) {

        divisibleby3();
        System.out.println("hello");
        divisibleby3start(5, 50);
        grade(-2);
        eligiblevote(25, true);


    }


    public static void divisibleby3() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void divisibleby3start(int start, int end) {
        if (end <= start) {
            return;
        }
        for (int i = start; i <= end; i++) {
            if (i % 3 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void grade(int score) {
        if (score < 0 || score > 100) {
            System.out.println("invalid score");
            return;
        }
        char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';

    }

    public static <blooean> void eligiblevote(int age, boolean isuscitizien) {
        if (age < 18) {
            System.out.println("you must be at leat 18 years old");
            return;
        }
        if (isuscitizien == false) {
            System.out.println("you must be us citizien");
            return;
        }
        System.out.println("you are eligible to vote");

    }
}
