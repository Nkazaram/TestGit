package lesson1;

public abstract class Animal {
    public String name;
    public int distanceRun;
    public int distanceSwim;

    public Animal(String name, int distanceRun, int distanceSwim) {
        this.name = name;
        this.distanceRun = distanceRun;
        this.distanceSwim = distanceSwim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistanceRun() {
        return distanceRun;
    }

    public void setDistanceRun(int distanceRun) {
        this.distanceRun = distanceRun;
    }

    public int getDistanceSwim() {
        return distanceSwim;
    }

    public void setDistanceSwim(int distanceSwim) {
        this.distanceSwim = distanceSwim;
    }

    public abstract void printInfo();
}
