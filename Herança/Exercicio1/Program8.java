import entities.Account;
import entities.Account1;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program8 {

    public static void main(String[] args) {

        Account acc = new Account1(1001, "Luiz", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Cássia", 0.0, 500.0);

        //UPCASTING -> Pegar obj do BusinessAccount para o Account
        Account1 acc1 = bacc;
        Account1 acc2 = new BusinessAccount(1003, "Sonia", 0.0, 200.0);
        Account1 acc3 = new SavingsAccount(1004, "Jorge", 0.0, 0.01);
    }
}
