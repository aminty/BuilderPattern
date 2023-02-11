import java.util.LinkedList;

public class Product {

    final LinkedList<String> pr;

    public Product() {
        pr = new LinkedList<>();

    }

    public void add(String part) {
        pr.add(part);

    }

    public void show() {
        for (int i = 0; i < pr.size(); i++) {
            System.out.println(i + " : " + pr.get(i));
        }
    }
}
