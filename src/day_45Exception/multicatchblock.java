package day_45Exception;

import com.sun.org.apache.xalan.internal.xsltc.compiler.CompilerException;

import java.util.NoSuchElementException;

public class multicatchblock {
    public static void main(String[] args) {
     /*   try {
            System.out.println(20 / 0);
        } catch (NoSuchElementException e) {
            System.out.println("no such element exception");
        }catch (ClassCastException e){
            System.out.println("class catch exception");
        }
*/
        System.out.println("----------------------------------------------------------------------");

     /*   try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/
        String []names={"walid","agalar","ayjeren"};



        try {
            names[10] = "muhtar";//arrayindex out of bond

        }catch (IllegalArgumentException e){
            System.out.println("illegal argument exception");
        }catch (NoSuchElementException e){
            System.out.println("no such element exception");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException");
        }catch (RuntimeException e){
            System.out.println("runtime exception");
        }




    }
}
