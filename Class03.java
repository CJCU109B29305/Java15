class CTest2 extends Thread {
    private String id;

    public CTest2(String str) {
        id = str;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 100000000; j++);
            System.out.println(id + i);
        }
    }
}

public class Class03 {
    public static void main(String[] argv) {
        CTest2 hi = new CTest2("Hello ");
        CTest2 bye = new CTest2("Good bye ");
        hi.start(); //start 同時執行為隨機排序
        bye.start();
    }
}
