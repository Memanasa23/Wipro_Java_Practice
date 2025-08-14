class BankAccount {
    constructor(accountNumber, balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    deposit(amount) {
        this.balance += amount;
        console.log(`Deposited: ${amount}. New Balance: ${this.balance}`);
    }

    withdraw(amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            console.log(`Withdrew: ${amount}. Remaining Balance: ${this.balance}`);
        } else {
            console.log(`Withdrawal of ${amount} failed or Insufficient balance.`);
        }
    }
}

let account = new BankAccount(45000, 500);
console.log("Account Created:", account);
account.deposit(200);
account.withdraw(100);
account.withdraw(700); 
