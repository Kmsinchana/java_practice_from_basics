public class _12_AbstractMain extends _12_AbstractClass{
    @Override
    void sound() {
        System.out.println("dog-bow bow,abstract implementation");
    }


    public static void main(String[] args){
//        we cannot create the object of abstract class
//        _12_AbstractClass absc = new _12_AbstractClass();
        _12_AbstractClass abs = new _12_AbstractMain();
        abs.sound();
        abs.display();
    }
}
