import java.util.ArrayList;

public class Acc_Driver {
    double amount;
    String id;
    ArrayList<Bill_Payment> bills=new ArrayList<>();
    Acc_Driver(String id,double amount){
        this.id=id;
        this.amount=amount;
    }
    public double getAmount(){
        return amount;
    }
    public String getId(){
        return id;
    }

    public void addBill(String type,double amount){
        Acc_Driver acc=this;
        if(findBill(type)==-1) {
            bills.add(new Bill_Payment(type, amount, acc));
        }
    }

    public void payBill(String type){
        int index=findBill(type);
        if(index!=-1){
            boolean status=bills.get(index).payBill();
            if(status) {
                amount -= bills.get(index).amount;
                bills.remove(index);
            }
        }

    }

    int findBill(String type){
            for (int i = 0; i < bills.size(); i++) {
                if (bills.get(i).getType().equals(type)) {
                    return i;
                }
            }
            return -1;
        }
    String getBillsId(){
        String out="";
        for(int i=0;i<bills.size();i++){
            out+=bills.get(i).getType();
            out+="\n";
        }
        return out;
    }


    String getBillsAmount(){
        String out="";
        for(int i=0;i<bills.size();i++){
            out+=Double.toString(bills.get(i).getAmount());
            out+="\n";
        }
        return out;
    }

    public void buyItem(Items x){
        double itemPrice=x.getPrice();
        if(amount>itemPrice){
            amount-=itemPrice;
            System.out.println("item bought");
            x.buy();
        }
        else{
            System.out.println("Item not bought");
        }
    }




}
