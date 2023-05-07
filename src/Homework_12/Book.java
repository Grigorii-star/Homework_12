package Homework_12;

public class Book {
    private String name;
    private Autor autor;
    private int year;

    public Book(String name, Autor autor, int year) {
        this.name = name;
        this.autor = autor;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
