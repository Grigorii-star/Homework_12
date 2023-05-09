package Homework_12;

public class Autor {
    private String name;
    private String surName;

    public Autor(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return this.name;
    }

    public String getSurName() {
        return this.surName;
    }

    @Override
    public String toString() {
        return name + " " + surName;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Autor autor = (Autor) other;
        return name.equals(autor.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }
}
