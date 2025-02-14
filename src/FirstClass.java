public class FirstClass {
    public static void main(String[] arg){

        int myMarks = 40;
        int aMark = 75;
        int bMark = 65;
        int cMark = 45;
        int sMark = 35;
        int maxMark = 100;

        if (myMarks > aMark && myMarks < maxMark) {
            System.out.print("You got an A pass son but not the max mark.");
        }

        if (myMarks > bMark && myMarks < aMark) {
            System.out.print("You got a B pass son");
        }

        if (myMarks > cMark && myMarks < bMark) {
            System.out.print("You got a C pass son");
        }

        if (myMarks > sMark && myMarks < cMark) {
            System.out.print("You got a S pass son");
        }

        if (myMarks < sMark) {
            System.out.print("You are Fail son. Try next time");
        }
    }
}
