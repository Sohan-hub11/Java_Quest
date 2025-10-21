//Creation of Class and Object.

package OOPs;

public class ClassAndObject {
    public static void main(String[] args){
        Pen p = new Pen(); //Creation of pen object.
        p.setColor("Red");
        System.out.println(p.color);
        p.setTipSize(2);
        System.out.println(p.tipSize + "mm");
    }
}

class Pen{ //Pen class.
    String color;
    int tipSize;
    void setColor(String newColor){
        color = newColor;
    }

    void setTipSize(int tipSize) {
        this.tipSize = tipSize;
    }
}
