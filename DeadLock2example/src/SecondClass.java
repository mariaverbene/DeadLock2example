public class SecondClass {

    public synchronized void secondFunc (FirstClass first) throws InterruptedException {
        Thread.sleep(1000);
        first.firstPrint();
    }

    public synchronized void secondPrint () {
        System.out.println("2");
    }
}
