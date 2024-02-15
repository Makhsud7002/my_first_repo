package uz.pdp.homework.mystack;

import java.util.Arrays;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(-1);
        stack.push(7);
        stack.push(6);
        stack.push(14);
        stack.push(12);
        stack.push(13);
        stack.push(17);
        stack.push(21);
        System.out.println("stack = " + stack);
        System.out.println(stack.capacity());
        System.out.println(stack.size());


//        Stack<Integer> integers = new Stack<>();
//
//
//        integers.push(1);
//        integers.push(3);
//        integers.push(4);
//        integers.push(5);
//        integers.push(5);
//        integers.push(5);
//        integers.push(5);
//        integers.push(5);
//        integers.push(5);
//        integers.push(5);
//        integers.push(null);
//        integers.push(null);
//        integers.push(null);
//        integers.push(null);
//        System.out.println("capasity "+ integers.capacity());
//        System.out.println("size "+integers.size());
//        System.out.println(integers);
//        System.out.println(integers.search(4));

    }
}
