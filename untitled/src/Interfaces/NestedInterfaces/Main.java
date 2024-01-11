package NestedInterfaces;
import NestedInterfaces.Vlture;
public class Main {
    public static void main(String[] args) {
        Eagle americanEagle= new Eagle();
        Vlture vulture=new Vlture();
        vulture.canRun();
        try{
            Thread.sleep(10000);
        }catch(Exception e){
            
        }
        americanEagle.canFly();
    }

}
