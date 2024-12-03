package basic;

// Ternary vs if else
public class ControlFlowDemo {
    public static void main(String[] args) {
        // if - else
        // if else if else
        // ternary operator -> ? :

        char gender = 'm'; // 'm'
        if (gender == 'f') {
            System.out.println("Gender is : female");
        } else {
            System.out.println("Gender is : male ");
        }
        String renderedGender = (gender == 'f') ? "female" : "male";
//        System.out.println("Gender is:"+((gender=='f')?"female":"male"));
        System.out.println("Gender is : " + renderedGender);


        // switch -> case

    }
}
