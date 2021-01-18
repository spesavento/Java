import java.util.Scanner;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {

  static int solution(Integer[] A) {
    // Your solution goes here.
    int countLines = 0;
    int currMax = 0;
    //if there are more than 0 students in the line
    if(A.length > 0){
      countLines = 1;
      currMax = A[0];
    } else {
      return countLines;
    }
    
    //loop through the line
    for(int i = 1; i < A.length; i++) {
      if(A[i] >= currMax) {
        countLines++;
        currMax = A[i];
      }
    }
    return countLines;
  }

  public static void main(String[] args) {
    // Read from stdin, solve the problem, write answer to stdout.
    Scanner in = new Scanner(System.in);
    Integer[] A = getIntegerArray(in.next());

    System.out.print(solution(A));
  }

  private static Integer[] getIntegerArray(String str) {
    return Stream.of(str.split("\\,"))
          .map(Integer::valueOf)
          .toArray(Integer[]::new);
  }
}