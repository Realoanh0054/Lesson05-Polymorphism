package advance.dev;
import java.util.Scanner;
import advance.dev.models.Person;
import advance.dev.models.Student;
import advance.dev.models.Teacher;
public class MainApp {
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Person arr[] = new Person[5];
    System.out.println("Nhap vao 2 giao vien");
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 2; i++) {
      System.out.println("Nhap giao vien thu " + (i + 1));
      System.out.println("Nhap ten");
      String name = sc.nextLine();
      System.out.println("Nhap tuoi ");
      int old = sc.nextInt();
      sc.nextLine();
      arr[i] = new Teacher(name, old);
    }
    //nhap vao 3 sinh vien
    System.out.println("Nhap vao 3 sinh vien");
    for (int i = 0; i < 3; i++) {
      System.out.println("Nhap vao sinh vien thu " + (i + 1));
      System.out.println("Nhap ten");
      String name = sc.nextLine();
      System.out.println("Nhap tuoi");
      int old = sc.nextInt();
      sc.nextLine();
      arr[i] = new Student(name, old);
    }
    print(arr);
  }
  static void print(Person arr[]) {
    for (Person person: arr) {
      System.out.println(person);
    }
  }
}