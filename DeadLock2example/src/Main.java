public class Main {


    public static void main(String[] args) throws InterruptedException {

        FirstClass first = new FirstClass();
        SecondClass second = new SecondClass();

        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    second.secondFunc(first);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();


        first.firstFunc(second);

    }

}
