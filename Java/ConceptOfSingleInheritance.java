class Room {                                // Base class for Room

    double length;
    double breadth;

    Room(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }
}


class RoomVolume extends Room {                     // Derived class inheriting Room to calculate Volume
    double height;

    RoomVolume(double l, double b, double h) {
        super(l, b);
        height = h;
    }

    double volume() {
        return length * breadth * height;
    }
}

public class RoomCalculation {                              // Main class to calculate area and volume

    public static void main(String[] args) {
        RoomVolume room = new RoomVolume(5, 4, 3);

        System.out.println("Room Area: " + room.area() + " sq units");
        System.out.println("Room Volume: " + room.volume() + " cubic units");
    }
}
