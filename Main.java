package com.company;

public class Main {

    public static void main(String[] args) {
        Book witcher = new Book();
        Book harryPotter = new Book(666, "JoanneRowling", 1000);
        Book fundation = new Book(987, "IsaacAsimov", 400, "novel", 6, "Prosvita");
        System.out.println(witcher + "\n");
        System.out.println(harryPotter + "\n");
        System.out.println(fundation + "\n");
        System.out.println(Book.printStaticField());
    }
}

