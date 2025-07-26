package main.java.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ_10828_Stack_스택 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack stack = new Stack();

        String line;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            String[] parts = line.split(" ");
            String cmd = parts[0];

            if (cmd.equals("push")) {
                int value = Integer.parseInt(parts[1]);
                stack.push(value);
            } else if (cmd.equals("top")) {
                System.out.println(stack.top());
            } else if (cmd.equals("size")) {
                System.out.println(stack.size());
            } else if (cmd.equals("empty")) {
                System.out.println(stack.empty());
            } else if (cmd.equals("pop")) {
                System.out.println(stack.pop());
            }
        }

        br.close();
    }
}

class Stack {
    List<Integer> box = new ArrayList<>();

    public void push(Integer x) {
        box.add(x);
    }

    public Integer pop() {
        if (box.isEmpty()) {
            return -1;
        }
        return box.remove(box.size() - 1);
    }

    public Integer size() {
        return box.size();
    }

    public Integer empty() {
        if (box.isEmpty()) {
            return 1;
        }
        return 0;
    }

    public Integer top() {
        if (box.isEmpty()) {
            return -1;
        }
        return box.get(box.size() - 1);
    }

}
