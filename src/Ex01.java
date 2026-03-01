import java.util.LinkedHashSet;
import java.util.Set;

public class Ex01 {
    public static void main(String[] args) {
        Set<String> patients = new LinkedHashSet<>();

        String[] input = {
                "Nguyễn Văn A – Yên Bái",
                "Trần Thị B – Thái Bình",
                "Nguyễn Văn A – Yên Bái",
                "Lê Văn C – Hưng Yên"
        };

        for (String p : input) {
            patients.add(p);
        }

        System.out.println("Danh sách gọi khám: ");
        for (String p : patients) {
            System.out.println(p);
        }
    }
}
