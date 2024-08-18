import java.util.Scanner;
public class Bt4 {
    public static void main(String[] args) {
        System.out.print("Nhập điểm môn Toán: ");
        Scanner t = new Scanner(System.in);
        float toan = t.nextFloat();
        System.out.print("Nhập điểm môn Văn: ");
        float van = t.nextFloat();
        System.out.print("Nhập điểm môn Anh Văn: ");
        float anh = t.nextFloat();
        float tb = (toan + van + anh)/3;
        System.out.printf("Điểm trung bình 3 môn là: %.2f", tb);
    }
}
