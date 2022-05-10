package za.ac.cput;

import java.io.Serializable;

public class TheBill implements Serializable {
    private int orderNO;
    private String itemName;
    private int itemPrice;
    private int totalPrice;

    public TheBill(int orderNO, String itemName, int itemPrice, int totalPrice){
        this.orderNO =orderNO;
        this.itemName= itemName;
        this.itemPrice = itemPrice;
        this.totalPrice = totalPrice;
    }

    public int getOrderNO() {
        return orderNO;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setOrderNO(int orderNO) {
        this.orderNO = orderNO;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "TheBill{" +
                "orderNO=" + orderNO +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
