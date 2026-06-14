public class _3_BankAccountMain {
    public static void main(String[] args){
        //creating the object for the BankAccount class
        _3_BankAccount b1 = new _3_BankAccount();
        //here b1 is the object reference(stores the memory address of an object not object itself)
        b1.accNumber= 13454;
        b1.customerName ="sinchana";
        b1.accBalance= 500;
        b1.withdraw(300);
        b1.withdraw(300);
    }
}
