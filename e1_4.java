/* Exercise 1.4: Write a program that prints out the balance of an account after the first, second, and third year. 
The initial balance is $1,000 and earns 5 percent interest per year. */

public class e1_4 {
    public static void main(String[] args) {
        double initialBalance = 1000;

        double yr1Balance = initialBalance + (initialBalance*.05);
        System.out.println(yr1Balance);

        double yr2Balance = yr1Balance + (yr1Balance*.05);
        System.out.println(yr2Balance);
        
        double yr3Balance = yr2Balance + (yr2Balance*.05);
        System.out.println(yr3Balance);
    }
}