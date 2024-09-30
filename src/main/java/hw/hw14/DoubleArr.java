package hw.hw14;

public class DoubleArr {

    public  void method (double[] array){
        long startTime = System.currentTimeMillis();
        for (int i=0; i<array.length;i++){
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        System.out.println(timeElapsed);

    }

    public  void method2 (double[] array) {
        long startTime = System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
            for (int i=0; i<array[25000];i++){
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i > array[25000] && i < array[50000]; i++){
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread t3 = new Thread(() -> {
            for (int i=0; i > array[50000] && i < array[75000];i++){
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread t4 = new Thread(() -> {
            for (int i=0; i > array[75000] && i < array[99999];i++){
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();



        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        System.out.println(timeElapsed);

    }

    public static void main(String[] args){
        DoubleArr dobleArr = new DoubleArr();
        double[] array = new double[100000];
        dobleArr.method(array);
        dobleArr.method2(array);


    }
}
