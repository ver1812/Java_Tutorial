import java.util.concurrent.*;

class Assignment implements Callable<Integer> {
    public Integer call() {
        System.out.println("Thread is running");
        for(int i=0; i<10; i++) {
            System.out.println("Thread is running: " + i);
            try{
                Thread.sleep(1000);
            } catch(Exception e) {
                System.out.println(e);
            }

        }
        System.out.println("Thread is over");
        return 0;
    }
}
class Songs implements Callable<Integer> {
    public Integer call() {
        System.out.println("song is running");
        for(int i=0; i<20; i++) {
            System.out.println("Thread is running: " + i);
            try{
                Thread.sleep(1000);
            } catch(Exception e) {
                System.out.println(e);
            }

        }
        System.out.println("Song is over");
        return 0;
    }
}

class Movie implements Callable<Double>{
    public Double call() {
        System.out.println("Movie is running");
        for(int i=0; i<20; i++) {
            System.out.println("Thread is running: " + i);
            try{
                Thread.sleep(1000);
            } catch(Exception e) {
                System.out.println(e);
            }

        }
        System.out.println("Movie is over");
        return 0.0;
    }
}

class P6 {
    public static void main(String[] args) {
        System.out.println("Main thread is running");
        ExecutorService es = Executors.newFixedThreadPool(3);
        es.submit(new Assignment());
        es.submit(new Songs());
        es.submit(new Movie());
        es.shutdown();
        try{
            es.awaitTermination(1, TimeUnit.DAYS);
        } catch(Exception e) {
            System.out.println(e);
        }
        
        
        System.out.println("Main thread is over");
    }
    
}
