package Homework_12;

public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Дмитрий", "Глуховский");
        Autor autor2 = new Autor("Анджей", "Сапковский");
        Book book1 = new Book("Метро 2033", autor1, 2005);
        Book book2 = new Book("Последнее желание", autor2, 2004);
//        System.out.println("book2.year = " + book2.getYear());
        book2.setYear(1993);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(autor1.hashCode());
        System.out.println(autor2.hashCode());
        System.out.println(autor1.equals(autor2));
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book1.equals(book2));
    }
}
