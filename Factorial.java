public class Factorial {
    public static void main(String[] args) {
        recursive(-1);
    }

    public static Integer recursive(int i) {

        if (i == 0) {
            return 1;
        } else if (i > 0) {
            return i * recursive(i - 1);
        } else {
            System.out.println("Number must be positive");
        }
        return null;
    }


  /*public static Integer recursive(int i) {
        int b = 5;
        if (i == 0) {
            b = 1;
        } else if (i > 0) {
            b = i * recursive(i - 1);
        } else {
            System.out.println("Number must be positive");
        }
        return b;
    }*/
}