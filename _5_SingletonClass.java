//this code is not thread safe code, if we create a multithread code more than one instance will get created be created
//Lazy loading singleton class
public class _5_SingletonClass {
    //constructor should be private
    //private constructor prevents creating objects using new from outside the class
    //only class itself create an instance
    private _5_SingletonClass(){
    }
    //this hold the single instance of the class
    private static _5_SingletonClass instance;

    public static _5_SingletonClass getInstance() {
        if (instance == null) {
            instance = new _5_SingletonClass(); //object created when needed(only when the above method is called hence perform lazy loading
        }
        return instance;
    }
    public static void main(String [] args)
    {
        _5_SingletonClass s1 = _5_SingletonClass.getInstance();
        _5_SingletonClass s2 = _5_SingletonClass.getInstance();
        if(s1==s2){
            System.out.println("both object will share the same memory refernce");
        }else{
            System.out.println("both share different memory");
        }
    }
}
