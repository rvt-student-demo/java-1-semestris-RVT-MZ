package rvt.date_12_12_2025;

public class chapter50 {
    static class Box {
        private double width;
        private double height;
        private double length;
        private double side;
        Box(double width, double height, double length) {
            this.width = width;
            this.height = height;
            this.length = length;
        }
        public Box(Box oldBox) {
            this.width = oldBox.width;
            this.height = oldBox.height;
            this.length = oldBox.length;
        }
        Box(double side) {
            this.side = side;
        }
        double volume() {return width * height * length;}
        double area() {return 2 * faceArea() + 2 * topArea() + 2 * sideArea();}
        private double faceArea() {return width * height;}
        private double topArea() {return length * width;}
        private double sideArea() {return height * length;}
        public double width() {return width;}
        public double height() {return height;}
        public double length() {return length;}
        public Box biggerBox(Box oldBox) {
            return new Box(1.25 * oldBox.width(), 1.25 * oldBox.height(), 1.25 * oldBox.length());
        }
        public Box smallerBox(Box oldBox) {
            return new Box(0.75 * oldBox.width(), 0.75 * oldBox.height(), 0.75 * oldBox.length());
        }
        public boolean nests(Box outsideBox) {
        return this.width < outsideBox.width() && this.height < outsideBox.height() && 
        this.length < outsideBox.length();
    }

    }
    public static void main(String[] args){
        Box box = new Box( 2.5,5.0,6.0);
        System.out.println("Area: "+ box.area() + " volume: " + box. volume() );
        System.out.println( "length: " + box.length + " height: " + box.height +" width: " + box.width );
    }

}
