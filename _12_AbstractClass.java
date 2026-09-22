public abstract class _12_AbstractClass {
    int x= 10;
    _12_AbstractClass(){
        System.out.println("constructor in abstract class"+x);
    }
    abstract void sound();
    void display(){
        System.out.println("hello from concrete method");
    }
}