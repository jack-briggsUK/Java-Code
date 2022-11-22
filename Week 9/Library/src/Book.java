public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book(String name, Author author, double price) {
        setName(name);
        setAuthor(author);
        setPrice(price);
    }

    public Book(String name, Author author, double price, int qty) {
        setName(name);
        setAuthor(author);
        setPrice(price);
        setQty(qty);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        String blurb = "Book: " + this.getName() + ", Author: " + this.author.getName() + " " + this.author.getEmail() + " " + this.author.getGender() + ", price : £" + this.getPrice() + ", qty: " + this.getQty();
        return blurb;
    }

}
