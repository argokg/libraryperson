package models;

public class Book {
    private String name;
    private String author;

    public Book() {
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "\nНазвание книги: " + name +
                "\nАвтор книги: " + author+
                "\n-----------------";
    }

    public String booksInfo(Book[] books){
        String info = "";
        for (Book b:books) {
            info+=" "+b.toString();
        }
        return  info;
    }

}
