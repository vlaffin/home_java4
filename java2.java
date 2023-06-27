package home_java4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class java2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите скобочки");
        String text1 = sc.nextLine();
        sc.close();
        System.out.println(check(text1));
    }

    public static boolean check(String s) {
        Deque<Character> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' ||
                    s.charAt(i) == '{' ||
                    s.charAt(i) == '[')
                list.add(s.charAt(i));
            else {
                if (list.isEmpty())
                    return false;
                else if (s.charAt(i) == ')' && list.getLast().equals('('))
                    list.pollLast();
                else if (s.charAt(i) == '}' && list.getLast().equals('{'))
                    list.pollLast();
                else if (s.charAt(i) == ']' && list.getLast().equals('['))
                    list.pollLast();
                else
                    return false;
            }
        }
        return list.isEmpty();
    }
}
