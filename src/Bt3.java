import java.util.Scanner;
public class Bt3 {
    public static void main(String[] args) {
        System.out.println("Nhập độ dài cạnh");
        Scanner canh = new Scanner(System.in);
        float a = canh.nextFloat();
        float chuvi = a * 4;
        float dientich = a * a;
        System.out.printf("Chu vi của hình  vuông là: %.2f\n", chuvi);
        System.out.printf("Diện tích của hình vuông là: %.2f", dientich);
    }
}
