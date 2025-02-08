package StackIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        CustomStack stack = new CustomStack();

        while (!input.equals("END")){

            if (input.equals("Pop")){
                stack.pop();
            }else {
                int [] numbers = Arrays.stream(input.replace("Push ", "")
                                .split(", "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

                for (int number : numbers){
                    stack.push(number);
                }
            }
            input = sc.nextLine();
        }

        for (Integer num : stack){
            System.out.println(num);
        }
        for (Integer num : stack){
            System.out.println(num);
        }

    }
}
