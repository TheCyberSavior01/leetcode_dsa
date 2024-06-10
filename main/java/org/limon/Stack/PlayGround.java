package org.limon.Stack;

public class PlayGround {
    public static void main(String[] args) {
        NextGreaterElement nextGreaterElement = new NextGreaterElement();
        int[] nums = new int[] {10, 5, 2, 13, 15, 9, 2, 16};
        int[] res = nextGreaterElement.nextGreaterElement(nums);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
