public class _9_ChildSuper extends _9_ParentSuper {
    int x=100;
    _9_ChildSuper(){
//        Call Parent Constructor
//        if you don't write the super java will insert it internally
//        super();
        System.out.println("child constructor");
    }
    void display(){
        System.out.println("child x value: "+x);
//        Access Parent Variable
        System.out.println("parent x value:"+ super.x);
//        Call Parent Method
        super.displayParent();
    }
}
