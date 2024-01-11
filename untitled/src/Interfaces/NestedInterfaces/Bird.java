package NestedInterfaces;

interface Bird {
//    creatin an interface within a interface
    public void canFly();

    interface NonFlyingBird{
        void canRun();
    }

}
