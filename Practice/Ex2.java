class Solution {
  
    public static int solution(int[] A){
      //assuming no empty array is passed in, any array < 5 can be changed to same elements
      if(A.length < 5){
        return A.length;
      }
      //keep track of current element
      int currElement = A[0];
      //keep track of the number of elements you've changes
      int numChanged = 0;
      int currLongest = 1;
      int maxLongest = 1;
   
      for(int j = 0; j < A.length; j++) {
        //update track of current element
        System.err.println("new loop, current element: " + A[j]);
        currElement = A[j];
        //reset to no changes
        numChanged = 0; 
        //reset current longest
        currLongest = 1;
        
       for(int i = j+1; i < A.length; i++){
         if(A[i] == currElement){
           //if equal, you don't need to change
           currLongest++;
           System.err.println("same element! current element is: " + A[i]);
           System.err.println("same : " + currLongest);
         }else{
           //if not equal, change the element to lengthen the list
           numChanged++;
           currLongest++;
           System.err.println("NOT same : " + currLongest);
         }
         //if you've changed 3 elements already, exit the loop
         if(numChanged == 3){
           System.err.println("current max : " + currLongest);
           break;
         }
       }
        //make sure they get max guesses, or change another value
        if(numChanged < 3) {
          if(j < 3 - numChanged) {
            currLongest += 3 - numChanged - j;
          } else {
            currLongest += 3 - numChanged; 
          }
        }
        if(currLongest > maxLongest){
          maxLongest = currLongest;
        }
      }
      
     System.err.println("Tip: Use System.err.println() to write debug messages on the output tab.");
     return maxLongest; 
    }
   }
