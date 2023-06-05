class X {
    int data;

    public void increment() {
        data += 5;// 5
    }

    X() {
        increment();
    }
}

class Y extends X {
    Y() {
        increment();
    }

    public void increment() {
        data += 10;// 15
    }
}

public class Pro02 {
    public static void main(String... args) {
        Y aa = new Y();
        aa.increment();
        System.out.println("Data value is " + aa.data);
    }
}

