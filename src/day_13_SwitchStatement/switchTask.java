package day_13_SwitchStatement;

public class switchTask {
    public static void main(String[] args) {
 /*       Create a new switch statement using char instead of int.
§ Create a new char variable
§ Create a switch statement testing for A, B, C, D or E
§ Display a message if any of these are found and then break
§ Add a default which displays a message saying not found.*/
        String result = "";
        char testing = 'k';
        switch (testing) {
            case 'B':
                result = "good";
                break;
            case 'C':
                result = "not passed";
                break;
            case 'A':
                result = "great";
                break;
            default:
                result = "not found";
                break;


        }
        System.out.println(result);

    }
}
