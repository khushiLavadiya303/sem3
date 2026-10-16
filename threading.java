1.write a program to use sleep method with Thread.
class Testsleep extends Thread {
    Testsleep(String name) {
        super(name);
    }
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(this + " : " + i);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Testsleep t1 = new Testsleep("Thread 1");
        Testsleep t2 = new Testsleep("Thread 2");
        t1.start();
        t2.start();
    }
}

2.Create a class TestThread which extends class Thread and show the use of sleep
method. (Create 2 thread of TestThread ).
class TestThread extends Thread {
    TestThread(String name) {
        super(name);
    }
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(this + " : " + i);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        // Creating 2 threads of TestThread as required by Question 8[span_1](start_span)[span_1](end_span)
        TestThread t1 = new TestThread("Thread 1");
        TestThread t2 = new TestThread("Thread 2");       
        t1.start();
        t2.start();
    }
}