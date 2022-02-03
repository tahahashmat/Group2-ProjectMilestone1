public class Main {

    public static void main(String[] args){
        System.out.println("Hello World from Adam");

        int count = 0;
        try {
            while (true) {
                Thread.sleep(2 * 1000);
                System.out.println("I'm still running, Iteration: " + count++);
            }
        }
            catch( InterruptedException e){
                e.printStackTrace();
            }

    }
}
