package ru.sberbank.interview;

public class Thread_1 {

    public static void main(String[] args) {
        Thread myNewThread = new MyThread();
        myNewThread.run();
        // Имя какого потока выведется в консоль?
    }

    private static class MyThread extends Thread {

        public MyThread() {
            super();
            setName("my_thread_1");
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }

}
