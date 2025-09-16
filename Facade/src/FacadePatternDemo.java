// 1. Banka hesabı doğrulama
class BankAccount {
    private String accountNumber = "123456";

    public boolean isValidAccount(String account) {
        return account.equals(accountNumber);
    }
}

// 2. Güvenlik kontrolü
class SecurityCode {
    private int securityCode = 1234;

    public boolean isValidCode(int code) {
        return code == securityCode;
    }
}

// 3. Bakiye yönetimi
class AccountBalance {
    private double balance = 5000.0;

    public boolean hasSufficientBalance(double amount) {
        return balance >= amount;
    }

    public void withdraw(double amount) {
        if (hasSufficientBalance(amount)) {
            balance -= amount;
            System.out.println(amount + "₺ çekildi. Yeni bakiye: " + balance + "₺");
        } else {
            System.out.println("Yetersiz bakiye!");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + "₺ yatırıldı. Yeni bakiye: " + balance + "₺");
    }

    public double getBalance() {
        return balance;
    }
}
// Facade: Banka işlemlerini yöneten sınıf
class BankingFacade {
    private BankAccount bankAccount;
    private SecurityCode securityCode;
    private AccountBalance accountBalance;

    public BankingFacade() {
        this.bankAccount = new BankAccount();
        this.securityCode = new SecurityCode();
        this.accountBalance = new AccountBalance();
    }

    public void withdrawMoney(String account, int code, double amount) {
        if (bankAccount.isValidAccount(account) && securityCode.isValidCode(code)) {
            accountBalance.withdraw(amount);
        } else {
            System.out.println("Geçersiz hesap numarası veya güvenlik kodu!");
        }
    }

    public void depositMoney(String account, int code, double amount) {
        if (bankAccount.isValidAccount(account) && securityCode.isValidCode(code)) {
            accountBalance.deposit(amount);
        } else {
            System.out.println("Geçersiz hesap numarası veya güvenlik kodu!");
        }
    }

    public void checkBalance(String account, int code) {
        if (bankAccount.isValidAccount(account) && securityCode.isValidCode(code)) {
            System.out.println("Güncel bakiye: " + accountBalance.getBalance() + "₺");
        } else {
            System.out.println("Geçersiz hesap numarası veya güvenlik kodu!");
        }
    }
}

public class FacadePatternDemo {
    public static void main(String[] args) {
        BankingFacade bankingFacade = new BankingFacade();

        System.out.println("--- Para Çekme ---");
        bankingFacade.withdrawMoney("123456", 1234, 1000);

        System.out.println("\n--- Bakiye Sorgulama ---");
        bankingFacade.checkBalance("123456", 1234);

        System.out.println("\n--- Para Yatırma ---");
        bankingFacade.depositMoney("123456", 1234, 2000);

        System.out.println("\n--- Yanlış Bilgiyle İşlem Deneme ---");
        bankingFacade.withdrawMoney("000000", 9999, 500);
    }
}
