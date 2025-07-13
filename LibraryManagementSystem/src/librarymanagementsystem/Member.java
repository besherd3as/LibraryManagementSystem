package librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Member {

    private String mid,name;
    private List<Item> isborrowedItems;

    public Member(String mid, String name) {
        this.mid = mid;
        this.name = name;
        this.isborrowedItems = new ArrayList<>();
    }

    public String GetName() {
        return name;
    }

    public void BorrowedItem(Item item) {
        if (isborrowedItems.size() < 3) {
            isborrowedItems.add(item);
            System.out.println(name + " borrowed : " + item.GetTitle() + " seccessfully .");
        } else {
            System.out.println("Can't borrow more than 3 items at the same time .");
        }
    }

    public void ReturnedItem(Item item) {
        if (isborrowedItems.contains(item)) {
            isborrowedItems.remove(item);
            System.out.println(name + " returned : " + item.GetTitle() + " seccessfully .");
        } else {
            System.out.println("Can't return this item. This item hasn't been borrowed to this member .");
        }
    }

    public void ShowBorrowedItems() {
        System.out.println(name + " Borrowed : ");
        for (Item item : isborrowedItems) {
            item.ShowInfo();
            System.out.println();
        }
    }

}
