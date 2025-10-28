//Understanding Copy Constructor.

package OOPs;

public class CopyConstructor {
    public static void main(String[] args){
        Student1 st1 = new Student1();
        st1.name = "Sohan";
        st1.roll = 50;
        st1.password = "abc";
        st1.marks[0] = 100;
        st1.marks[1] = 90;
        st1.marks[2] = 80;

        Student1 st2 = new Student1(st1);
        st2.password = "xyz";

        st1.marks[1] = 85; //Changing the marks of st1.

        for(int i=0; i<st2.marks.length; i++){
            System.out.println(st2.marks[i]);
        }
    }
}

class Student1{
    String name;
    int roll;
    String password;
    int[] marks;

//    Student1(Student1 st1){ //Copy Constructor (Shallow Copy).
//        marks = new int[3];
//        this.name = st1.name;
//        this.roll = st1.roll;
//        marks = st1.marks;
//    }

    Student1(Student1 st1){ //Copy Constructor (Deep Copy).
        marks = new int[3];
        this.name = st1.name;
        this.roll = st1.roll;
        for(int i=0; i< marks.length; i++){
            marks[i] = st1.marks[i];
        }
    }

    Student1(){ //Default Constructor.
        marks = new int[3];
        System.out.println("Running...");
    }

    Student1(String name){ //Parameterized Constructor
        marks = new int[3];
        this.name = name;
    }

    Student1(int roll){
        marks = new int[3];
        this.roll = roll;
    }

}
