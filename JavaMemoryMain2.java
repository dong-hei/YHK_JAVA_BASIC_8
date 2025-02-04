package section8_memory;

/**
 * 스택 영역과 힙 영역
 */
public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }

    static void method1() {
        System.out.println("method1 start");
        Data d1 = new Data(10);
        method2(d1);
        System.out.println("method1 end");
    }

    static void method2(Data d2) {
        System.out.println("method2 start");
        System.out.println("data.val= " + d2.getVal());
        System.out.println("method2 end");
    }
}
