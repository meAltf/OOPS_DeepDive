package Day_1;

class Book {
    private double price;
    private String title;
    private String author;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }


}

public class PracticeCode {

    public static void main(String[] args) {

        Book book = new Book();
        book.setTitle("Effective Java");
        book.setAuthor("Joshua Bloch");
        book.setPrice(499.99);

        System.out.println("Book: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: ₹" + book.getPrice());
    }
}
