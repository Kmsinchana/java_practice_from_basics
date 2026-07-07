public class _10_UpAndDownCastingMain {
    public static void main(String[] args){
        //upcasting
        _10_UpAndDownCastingParent p1 = new _10_UpAndDownCastingChild();
        p1.display();//display the child (method overriding)
//        complilation error, no access to the child method because
//        p1.childMethod();
//        safe downcasting(here we now the p1 refer to child hence it will not cause any error


        _10_UpAndDownCastingChild c1 = (_10_UpAndDownCastingChild)p1;
        c1.childMethod();
//        dangerous downcasting
        _10_UpAndDownCastingParent p2 = new _10_UpAndDownCastingParent();
//        compile successfully but cases run time error as ClassCastException
//        _10_UpAndDownCastingChild c2 = (_10_UpAndDownCastingChild)p2;


//        instanceof is used as a safety check before downcasting when the actual runtime type of the object is uncertain.
//       we will use Instanceof when sometimes we don't know what object the parent reference is holding.
        if(p1 instanceof _10_UpAndDownCastingChild){
            _10_UpAndDownCastingChild c2 = (_10_UpAndDownCastingChild) p1;
            c2.childMethod();
        }

        
//        the below code will always return false p2 reference to parent object so it cannot be a instance of child
        if(p2 instanceof _10_UpAndDownCastingChild){ //always false
            _10_UpAndDownCastingChild c2 = (_10_UpAndDownCastingChild) p1;
            c2.childMethod();
        }
    }
}
