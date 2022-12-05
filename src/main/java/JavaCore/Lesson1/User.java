package JavaCore.Lesson1;

public class User {
    private int id;
    private String name;
    private String position;
    private int age;
    public User (int id, String name, String position, int age) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.age = age;
    }
    public void info() {
        System.out.println("id" + id + ";Name user:" + name+ ";Name position" + position + ";Age" + age);
    }
    public void changePosition(String position) {
        this.position = position;
        System.out.println("User" + name + "Get new position:" + position);
    }
}
