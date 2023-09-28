package Tricky_Questions;

// what will be the output of given Code ...

public class one {
    
    int i [] = {0};

    public static void main(String[] args) {
        int i[] = {1};
          alter(i);
          System.out.println(i[0]);
        
    }

    public static void alter(int i[]) {
        int j[] = {2};
        i = j;
      }
    
}
