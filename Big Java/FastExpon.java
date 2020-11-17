public class FastExpon {
    public static int fastExpon(int x, int n) {
        if(n == 1) {
          return x;
        } else if(n < 1) {
          return 1;
        } else if (n == 2) {
            return x*x;
        } else if(n % 2 == 0) {
          return fastExpon(x^(n / 2), 2);
        } else {
          return x * fastExpon(x, n-1);
        }
      }
      public static void main(String[] args) {
        System.out.println(fastExpon(3, 4));
      }
}
