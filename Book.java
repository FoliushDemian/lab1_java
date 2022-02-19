package com.company;

public record Book(int numberOfPages, String author, double priceInUah, String genre, int ageLimit, String publication) {
    private static final String authorOfWitcher = "Sapkovsky";

    public static String printStaticField() {
        return "StaticField - " + authorOfWitcher;
    }
    public Book(){
        this(351, "Sapkovsky", 241.5);
    }
    public Book(int numberOfPages, String author, double priceInUah){
        this(numberOfPages, author, priceInUah, "fantasy", 16, "ranok");
    }
    public String toString(){
        return "Кількість сторінок- " + numberOfPages +
                "\nАвтор- " + author +
                "\nЦіна в гривнях- " + priceInUah +
                "\nЖанр- " + genre +
                "\nВікове обмеження- " + ageLimit + "+" +
                "\nВидавництво- " + publication;
    }
}