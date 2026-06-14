public class _8_ThisKeywordMain {

    public static void main(String[] args) {
        _8_ThisKeyword obj1 = new _8_ThisKeyword();
        obj1.display();

//        both this and obj1 will be pointing to same heap memory where obj1 get created
        obj1.displayObject();
        System.out.println(obj1.hashCode());

        new _8_ThisKeyword().add().sub();
    }
}
