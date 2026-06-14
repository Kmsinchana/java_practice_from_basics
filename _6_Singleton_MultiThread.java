public class _6_Singleton_MultiThread {
    private static _6_Singleton_MultiThread instance;

    private  _6_Singleton_MultiThread(){
        System.out.println("new instance created =>" +this.hashCode());
    }

    public static _6_Singleton_MultiThread getInstance(){
        if (instance == null){
            instance = new _6_Singleton_MultiThread();
        }
        return instance;
    }

    public static void main(String [] args){
        Runnable task =()->{
            _6_Singleton_MultiThread singleton = _6_Singleton_MultiThread.getInstance();
            System.out.println(Thread.currentThread().getName() +"=>"+singleton.hashCode());
        };
        Thread t1 = new Thread(task,"thread1");
        Thread t2 = new Thread(task,"thread2");
        Thread t3 = new Thread(task,"thread3");
        t1.start();
        t2.start();
        t3.start();
    }
//    output i got 3 instance are created for 3 thread
//    new instance created912752569
//new instance created1438878975
//new instance created81307509
//    thread2=>912752569
//    thread1=>81307509
//    thread3=>1438878975

}
