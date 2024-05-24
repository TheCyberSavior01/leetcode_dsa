package org.limon;

import org.limon.LinkedList.BrowserHistory;
import org.limon.LinkedList.DesignLinkedList;
import org.limon.LinkedList.MergeTwoSotredLinkedList;
import org.limon.Queue.StudentsUnableToEatLunch;

public class Main {
    public static void main(String[] args) {
        int[] students = new int[6];
        students[0] = 1;
        students[1] = 1;
        students[2] = 1;
        students[3] = 0;
        students[4] = 0;
        students[5] = 1;

        int[] sandwiches = new int[6];
        sandwiches[0] = 1;
        sandwiches[1] = 0;
        sandwiches[2] = 0;
        sandwiches[3] = 0;
        sandwiches[4] = 1;
        sandwiches[5] = 1;
        StudentsUnableToEatLunch studentsUnableToEatLunch = new StudentsUnableToEatLunch();
        int result = studentsUnableToEatLunch.countStudents(students, sandwiches);
        System.out.println(result);
    }

}