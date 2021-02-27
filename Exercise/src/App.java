public class App {
    public static void main(String[] args) throws Exception {
        Student sv1 = new Student();
        sv1.id = 100;
        sv1.name = "Duc";
        sv1.theory = 8.5f;
        sv1.practice = 9.5f;

        Student sv2 = new Student();
        sv2.id = 110;
        sv2.name = "Linh";
        sv2.theory = 10;
        sv2.practice = 9.25f;

        Student sv3 = new Student();
        sv3.id = 130;
        sv3.name = "Tay";
        sv3.theory = 1;
        sv3.practice = 0;

        Student sv4 = new Student(0, "Crypto", 10, 10);

        System.out.printf("%1s\t %-15s %8s %18s %19s\n", "ID", "Name","Theory","Practice","Average");
        sv1.display();
        sv2.display();
        sv3.display();
        sv4.display();

    }
}
