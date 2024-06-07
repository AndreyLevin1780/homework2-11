package pro.sky.Internetshopbucket;

public class Item {

    private int Item;
    private String itemName;

    public Item(int item, String itemName) {
        Item = item;
        this.itemName = itemName;
    }

    public int getItem() {
        return Item;
    }

    public void setItem(int item) {
        Item = item;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
