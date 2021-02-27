public class Student {
    public int id;
    public String name;
    public float theory;
    public float practice;

    public Student() {
    }

    public Student(int id, String name, float theory, float practice) {
        this.id = id;
        this.name = name;
        this.theory = theory;
        this.practice = practice;
    }

    public float medium() {
        return (theory + practice) / 2;
    }
    public void display (){
        System.out.printf("%3d\t %-15s %8.2f %18.2f %19.2f\n", id, name, theory, practice, medium());
    }

}