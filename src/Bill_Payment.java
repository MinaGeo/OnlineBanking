public class Bill_Payment {
    String type;
    double amount;
    Acc_Driver account;


    Bill_Payment(String type,double amount, Acc_Driver account){
        this.type = type;
        this.amount=amount;
        this.account=account;
    }

    boolean payBill(){
        double available=account.getAmount();
        if(available>amount){
           return true;
        }
        else{
            return false;
        }

    }

    public String getType(){
        return type;
    }
    public double getAmount(){
        return amount;
    }




}
