package day_27_forEachLoop;

public class firstThreeCharacters {
    public static void main(String[] args) {


      String[] names={ "erjon","katrin","aamir","lola","oguzhan","aibek","elvin","ilgar","nadira" };


        for (String each:names) {
            System.out.println(each.substring(0,3));
        }

        System.out.println("=========================================================================");




    }
}
