package entities;

public class BusinessAccount extends Account1 {

    private Double loanLimit;

    public BusinessAccount(){
        super();
    }
    public BusinessAccount(Integer number, String holder, Double balance){
        super(number, holder, balance);
    }
}
