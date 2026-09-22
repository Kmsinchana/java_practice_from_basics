public class _11_WrapperClass {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
//        == compare the position
        System.out.println(a==b); //true because Integer uses the cache to store the value from -128 to 127

        Integer a2 = 200;
        Integer b2 = 200;
        System.out.println(a2== b2); //false

        //to compare the wrapper class always use the .equals() method
//        .equals() always compares the value
        System.out.println(a.equals(b));
        System.out.println(a2.equals(b2));
//few methods in parse int
//        when we write Integer a= 100 internally it will be written as
        Integer a3 = Integer.valueOf(100); //Returns an Integer instance representing the specified int value.

        //parsexxx used to convert the string to a defined primitive type
        String s = "100";
        int val = Integer.parseInt(s);
        System.out.println(val);

//        toString Converts wrapper object into a String
        System.out.println(a3.toString());
        System.out.println(Integer.toString(300));

//        compareTo(Xxx obj) Compares two wrapper objects
        System.out.println(a.compareTo(b)); //0 means equals
        System.out.println(a.compareTo(a2));//<0(100<200 so less than 0) obj1 comes before obj2 in natural sorting order.
        System.out.println(a2.compareTo(a)); //>0 obj1 comes after obj2 in natural sorting order

        //compare(x, y)	Compares two primitive values
        System.out.println(Integer.compare(10,20));//<0

//        .sum,.min, .max also there for primitive value
        System.out.println(Integer.sum(10,30));

//        character wrapper usefull method
        Character c = 'a';
        System.out.println(Character.isUpperCase(c)); //false
        System.out.println(Character.isLetter(c));
        System.out.println(Character.isDigit(c));

//        null pointer exception
//        IMP
        Integer nu = null;
        System.out.println(nu.equals(a)); //.NullPointerException
//        code will not run after this it get stopped
        System.out.println(a.equals(nu));
    }
}
