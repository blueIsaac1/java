import java.util.Scanner;
public class Student {
    private int studentID;
    private String name;
    private String email;
    private double altura;
    public final int SHCODE =  34958; // constante
    public Student(int x, String y, String z, double w){
        studentID = x;
        name = y;
        email = z;
        altura = w;
    }
    // Student ID
    public int GetstudentID() {
        return studentID;
    }
    public void SetstudentID(int x) {
        studentID = x;
    }

    //
    public String Getname() {
        return name;
    }
    public void Setname(String x) {
        name = x;
    }

    // Email
    public String Getemail() {
        return email;
    }
    public void Setemail(String x) {
        email = x;
    }

    //
    public double Getaltura() {
        return altura;
    }
    public void Setaltura(double x) {   // void = não retorna nada
        altura = x;
    }
    public String ToString() {
        String s1 = "";
        s1 = "Student ID: " + GetstudentID() + "\n"
        + "Name: " + Getname() + "\n"
        + "Email: " + Getemail() + "\n"
        + "Altura: " + Getaltura();
        return s1;
    }
};
