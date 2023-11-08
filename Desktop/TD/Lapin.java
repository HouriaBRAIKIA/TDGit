
//Dans Lapin.java
public class Lapin extends Animal{
    @Override
     void  seDeplacer(int x, int y){ //erreur public
        super.seDeplacer(x,y)
        System.out.println("Lapin !")
    }
}