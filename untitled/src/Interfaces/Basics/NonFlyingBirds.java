package Interfaces;

class NonFlyingBirds implements Bird, LivingThings {

    @Override
    public void fly() {
        System.out.println("I am flying");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void canRun() {
        System.out.println("i can Run");
    }
}
