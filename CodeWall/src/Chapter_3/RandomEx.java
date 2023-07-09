package Chapter_3;

import java.util.Random;

public class RandomEx {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(10);
        System.out.println(a);
    }
}
