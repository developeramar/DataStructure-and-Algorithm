public class practice {
    
    public static int getValue(int num){
        return num * num ;
    }

    public static void main(String[] args) {
        for(int i = 1 ; i <= 50 ; i++){
            int res = getValue(i);

            System.out.println("the square of " + i +" is --> " + res);
        }
    }
}
