package CIE;

public class Internals extends Student {
    public int[] internalMarks = new int[6];

    public Internals(String usn, String name, int sem, int[] internalMarks) {
        this.usn = usn;
        this.name = name;
        this.sem = sem;
        this.internalMarks = internalMarks;
    }
}

package CIE;

public class Student {
    public String usn;
    public String name;
    public int sem;
}

package SEE;

import CIE.Student;

public class External extends Student {
    public int[] seeMarks = new int[6];

    public External(String usn, String name, int sem, int[] seeMarks) {
        this.usn = usn;
        this.name = name;
        this.sem = sem;
        this.seeMarks = seeMarks;
    }
}

import CIE.Internals;
import SEE.External;

public class Main {
    public static void main(String[] args) {
        int N = 5;
        Internals[] internalStudents = new Internals[N];
        External[] externalStudents = new External[N];

        for (int i = 0; i < N; i++) {
            internalStudents[i] = new Internals("USN" + (i + 1), "Student" + (i + 1), 3, new int[]{80, 85, 75, 90, 88, 92});
            externalStudents[i] = new External("USN" + (i + 1), "Student" + (i + 1), 3, new int[]{70, 75, 65, 80, 78, 82});
        }

        for (int i = 0; i < N; i++) {
            System.out.println("Student: " + internalStudents[i].name);
            System.out.println("USN: " + internalStudents[i].usn);
            System.out.println("Semester: " + internalStudents[i].sem);

            int totalMarks = 0;
            for (int j = 0; j < 6; j++) {
                int finalMarks = internalStudents[i].internalMarks[j] + externalStudents[i].seeMarks[j];
                totalMarks += finalMarks;
                System.out.println("Course " + (j + 1) + " Final Marks: " + finalMarks);
            }
            System.out.println("Total Marks: " + totalMarks + "\n");
        }
    }
}