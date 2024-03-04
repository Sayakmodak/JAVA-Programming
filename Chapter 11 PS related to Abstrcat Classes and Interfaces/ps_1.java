package CodeWithHarry;

abstract class Pen{
    abstract void Write();
    /*{
        System.out.println("Writting now...");
    }*/
    abstract void refill();
}
class FountenPen extends Pen{
    void refill(){
        System.out.println("Changing the refill...");
    }
    void Write(){
        System.out.println("Writting now...");
    }
    void changeNib(){
        System.out.println("Changing the nib...");
    }
}
public class ps_1 {

    public static void main(String[] args) {
        FountenPen fp = new FountenPen();
        fp.Write();
        fp.refill();
        fp.changeNib();
    }
}

// javac -d . *.java  ==> here the package will be created
// javac -d abc *.java  ==> the package will be created under the "abc" file