public class _13_InterfaceMain implements _13_Interface,_13_InterfaceB{
    @Override
    public void show() {
        System.out.println("hello from the class that implements interface");
    }

    public static void main(String[] args) {
        _13_Interface inter = new _13_InterfaceMain();
        inter.show();
        inter.display();
    }
}
