public class count8 {
    public int count8(int n) {
  
        if(n <= 0) {
          return 0;
        }
        
        //if the rightmost is 8 and 
        if(n % 10 == 8 && (n / 10) % 10 == 8) {
          return 2 + count8(n / 10);
        } else if(n % 10 == 8) {
          return 1 + count8(n / 10);
        } else {
          return count8(n / 10);
        }
      }      
}
