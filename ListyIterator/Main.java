package ListyIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        ListyIterator<String> listyIterator = null;

        while (!input.equals("END")) {
            String[] elements = input.split(" ");

            switch (elements[0]) {
                case "Create":
                    if (elements.length > 1) {
                        listyIterator = new ListyIterator<>(Arrays.copyOfRange(elements, 1, elements.length));
                    } else {
                        listyIterator = new ListyIterator<String>();
                    }
                    break;
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "Print":
                    try {
                        listyIterator.print();
                    } catch (IllegalStateException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
            }

            input = sc.nextLine();
        }


    }
}
