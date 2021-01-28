package day07_UnaryOperator;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class PostPre {
    public static void main(String[] args) {



         int x=2;
         int y=x++;// post increment=first passes current value.
        System.out.println(x);
        System.out.println(y);

        int x2=2;
        System.out.println(x2++);
        System.out.println(x2);


        int x3=2;
        System.out.println(x3--);

int a=1;
int b=-a--+a++/-a--*--a;

        System.out.println(b);


        int t=100;
        int p=-++t*-t--/t+++--t;
        System.out.println(p);

        int R=20;
        int V=-R--+-R+++--R*R--%2;
        System.out.println(V);


        int m=300;
        int n=400;
        int u=++m+n++-m--%2+--n%2;

        System.out.println(u);
        float ll=25.3333f;
 int kk= (int) 525252525l;
        System.out.println(kk);
    }

}
