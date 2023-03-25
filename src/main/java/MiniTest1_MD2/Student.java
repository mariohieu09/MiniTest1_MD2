package MiniTest1_MD2;

public class Student {
    int id;
    int age;
    String clss;
    String name;

    void setter(int id, int age, String clss, String name){
        this.id = id;
        this.age = age;
        this.clss = clss;
        this.name = name;
    }
    void getter(){
        System.out.println(id + " " + name + " " + age + " " + clss);
    }

    public static void main(String[] args) {
        Student Hieu = new Student();
        Student Dung = new Student();
        Student Hai = new Student();
        Hieu.setter(1, 22, "C0223G1", "Hieu" );
        Dung.setter(2,25, "C0223G1",  "Dung");
        Hai.setter(3,23, "C0223G1", "Hai");

        Hieu.getter();
        Dung.getter();
        Hai.getter();
    }
}
