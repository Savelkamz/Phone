public class Persone {
    private String fullName;
    private int age;
    public Persone() {}
    public Persone(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public void move() {
        System.out.println(fullName + " двигается");
    }
    public void talk() {
        System.out.println(fullName + " говорит");
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}