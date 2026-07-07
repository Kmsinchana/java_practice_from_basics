public class _7_Singleton_enum_main {
    public static void main(String[] args){
        _7_Singleton_enum s1 = _7_Singleton_enum.INSTANCE;
        _7_Singleton_enum s2 = _7_Singleton_enum.INSTANCE;
        System.out.println(s1==s2);
        s1.actionMethod();
        s2.actionMethod();
    }
}
