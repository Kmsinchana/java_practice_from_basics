public class _7_Singleton_MultiThread_Solution {
    private _7_Singleton_MultiThread_Solution(){
        System.out.println("the instance is created =>" +this.hashCode());
    }
    private static _7_Singleton_MultiThread_Solution instance;

    public static _7_Singleton_MultiThread_Solution getInstance(){
        if(instance== null){ //first check(no locker)
            //only one thread can enter this block at a time, others must wait
            //Classname.class is an object of type Class<_7_Singleton_MultiThread_Solution> created by JVM when the class is loaded
            //since its a shared object, it can be used as a lock in synchronized blocks.
            synchronized (_7_Singleton_MultiThread_Solution.class){ //Lock
                if(instance == null){ //second checker
                    instance = new _7_Singleton_MultiThread_Solution(); //create instance
                }
            }
        }
        return instance;
    }
    public static void main(String[] args){
        Runnable task = ()->{
            _7_Singleton_MultiThread_Solution s1 = _7_Singleton_MultiThread_Solution.getInstance();
//          i can make the break point to stop for each execution of thread right click->suspend->thread and in console select each thread
            System.out.println(Thread.currentThread().getName()+"=> "+s1.hashCode());
        };
        Thread t1 = new Thread(task,"thread1");
        Thread t2 = new Thread(task,"thread2");
        Thread t3 = new Thread(task,"thread3");

        t1.start();
        t2.start();
        t3.start();
    }

//    only one instance is created
//    the instance is created =>1481313829
//    thread1=> 1481313829
//    thread2=> 1481313829
//    thread3=> 1481313829
}
