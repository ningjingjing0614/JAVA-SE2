package pack8;
//
//import java.util.Deque;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Stack;

import java.util.Stack;

public class prac50 {
//    public static void main(String[] args) {
////        Stack<String> stack = new Stack<>();//栈
//////        System.out.println(stack.size());
//////
//////        stack.push("A");
//////        stack.push("B");
//////        stack.push("C");
//////        System.out.println(stack.size());
//////        System.out.println(stack.peek());
//////        System.out.println(stack);
////        System.out.println(stack.pop());
////        System.out.println(stack);
////
//        Deque<String> stack = new LinkedList<>();//双向队列接口看作栈使用，利用链表类继承
//////        stack.push("a");
//////        stack.push("b");
//////        stack.push("c");
//        System.out.println(stack);
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//
////
//        Queue<String> queue = new LinkedList<>();//队列接口实现
//
//        ((LinkedList<String>) queue).add("a");
//        ((LinkedList<String>) queue).add("b");
//        queue.add("c");
//        System.out.println(queue);
//        System.out.println(queue.element());
//        System.out.println(queue.remove());
//        System.out.println(queue);
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//
//    }
//
//    private Stack<Integer> stack1 = new Stack<>();
//    private Stack<Integer> stack2 = new Stack<>();
//
//    public void push(int x){
//        stack2.push(x);
//    }
//    public int pop(){
//        if(stack2.isEmpty()){
//           return stack1.pop();
//        }else {
//            while (!stack2.isEmpty()) {
//                int a = stack2.pop();
//                stack1.push(a);
//            }
//        }
//        return stack1.pop();
//    }
//    public int peek() {
//        if (stack2.isEmpty()){
//            return peek();
//        }else {
//
//        }
//    }

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    void push(int val) {
        stack.push(val);
    }

    void pop() {
        stack.pop();
    }

    int top() {
        stack.peek();
    }

    int getMin() {
        if(stack1 == null){
            stack1.push(stack.peek());
            stack2.push(stack.peek());
        }else {
            stack1.peek();
        }


    }
 }
