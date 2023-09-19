package Questions;

/*
 * 
 *  Question --- occurrence of digits in a range in java
 * 
 */

public class OccuranceCount {

  public static int countDigits(int start, int end, int digit) {

    int result = 0;

    int itr = digit;

    for (int i = start; i <= end; i++) {
      if (itr % 10 == digit) {
        result++;
      }

      if (itr != 0 && itr / 10 == digit) {
        result++;
        itr++;
      }

      else if (itr / 10 == digit - 1) {
        itr = itr + (10 - digit);
      }

      else {
        itr = itr + 10;
      }
    }

    return result;

  }

  public static void main(String[] args) {

    int start = 15;
    int end = 19;

    int digit = 1;

    int res = countDigits(start, end, digit);
    System.out.println(res);

  }

}
