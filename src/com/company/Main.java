package com.company;

public class Main {

    public static void main(String[] args) {
        Product p = new Product();
        Book b = new Book();
        Software s = new Software();

        //Print the number of products created
        System.out.println("The products created = " +p.getCount());
    }
}
