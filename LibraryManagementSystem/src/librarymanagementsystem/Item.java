package librarymanagementsystem;

public abstract class Item {

    protected String id,title;
    protected int year;

    protected enum Category {
        Basic_Sciences, AI, Software, Networks
    }
    protected Category category;

    public Item(String id, String title, int year, Category category) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.category = category;
    }

    public String GetId() {
        return id;
    }

    public String GetTitle() {
        return title;
    }

    public int GetYear() {
        return year;
    }

    public Category GetCategory() {
        return category;
    }

    public abstract void ShowInfo();

}
