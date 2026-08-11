interface A {
    void show();
}
interface B {
    void display();
}
class Test implements A, B {
    public void show() {
        System.out.println("Method from Interface A");
    }
    public void display() {
        System.out.println("Method from Interface B");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
        t.display();
    }
}