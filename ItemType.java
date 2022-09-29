import java.util.Scanner;

class ItemDetails{
    private String ItemName;
    private double CostPerDay;
    private double Deposit;

    public ItemDetails() {
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public double getCostPerDay() {
        return CostPerDay;
    }

    public void setCostPerDay(double costPerDay) {
        CostPerDay = costPerDay;
    }

    public double getDeposit() {
        return Deposit;
    }

    public void setDeposit(double deposit) {
        Deposit = deposit;
    }

    public void display(){
        System.out.println("Item type details");
        System.out.println("Item Name : "+ItemName);
        System.out.println("Cost Per Day : "+CostPerDay);
        System.out.println("Deposit : "+Deposit);
    }
}

public class ItemType {
    public static  void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the item name");
        String item=s.next();
        System.out.println("Enter the Item cost per day");
        double cost=s.nextDouble();
        System.out.println("Enter the deposit");
        double deposit=s.nextDouble();
        ItemDetails Details=new ItemDetails();
        Details.setItemName(item);
        Details.setCostPerDay(cost);
        Details.setDeposit(deposit);
        Details.display();
        s.close();
    }

}
