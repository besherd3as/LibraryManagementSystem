package librarymanagementsystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    
    private List<Book> books;
    private List<Project> projects;
    private List<Member> members;
    
    public Library() {
        books = new ArrayList<>();
        projects = new ArrayList<>();
        members = new ArrayList<>();
    }
    
    public void AddBook(Book book) {
        books.add(book);
        System.out.println(book.GetTitle() + " is added to books .");
    }
    
    public void AddProject(Project project) {
        projects.add(project);
        System.out.println(project.GetTitle() + " is added to projects .");
    }
    
    public void AddMember(Member member) {
        members.add(member);
        System.out.println(member.GetName() + " is added to members .");
    }
    
    public void ShowBooks() {
        System.out.println("\nLibrary Books : ");
        for (Book book : books) {
            book.ShowInfo();
        }
    }
    
    public void ShowProjects() {
        System.out.println("\nLibrary Projects : ");
        for (Project project : projects) {
            project.ShowInfo();
        }
    }
    
    public void ShowMembers() {
        System.out.println("\nLibrary Members : ");
        for (Member member : members) {
            member.ShowBorrowedItems();
        }
    }
    
    public static void main(String[] args) {
        Library library = new Library();
        Book book_1 = new Book("B001", "Life 3.0", 2017,Item.Category.AI, "Max Tegmark", 384, "Knopf");
        book_1.ShowInfo();
        library.AddBook(book_1);
        /*Book book_2 = new Book("B002", "Rich Dad Poor Dad", 1997,Item.Category.Basic_Sciences, "Robirt Qusaki", 298, "Anything");
        book_2.ShowInfo();
        library.AddBook(book_2);*/
        Project project_1 = new Project("P001", "AI in future", 2022,Item.Category.AI,Project.Study_year.Third_Year, "ITE Team N.1");
        project_1.ShowInfo();
        library.AddProject(project_1);
        Member member_1 = new Member("M001", "Besher");
        library.AddMember(member_1);
        member_1.BorrowedItem(book_1);
        member_1.BorrowedItem(project_1);
        member_1.ShowBorrowedItems();
        member_1.ReturnedItem(book_1);
        
        Scanner s = new Scanner(System.in);
        
        List<String> UserIn;
        UserIn = new ArrayList<>();
        
        String id;
        String category;
        String title;
        int year;
        String author;
        int pages;
        String publisher;
        
        System.out.println("Adding a new book : ");
        id = "B003";
        System.out.println("Enter the title of the book ");
        title = s.nextLine();
        System.out.println("Enter the of category the book ");
        category = s.nextLine();
        System.out.println("Enter the year that book released at ");
        year = s.nextInt();
        System.out.println("Enter the name of the author ");
        author = s.nextLine();
        System.out.println("Enter number of pages ");
        pages = s.nextInt();
        System.out.println("Enter the name of the publisher ");
        publisher = s.nextLine();
    }
}
