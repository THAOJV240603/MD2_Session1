import java.util.Scanner;
public class Bt1 {
    public static void main(String[] args) {
        String name;
        System.out.print("Nhập tên của bạn:");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.print("Xin chào: " + name);
    }
}
