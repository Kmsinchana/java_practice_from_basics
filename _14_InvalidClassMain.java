public class _14_InvalidClassMain {
    public void userInput() throws _14_InvalidInput{
        int m=18;
        try {
            if(m<=18){
                throw new _14_InvalidInput("Invalid input");
            }
            System.out.println("user input is correct");
        }catch (_14_InvalidInput e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args){
        _14_InvalidClassMain main = new _14_InvalidClassMain();
        main.userInput();
    }
}

