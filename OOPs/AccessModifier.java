//To understand Access Modifier.

package OOPs;

public class AccessModifier {
    public static void main(String[] args){
        BankAccount myAcc = new BankAccount();
        myAcc.username = 123456;
        //myAcc.password = "abc"; -- this can't occur as it is private, access is denied outside class.
        myAcc.setPassword("sosa"); //it can be accessed as it is "protected" Access Modifier, which is accessed within package.
    }
}

class BankAccount {
    public int username;
    private String password;

    protected void setPassword(String pwd) {
        password = pwd;
    }
}
