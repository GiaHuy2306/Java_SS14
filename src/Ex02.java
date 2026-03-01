import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Map<String, String> medicines = new HashMap<>();

        medicines.put("T01", "Paracetamol");
        medicines.put("T02", "Ibuprofen");
        medicines.put("T03", "Amoxicillin");
        medicines.put("T04", "Vitamin C");
        medicines.put("T05", "Aspirin");

        Scanner input = new Scanner(System.in);

        System.out.print("Nhập mã thuốc: ");
        String code = input.nextLine();

        if (medicines.containsKey(code)) {
            System.out.println("Tên thuốc: " +medicines.get(code));
        }else {
            System.out.println("Thuốc không tồn tại");
        }
    }
}
