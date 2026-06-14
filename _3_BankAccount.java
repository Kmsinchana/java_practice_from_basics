public class _3_BankAccount {
    double accNumber;
    String customerName;
    double accBalance;

    void withdraw(double howMuch){
        System.out.println("balance before withdraw:"+accBalance);
        if(howMuch>accBalance){
            System.out.println("exceed the balance");
            return; //to stop the executing the below code
        }
        accBalance-=howMuch;
        System.out.println("available balance after withdraw money is:" +accBalance);
    }
    void deposit(double howMuch){
        System.out.println("balance before depostion:"+accBalance);
        accBalance+=howMuch;
        System.out.println("the account balance after depositing the amount is :"+accBalance);
    }
}
