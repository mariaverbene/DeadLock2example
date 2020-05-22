public class FirstClass {

    public synchronized void firstFunc (SecondClass second) throws InterruptedException {
        Thread.sleep(1000);
        second.secondPrint();
    }

    public synchronized void firstPrint () {
        System.out.println("1");
    }
}
