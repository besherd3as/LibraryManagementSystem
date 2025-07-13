package librarymanagementsystem;

public class Book extends Item {

    private String author,publisher;
    private int pages;

    public Book(String id, String title, int year, Category category, String author, int pages, String publisher) {
        super(id, title, year, category);
        this.author = author;
        this.pages = pages;
        this.publisher = publisher;

    }

    @Override
    public void ShowInfo() {
        System.out.printf("\n%s : Book title : %s  ,  Year : %s  ,  Category : %s  ,  Author : %s  ,  Pages : %s  ,  Publisher : %s .\n", id, title, String.valueOf(year), String.valueOf(category), author, String.valueOf(pages), publisher);
    }

}
