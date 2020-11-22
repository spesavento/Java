public class num3s {
    public static int num3s(int num) {
        if(num == 0) {
            return 0;
        }
        if(num % 10 == 3) {
            return 1 + num3s(num/10);
        } else {
            return num3s(num/10);
        }

    }
    public static void main(String[] args) {
        System.out.println(num3s(3533));
        System.out.println(num3s(237));
        System.out.println(num3s(3));
        System.out.println(num3s(0));
        System.out.println(num3s(247));

    }
}
