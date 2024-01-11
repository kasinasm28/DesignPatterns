import java.util.concurrent.locks.ReadWriteLock;

public class SharedResource {
    boolean isAvailable=false;
    public void producer(ReadWriteLock lock) {
        try {
            lock.readLock().lock();
            System.out.println("Read lock acquired by: " + Thread.currentThread().getName());

            Thread.sleep(10000);
        } catch (Exception e) {
        } finally {
            lock.readLock().unlock();
            System.out.println("Read Lock released by : " + Thread.currentThread().getName());
        }
    }
        public void consume(ReadWriteLock lock){
            try{
                lock.writeLock().lock();
                System.out.println("Write Lock acquired by: "+ Thread.currentThread().getName());
                isAvailable=false;
            }catch(Exception e){

            }
            finally {
                lock.writeLock().unlock();
                System.out.println("Write Lock Released by : "+ Thread.currentThread().getName());
            }
        }
    }
