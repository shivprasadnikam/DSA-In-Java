package Arrays;

public class ArraysAsFunctionArg {

    public static void update(int marks[]) {
        System.out.println("Function for updating existing marks of array by one");

        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Learning Arrays as function arguments");
        int marks[] = { 98, 99, 97 };
        System.out.println("Marks before update function");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Element at index " + i + " is " + marks[i]);
        }
        update(marks);
        System.out.println("Marks after update function");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Element at index " + i + " is " + marks[i]);
        }
    }

}
