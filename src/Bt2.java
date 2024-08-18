import java.util.Scanner;
public class Bt2 {
    public static void main(String[] args) {
        int tygia = 25000;
        int usd;
        System.out.print("Nhập số tiền muốn đổi: ");
        Scanner money = new Scanner(System.in);
        usd = money.nextInt();
        int doitien = usd * tygia;
        System.out.println(usd + " usd = "  + doitien + "vnd");

    }
}
