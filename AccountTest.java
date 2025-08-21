public class AccountTest {
    public static void main(String[] args) {
        // Membuat rekening dengan constructor
        SavingAccount sa1 = new SavingAccount("Damien", 1000, 0.02);
        SavingAccount sa2 = new SavingAccount("Bill", 2000, 0.03);

        // Menampilkan data rekening
        sa1.displayCustomer();
        sa2.displayCustomer();
    }
}