import java.util.Scanner;
public class Bt5 {
    public static void main(String[] args) {
        float PI = 3.14f;
        System.out.print("Nhập bán kính:");
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float dientich = PI * x * x;
        float chuvi = 2 * PI * x;
        System.out.printf("Diện tích đường tròn là: %.2f \n", dientich);
        System.out.printf("Chu vi đường tròn là: %.2f", chuvi);
    }
}
