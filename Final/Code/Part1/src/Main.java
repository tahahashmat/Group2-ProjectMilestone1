public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int count = 0;
        try{
            while (true){
                Thread.sleep(2*1000);
                System.out.println("Im still here! Iteration" + count++);
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}





