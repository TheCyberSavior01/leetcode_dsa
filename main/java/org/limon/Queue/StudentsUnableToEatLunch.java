package org.limon.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StudentsUnableToEatLunch {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        for(int student : students) {
            queue.offer(student);
        }

        int j = 0;
        boolean flag = true;
        while (flag) {
            int c = 0;
            for(int i = 0; i < queue.size(); i++) {
                if(queue.peek() == sandwiches[j]) {
                    queue.poll();
                    j++;
                    c++;
                } else {
                    int temp = queue.poll();
                    queue.offer(temp);
                }
            }
            flag = c > 0;
        }
        return queue.size();
    }
}
