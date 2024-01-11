package NestedInterfaces;

import NestedInterfaces.Bird;

public class Vlture implements Bird.NonFlyingBird {

    @Override
    public void canRun() {
        System.out.println("I can run");
    }
}
