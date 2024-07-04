// File: FriendFunctionExample.java
class ClassA {
    int data = 40;
    void display() {
        System.out.println("Data from ClassA: " + data);
    }
}

class ClassB {
    void modifyData(ClassA obj) {
        obj.data = 100;
    }
}

public class FriendFunctionExample {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        a.display();
        b.modifyData(a);
        a.display();
    }
}
