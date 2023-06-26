class Assignment extends Thread {
    public void run() {
        System.out.println("Thread is running");
        for(int i=0; i<10; i++) {
            System.out.println("Thread is running: " + i);
            try{
                Thread.sleep(1000);
            } catch(Exception e) {
                System.out.println(e);
            }

        }

    }
}

class Song extends Thread {
    public void run() {
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

    }
}
class P1{
    public static void main(String[] args) {
        System.out.println("Main thread is running");
        Assignment a = new Assignment();
        Song s = new Song();
        a.start();
        
        s.start();

        try{
            a.join();
            s.join();
        } catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("Main thread is over");
    }
}