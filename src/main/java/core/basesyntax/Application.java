package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt();
        System.out.println(randomInt);
    }
}