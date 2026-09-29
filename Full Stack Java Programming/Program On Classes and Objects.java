class Rectangle {

    int length;
    int width;

    void setDimensions(int l, int w) {
        length = l;
        width = w;
    }

    int getArea() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle();

        rect.setDimensions(5, 10);

        System.out.println("Area: " + rect.getArea());
    }
}