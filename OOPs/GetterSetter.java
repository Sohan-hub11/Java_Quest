package OOPs;

public class GetterSetter {
    public static void main(String[] args){
        Pen1 p = new Pen1(); //Creation of pen object.
        p.setColor("Red");
        System.out.println(p.getColor());
        p.setTipSize(2);
        System.out.println(p.getTipSize() + "mm");
        //p.color = "Blue" -- it will not be accessed as it is private.
    }
}

/*
    this => this keyword is used to refer to the current object.
 */

class Pen1 { //Pen class.
    private String color;
    private int tipSize;
    public void setColor(String newColor){
        this.color = newColor;
    }
    public String getColor(){
        return this.color;
    }

    public void setTipSize(int tipSize) {
        this.tipSize = tipSize;
    }

    public int getTipSize() {
        return this.tipSize;
    }
}

