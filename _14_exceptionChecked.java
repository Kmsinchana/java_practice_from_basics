import java.io.FileNotFoundException;
import java.io.FileReader;

public class _14_exceptionChecked {

    public void readFile() throws FileNotFoundException{
        FileReader reader = new FileReader("java.txt");
    }
}
