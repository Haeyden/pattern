package build.prototype;

import java.util.Scanner;

public class Circle implements Shape {

    @Override
    public Object clone() {
        Circle c = null;
        try {
            c = (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return c;
    }

    @Override
    public void countArea() {
        int r = 0;
        System.out.println("半径:");
        Scanner input = new Scanner(System.in);
        String next = input.next();
        System.out.println(next);
    }
}
