public class Main {
    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World!");
        int var1 = 0;

        try {
            while(true) {
                Thread.sleep(2000L);
                int var10001 = var1++;
                System.out.println("I'm still here! Iteration " + var10001);
            }
        } catch (InterruptedException var3) {
            var3.printStackTrace();
        }
    }
}