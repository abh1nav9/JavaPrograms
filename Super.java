class Parent {
    int a;

    Parent(int a) {
        this.a = a;
    }

    void display() {
        System.out.println("Parent a = " + a);
    }
}

class Child extends Parent {
    int b;

    Child(int a, int b) {
        super(a);
        this.b = b;
    }

    void display() {
        super.display();
        System.out.println("Child b = " + b);
    }

    public static void main(String[] args) {
        Child obj = new Child(10, 20);
        obj.display();
    }
}
