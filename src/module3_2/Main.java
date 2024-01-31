package module3_2;

public class Main {

    public static void move(int n, int from, int to, int spare) {
        if (n == 1) {
            System.out.println("Disk 1 moves from " + from + " to " + to);
        } else {
            move(n - 1, from, spare, to);
            System.out.println("Disk " + n + " moves from " + from + " to " + to);
            move(n - 1, spare, to, from);
        }
    }

    public static void main(String[] args) {
        int height = 4;
        Main.move(height, 1, 2, 3);
    }
}