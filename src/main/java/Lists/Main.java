package Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nARRAY LIST\n");

        List<Person> arrayList = new ArrayList<>();

        arrayList.add(new Person("Array list person 1"));
        arrayList.add(new Person("Array list person 2"));
        arrayList.add(new Person("Array list person 3"));

        for (Person person : arrayList) {
            System.out.println(person.getName());
        }

        arrayList.remove(1);

        System.out.println("");

        for (Person person : arrayList) {
            System.out.println(person.getName());
        }

        arrayList.clear();

        System.out.println("\nis empty? " + arrayList.isEmpty());

        System.out.println("\nLINKED LIST\n");
        LinkedList<Person> linkedList = new LinkedList<>();

        linkedList.add(new Person("Linked list person 1"));
        linkedList.add(new Person("Linked list person 2"));
        linkedList.add(0, new Person("Linked list person 3"));

        for (Person person : linkedList) {
            System.out.println(person.getName());
        }

        for (Person person : linkedList) {
            if (person.getName().equals("Linked list person 2")) {
                linkedList.remove(person);
                break;
            }
        }

        System.out.println("");

        for (Person person : linkedList) {
            System.out.println(person.getName());
        }

        System.out.println("\nFirst: " + linkedList.getFirst().getName());
        System.out.println("Last: " + linkedList.getLast().getName());

        linkedList.clear();

        System.out.println("\nis empty? " + linkedList.isEmpty());

        System.out.println("\nSTACK");
        Stack<Integer> stack = new Stack<>();

        System.out.println("\nstack = " + stack);
        System.out.println("is empty? " + stack.isEmpty());

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("\nstack = " + stack);
        System.out.println("is empty? " + stack.isEmpty());

        System.out.println("");

        for (Integer integer : stack) {
            System.out.println(integer);
        }

        System.out.println("\nsearch \"3\" element: " + stack.search(3));

        stack.pop();

        System.out.println("\nsearch \"3\" element: " + stack.search(3));
        System.out.println("\nlast added " + stack.peek());

    }
}
