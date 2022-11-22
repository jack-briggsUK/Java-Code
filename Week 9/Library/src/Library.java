public class Library {
    public static void main(String[] args) {
        Author StephenKing = new Author("Stephen King", "Steve@scream.com", 'm');
    
        Book Book01 = new Book("Fairy Tale", StephenKing, 2.50);
        Book Book02 = new Book("The Stand", StephenKing, 3.99, 3);
    
        System.out.println(Book01.toString());

        Book01.setQty(4);

        System.out.println(Book01.toString());
        System.out.println(Book02.toString());
    
    }
}
