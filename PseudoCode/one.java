package PseudoCode;

public class one {
    
    public static int func(int a , int b){

        if (a < b)
        return func (b, a);
        else if (b != 0)
        return (a * func (a, b - 1));
        else

        return 0;
    }

    public static void main(String[] args) {
        int a = 5 ;
         int b = 5;
         System.out.println(func(a, b));
    }
}
