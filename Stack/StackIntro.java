package Stack;

import java.util.*;
import java.util.Stack;

public class StackIntro {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(2);
        st.push(4);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.size());

        System.out.println(st.pop());
        System.out.println(st.isEmpty());

    }
}