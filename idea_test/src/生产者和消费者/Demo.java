package 生产者和消费者;

public class Demo {
    public static void main(String[] args) {
        Box b = new Box();

        Producer producer = new Producer(b);
        Customer customer = new Customer(b);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(customer);

        t1.start();
        t2.start();
    }




}
