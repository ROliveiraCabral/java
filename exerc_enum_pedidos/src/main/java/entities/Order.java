package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.add(item);
    }

    public Double total() {
        double sum = 0.0;
        for (OrderItem orderItem : items) {
            sum += orderItem.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ORDER SUMMARY: ").append(System.lineSeparator());
        stringBuilder.append("Order moment: ");
        stringBuilder.append(sdf.format(moment)).append(System.lineSeparator());
        stringBuilder.append("Order status: ");
        stringBuilder.append(status).append(System.lineSeparator());
        stringBuilder.append("Client: ");
        stringBuilder.append(client).append(System.lineSeparator());
        stringBuilder.append("Order items: ").append(System.lineSeparator());
        for (OrderItem item : items) {
            stringBuilder.append(item).append(System.lineSeparator());
        }
        stringBuilder.append("Total price: $");
        stringBuilder.append(String.format("%.2f", total())).append(System.lineSeparator());
        return stringBuilder.toString();
    }

}
