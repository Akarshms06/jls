package CIE;
public class Student {
    public String usn, name;
    public int sem;
}
public class Internals extends Student {
    public int[] internalMarks = new int[5];
}

package SEE;
public class External extends Student {
    public int[] externalMarks = new int[5];
}

import CIE.*;
import SEE.*;
public class FinalMarks {
    public static void main(String[] args) {
        int n = 3; // number of students
        Internals[] cie = new Internals[n];
        External[] see = new External[n];

        // input the marks for each student
        for (int i = 0; i < n; i++) {
            cie[i] = new Internals();
            see[i] = new External();
            for (int j = 0; j < 5; j++) {
                cie[i].internalMarks[j] = // input value for internal mark for course j
                see[i].externalMarks[j] = // input value for external mark for course j
            }
        }

        // print the final marks for each student
        for (int i = 0; i < n; i++) {
            System.out.println("Final marks for student " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                int finalMark = cie[i].internalMarks[j] + see[i].externalMarks[j];
                System.out.println("Course " + (j + 1) + ": " + finalMark);
            }
        }
    }
}
