public class _14_exception {

    public static  void main(String[] args){
        int m=10;
        int n =0;
        try {
            if(n==0) {
                throw new ArithmeticException("divide by zero exception");
            }
            int res= m/n;
        }catch (ArithmeticException e){
          System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("Runnable exception executes when non of the above catch exception dosen't match");
        } finally {
            System.out.println("this block always get executes");
        }
    }
}
