import java.io.FileNotFoundException;

public class _14_exceptionCheckedImpl extends _14_exceptionChecked{

    public void readFIleFrom(){
        try {
            readFile();
            System.out.println("file reade successfully");
        } catch (FileNotFoundException e) {

        }
    }

    public static void main(String[] args){
        _14_exceptionCheckedImpl impl = new _14_exceptionCheckedImpl();
        impl.readFIleFrom();
    }
}
