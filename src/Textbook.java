public class Textbook {
    private String topic;
    private int numberOfPages;
    private int textbookEdition;

    public Textbook() {
        topic = "Biology";
        numberOfPages = 200;
        textbookEdition = 7;
    }

    public Textbook(String topic, int numberOfPages, int textbookEdition) {
        this.topic = topic;
        this.numberOfPages = numberOfPages;
        this.textbookEdition = textbookEdition;
    }
    public void about() {
        System.out.println("This textbook deals with topics related to " + topic + ".\n");
    }

    public String toString() {
        return "Textbook Information\nSubject: " + topic + "\nNumber of Pages: " + numberOfPages + "\nTextbook Edition: " + textbookEdition + "\n";
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getTextbookEdition() {
        return textbookEdition;
    }

    public void setTextbookEdition(int textbookEdition) {
        this.textbookEdition = textbookEdition;
    }
}
