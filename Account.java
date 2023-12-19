import java.util.*;
class Account
{
    String name,language;
    long account;
    int amount;
    Scanner sc = new Scanner(System.in);
    void insert()
    {
        System.out.println("Enter the language in which you want to proceed");
        language = sc.next();
        System.out.println("\nEnter your name");
        name = sc.next();
        System.out.println("\nEnter the account number");
        account = sc.nextLong();
        System.out.println("\nEnter the amount you want to deposit");
        amount = sc.nextInt();
    }
    void display()
    {
      System.out.println("\nName: "+name);
      System.out.println("\nAccount_number: "+account);
      System.out.println("\nAmount: "+amount);
    }
    void deposit(int Balance)
    {
      Balance = Balance + amount;
      System.out.println("\nTotal_Amount:"+Balance);
    }
    void withdraw(int Balance)
    {
        deposit(Balance);
        int pin;
        System.out.println("\nCheck balance before withdrawing");
        if(Balance > 500)
        {
            System.out.println("\nBalance is greater than 500,You can withdraw");
            System.out.println("\nEnter your pin");
            pin = sc.nextInt();
            System.out.println("\nEnter the amount you want to withdraw");
            int amnt = sc.nextInt();
            System.out.println("\nCash_Withdrawn: "+amnt);
            Balance = Balance-amnt;
            System.out.println("\nYour current balance is: "+Balance);
            System.out.println("\nPunjab National Bank thanks you for using the services!");
        }
        else
        {
            System.out.println("\nSorry!,balance is below 500,you cannot withdraw cash directly from the withdrawing machine");
            System.out.println("\nPunjab National Bank thanks you for using the services!\n");
        }
    }
    public static void main(String args[])
    {
        Account a = new Account();
        a.insert();
        a.display();
        a.deposit(50000000);
        a.withdraw(50000000);
    } 
}