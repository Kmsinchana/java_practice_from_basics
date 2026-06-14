public class _8_ThisKeyword {
    int id;
    String name;

//    no argument constructor
//    To Invoke Current Class Constructor
      _8_ThisKeyword(){
          this(1, "hello");
          System.out.println("default constructor executed");
      }

//    To Refer Current Class Instance Variables
//    or
//    Return Current Object
    _8_ThisKeyword(int id,String name){
        this.id=id;
        this.name=name;
        System.out.println("parameter constructor executed");
    }
    void display(){
        System.out.println("id: "+id +" name: "+name);
//        To Invoke the Current Class Method
        this.displayObject();
    }
    void displayObject(){
        System.out.println(this.hashCode());
    }

//     To Return the Current Class Instance
    _8_ThisKeyword add(){
        System.out.println("ADD");
        return this;
    }

    _8_ThisKeyword sub(){
        System.out.println("SUB");
        return this;
    }
}
