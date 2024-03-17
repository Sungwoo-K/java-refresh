package extends1;

public class Book extends Item{
    private String author;
    private String isbn;

    public Book(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    public void print() {
        super.print();
        System.out.println("- 저자 : " + this.author + ", isbn : " + this.isbn);
    }
}