import java.util.Scanner;

public class Solution {

  public static int solution(String T) {
    // Your solution goes here.
    int numTimes = 0;
    
    //handle all cases of missing hours
    if(T.charAt(0) != '?' && T.charAt(1) == '?'){
      //if it's 2, add 0-3
      if(T.charAt(0) == '2'){
        numTimes+=4; 
      } else {
        //if it's 0 or 1, add 0-9
        numTimes+=10;
      }
    } else if(T.charAt(0) == '?' && T.charAt(1) != '?') {
      //if the second hour is from 0-3, first hour could be 0 or 1 or 2
      if(T.charAt(1) == '0' || T.charAt(1) == '1' || T.charAt(2) == '2' || T.charAt(2) == '3') {
        numTimes+=3;
      } else {
        //if the second hour is from 4-9, first hour could be 0 or 1
        numTimes+=2;
      }
    } else if(T.charAt(0) == '?' && T.charAt(1) == '?'){
      //else if they are both ?
      numTimes+=24;
    }

    //handle all cases of missing minutes
    if(T.charAt(3) == '?' && T.charAt(4) != '?'){
      numTimes*=6;
    } else if (T.charAt(3) != '?' && T.charAt(4) == '?') {
      numTimes*=10;
    } else if (T.charAt(3) == '?' && T.charAt(4) == '?') {
      numTimes*=60;
    }
    
    return numTimes;
  }

  public static void main(String[] args) {
    // Read from stdin, solve the problem, write answer to stdout.
    Scanner in = new Scanner(System.in);
    System.out.print(solution(in.next()));
  }
}
