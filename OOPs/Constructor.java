//Understanding Constructor.

package OOPs;

public class Constructor {
    public static void main(String[] args){
        Student s = new Student();
        Student s1 = new Student("Sohan");
        Student s2 = new Student(21);
        Student s3 = new Student("Samanta", 50);
        /*
        Using same Constructor with different Arguments is called Constructor Overloading.
         */

        //Student s4 = new Student(25, "abc"); -- this form of Constructor is not declared.
    }
}

class Student{
    Student(){ //Default Constructor.
        System.out.println("Constructor is running....");
    }

    Student(String name){ //Parameterized Constructor
        System.out.println(name);
    }

    Student(int age){
        System.out.println(age);
    }

    Student(String title, int rollNo){
        System.out.println(title + " " + rollNo);
    }

}