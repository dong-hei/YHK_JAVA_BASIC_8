package section8_memory;

/**
 * 스택 영역
 */
public class JavaMemoryMain1 {
    public static void main(String[] args) {
        System.out.println("main start");
        int m1 = 10;
        method1(m1);
        System.out.println("main end");
    }
    static void method1(int m1){
        System.out.println("method1 start");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method1 end");
    }

    static void method2(int m2){
        System.out.println("method2 start");
        System.out.println("method2 end");
    }
}
