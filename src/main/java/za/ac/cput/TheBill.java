package za.ac.cput;

import java.io.Serializable;

public class TheBill implements Serializable {
    private int orderNo;
    private String orderConfirmation;

    public TheBill(int orderNO, String orderConfirmation){
        this.orderNo = orderNo;
        this.orderConfirmation = orderConfirmation;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public String getOrderConfirmation() {
        return orderConfirmation;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public void setOrderConfirmation(String orderConfirmation) {
        this.orderConfirmation = orderConfirmation;
    }

    @Override
    public String toString() {
        return "TheBill{" +
                "orderNo=" + orderNo +
                ", orderConfirmation='" + orderConfirmation + '\'' +
                '}';
    }
}
