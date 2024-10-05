package hw;



public class DoubleArr {

    public  void method (){

        double[] array = new double[100000000];
        long startTime = System.currentTimeMillis();
        for (int i=0; i<array.length;i++){
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        System.out.println(timeElapsed);

    }

    public void method2 () throws InterruptedException {

        double[] array = new double[100000000];
        long startTime = System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
            for (int i=0; i<array[25000000];i++){
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i > array[25000000] && i < array[50000000]; i++){
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread t3 = new Thread(() -> {
            for (int i=0; i > array[50000000] && i < array[75000000];i++){
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread t4 = new Thread(() -> {
            for (int i=0; i > array[75000000] && i < array[99999999];i++){
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();



        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        System.out.println(timeElapsed);

    }

    public static void main(String[] args) throws InterruptedException {
        DoubleArr dobleArr = new DoubleArr();
        dobleArr.method();
        dobleArr.method2();


    }
}