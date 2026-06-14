public class _4_Static {
    static int a;
    static void sayHello(){
        System.out.println("hello from static method");
    }
    public static void main(String[] args){
        //accessing the static variable or method
        System.out.println(_4_Static.a);//the default value get stored for int it will be zero
        //assigning a variable
        _4_Static.a = 10;
        System.out.println(_4_Static.a);
        _4_Static.sayHello();
    }
}
