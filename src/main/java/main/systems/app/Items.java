package main.systems.app;

public class Items {
    private final long id;
    private final String title;
    private final double cost;

    public Items(long id, String title, double cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id: '" + id + '\'' +
                ", title='" + title + '\'' +
                ", cost=" + cost +
                '}';
    }
}