package lesson1;

public class Cat extends Animal{
    private final int run;
    private final int swim;
    private static int catCount;

    protected Cat(String name, int distanceRun, int distanceSwim) {
        super(name, distanceRun, distanceSwim);
        this.run = 200;
        this.swim = 0;

        catCount++;
    }

    public static int getCatCount() {
        return catCount;
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
            System.out.printf("%s не умеет плавать%n", name);
        }
        if (distanceSwim <= swim) {
            System.out.printf("%s отдыхает у водички%n", name);
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
