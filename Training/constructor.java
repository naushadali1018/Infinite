package Training;

class Customer{
    int CustomerId;

    public Customer(int customerId) {
        CustomerId = customerId;
    }
    public void dispaly(){
        System.out.println("Customer Id" + CustomerId);
    }
}


public class constructor {
    public static void main(String[] args){
        Customer customer=new Customer(1000);
        customer.dispaly();
    }
}

