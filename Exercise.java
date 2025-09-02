public class Exercise{
    public static void main(String[]args){
        //exercise 1 answer:109  104
        int h=103;
        int p =5;
        System.out.println(++h+p);
        System.out.println(h);

        //e2: x++  x+=1  x=x+1

        //e3: 1992.37
        double def;
        double f=1992.37;
        def=f;
        System.out.println(def);

        //4  System.out.println(zulu--);

        //5 b=3
        int a=100;
        int b=200;
        b/=a;
        System.out.println(b+1);
        
        //6 v-=(p-30);

        //7 v=v-(p-30);

        //8  answer:-22
        int k=40;
        int q=4;
        System.out.println(2+8 *q/2-k);

        //9  answer:2   5
        int sd =12;
        int x=4;
        System.out.println(sd%(++x));
        System.out.println(x);

        //10  answer 316
        int g;
        g=3;//there is an error in the textbook (3=g)
        System.out.println(++g*79);

        //11 answer: double m = 3.14, b = 3.14, f = 3.14;

        //12  answer: int x,y,z;

        //13  answer:7
        int m = 36;
        int j = 5;
        m = m / j; 
        System.out.println(m);
        
        //14 answer:21 (integer division in the case of without put them as double)
        System.out.println(3/4 + 5*2/33 - 3 + 8*3);

        //15 answer: =

        //16 answer:int k = i % j;

        //17 answer:4
        int j = 2;
        System.out.println(7 % 3 + j++ + (j - 2));

        //18    j = j - 1;    j -= 1;     j--;
    }
}