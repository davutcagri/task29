public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            try {
                Thread.sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}