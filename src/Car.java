public class Car implements Builder{
    Product pr=new Product();

    @Override
    public void buildBody() {
        pr.add("building body ...");
    }

    @Override
    public void insertWheels() {
        pr.add("inserting wheels...");

    }

    @Override
    public void insertHeadLight() {
        pr.add("inserting head light  ...");

    }

    @Override
    public void painBody() {
        pr.add("painting body ...");

    }

    @Override
    public Product getVehicle() {
        return pr;
    }
}
