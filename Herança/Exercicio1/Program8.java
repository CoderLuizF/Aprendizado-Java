import entities.Account;
import entities.Account1;
import entities.BusinessAccount;

public class Program8 {

    public static void main(String[] args) {

        Account acc = new Account1(1001, "Luiz", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Cássia", 0.0, 500.0);

        //UPCASTING -> Pegar obj do BusinessAccount para o Account
        Account1 acc1 = bacc;

    }
}
