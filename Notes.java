public class Note{
    public static void main(String[]args){
     //x++; means the same as x = x +1;
//x--; means the same as x = x – 1;
//x++ is the same as ++x (the ++ can be on either side of x)
//x-- is the same as --x (the -- can be on either side of x)   
// -=-->=a-b
// int will only give integer
    int q=78;
    int p =2+q++;
    System.out.println("p= "+p+",q= "+q);

    int q=78;
    int p=++q+2;
    System.out.println("p= " +p+",q= "+q);
    //x++/x-- increments or decrements after it is used in the statement
    //++x/--x increments or decrements before it

    }
}