package Preparation;
//Static Keyword
/* Can be;
   -Variable- saves memory
   -Method
   -Block
   -Nested class
 */

public class StaticKeyWord {
    int count = 0;   //Instance Variable
    static int room;   //Static variable
    static String college;

    StaticKeyWord(int room, String college) {
        StaticKeyWord.room = room;
        StaticKeyWord.college = college;

    }

    StaticKeyWord(int count) {
        this.count = count;
    }

    void display() {
        System.out.println(room + " " + college + " \n");
        for (; count < 3; count++) {
            System.out.println(count);
        }
    }
}
