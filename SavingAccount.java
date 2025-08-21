public class SavingAccount {
    // Properti (ciri-ciri dari rekening tabungan)
    public String name;
    public double balance;
    public double interestRate;

    // Constructor = cara cepat bikin rekening baru
    public SavingAccount(String name, double balance, double interestRate) {
        this.name = name;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    // Method = perilaku rekening
    public void displayCustomer() {
        System.out.println("Customer: "  + name + ", Balance: " + balance + 
                           ", Interest: " + (interestRate * 100) + "%");
    }
}