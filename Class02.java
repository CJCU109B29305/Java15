//(a)
class CTest extends Thread {
    private String id;

    public CTest(String str) {
        id = str;
    }

    // (b)
    public void run() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 1000000; j++);
            System.out.println(id + i);
        }
    }
}

public class Class02 {
    public static void main(String[] argv) {
        // (c)
        CTest hi = new CTest("Hello ");
        CTest bye = new CTest("Good bye ");
        hi.run();
        bye.run();
        // (d)先執行hi.run 回到run函數執行 中間的j是間隔時間 最後再回傳System.out.pintln("輸入的字串"+i)
    }
}