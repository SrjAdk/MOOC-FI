/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Book {
    private String name;
    private int pageNumbers;
    private int publishedYear;

    public Book(String name, int pageNumbers, int publishedYear) {
        this.name = name;
        this.pageNumbers = pageNumbers;
        this.publishedYear = publishedYear;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getPages(){
        return this.pageNumbers;
    }
    
    public int getPublishedYear(){
        return this.publishedYear;
    }

    public String toString() {
        return this.name+", "+this.pageNumbers+" pages, "+this.publishedYear;
    }
    
    
}
