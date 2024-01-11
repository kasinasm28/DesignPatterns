import java.util.concurrent.locks.ReadWriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class RunnableForProducer implements  Runnable {
    SharedResource resource = new SharedResource();
    ReadWriteLock lock = new ReentrantReadWriteLock();
    @Override
    public void run() {
        resource.producer(lock);
    }

}
