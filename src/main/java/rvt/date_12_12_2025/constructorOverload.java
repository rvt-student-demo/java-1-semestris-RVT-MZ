package rvt.date_12_12_2025;
public class constructorOverload {
    public static class Product {
        private String name;
        private String location = "shelf";
        private int weight = 1;
        Product(String name) {
            this.name = name;
        }
        Product(String name, String location) {
            this.name = name;
            this.location = location;
        }
        Product(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }
        public String toString() {
            return name+" ("+weight+"kg) can be found from the "+location+".";
        }
    }
    public static void main(String[] args) {
        Product tapeMeasure = new Product("Tape measure");
        Product plaster = new Product("Plaster", "home improvement section");
        Product tyre = new Product("Tyre", 5);

        System.out.println(tapeMeasure);
        System.out.println(plaster);
        System.out.println(tyre);
    }
}
