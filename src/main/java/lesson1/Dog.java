package lesson1;

public class Dog extends Animal {
    private final int run;
    private final int swim;
    private static int dogCount;

    protected Dog(String name, int distanceRun, int distanceSwim) {
        super(name, distanceRun, distanceSwim);
        this.run = 500;
        this.swim = 10;

        dogCount++;
    }
    public static int getDogCount() {
        return dogCount;
    }

    public int getRun() {
        if (distanceRun > run) {
            System.out.printf("%s пробежал %s метров, сильно устал и не добежал %s метров%n", name, run, (distanceRun - run));
        }
        if (distanceRun <= run) {
            System.out.printf("%s пробежал %s метров%n", name, distanceRun);
        }
        return run;
    }

    public int getSwim() {
        if (distanceSwim > swim) {
            System.out.printf("%s проплыл %s метров, сильно устал и не доплыл %s метров%n", name, swim, ( distanceSwim- swim));
        }
        if (distanceSwim <= swim) {
            System.out.printf("%s проплыл %s метров%n", name, distanceSwim);
        }
        return swim;
    }

    @Override
    public void printInfo() {
        System.out.printf("%s должен пробежать %s метров и проплыть %s метров%n", name, distanceRun, distanceSwim);
        getRun();
        getSwim();
    }
}
