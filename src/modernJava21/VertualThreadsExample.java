package modernJava21;

public class VertualThreadsExample {
    public static void main(String[] args) throws Exception{

        for(int i=0;i<10;i++){
            Thread.startVirtualThread(()->{
                System.out.println("Running in : "+Thread.currentThread());
            });
        }
        Thread.sleep(1000);

    }
}
