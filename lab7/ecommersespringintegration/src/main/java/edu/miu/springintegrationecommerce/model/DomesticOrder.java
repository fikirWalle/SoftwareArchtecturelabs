package edu.miu.springintegrationecommerce.model;

public class DomesticOrder extends Order {
     private String State;


     public DomesticOrder(){

     }


    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", amount='" + amount + '\'' +
                '}';
    }

    public long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public void makeOrder(Order order){
        System.out.println("Domestic order ::" +order);
//        return "success";
    }

}
