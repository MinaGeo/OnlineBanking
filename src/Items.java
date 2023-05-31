public class Items {
    String name;
    String id;
    double price;
    int count;


    public void buy(){
        count--;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
