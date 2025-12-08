package practice.model;

import practice.services.OrdersDAO;

public class App {
    public static void main(String[] args) {
    	OrdersDAO dao = new OrdersDAO();
    	dao.findAll();
    }
}