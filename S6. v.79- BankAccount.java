	  // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.
        
public class BankAccount {

    private int accountNumber;
    private int balance;
    private String name;
    private int phoneNumber;

    public void setAccountNumber (int accountNumber){
        this.accountNumber = accountNumber;

    }
    public void setBalance (int balance){
        this.balance = balance;

    }
    public void setName (String name){
        this.name = name;

    }
    public void setPhoneNumber (int phoneNumber){
        this.phoneNumber = phoneNumber;

    }

    public int getAccountNumber(){
        return accountNumber;
    }
    public int getBalance(){
        return balance;
    }
    public String  getName(){
        return name;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }

    public void deposit (int depositSum){
        this.balance += depositSum;
    }

    public void withdraw (int withdrawSum){
        if(withdrawSum > this.balance){
            System.out.println("Withdraw sum is bigger than account sum");
        } else{
            this.balance -= withdrawSum;
        }

    }
