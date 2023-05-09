package Homework_12;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Название книги: " + name + "; Автор: " + autor + "; Год издания: " + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
