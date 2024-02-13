public class TextbookTester {
    public static void main(String[] args) {
        // Creating an object and testing the about() instance method - Attempt #1
        Textbook book1 = new Textbook();
        System.out.println(book1);
        book1.about();

        // Changing the attributes of book1
        // Testing the about() instance method - Attempt #2
        book1.setTopic("Physics");
        book1.setNumberOfPages(400);
        book1.setTextbookEdition(10);
        System.out.println(book1);
        book1.about();

        // Textbook(String topic, int numberOfPages, int textbookEdition)
        // Entering the new data for the second Textbook object and testing the about() instance method - Attempt #3
        Textbook book2 = new Textbook("Information Technology", 425, 9);
        System.out.println(book2);
        book2.about();
    }
}
