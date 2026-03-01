package Ex06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex06 {
    public static void main(String[] args) {
        List<Patient> patientList = new ArrayList<>();
        patientList.add(new Patient("Lan", 25, "Tim mạch"));
        patientList.add(new Patient("Hùng", 40, "Nội tiết"));
        patientList.add(new Patient("Mai", 30, "Tim mạch"));
        patientList.add(new Patient("Nam", 50, "Nội tiết"));
        patientList.add(new Patient("Linh", 35, "Tim mạch"));

        Map<String, List<Patient>> departmentMap = new HashMap<>();

        for (Patient p : patientList) {
            String dept = p.getDepartment();

            if (!departmentMap.containsKey(dept)) {
                departmentMap.put(dept, new ArrayList<>());
            }
            departmentMap.get(dept).add(p);
        }

        System.out.println("Danh sách bệnh nhân theo khoa");
        for (Map.Entry<String, List<Patient>> entry : departmentMap.entrySet()) {
            System.out.println("Khoa: " + entry.getKey());
            for (Patient p : entry.getValue()) {
                System.out.println(" - " + p);
            }
        }
        String searchDept = "Tim mạch";
        System.out.println("\n=== DANH SÁCH KHOA " + searchDept + " ===");

        if (departmentMap.containsKey(searchDept)) {
            for (Patient p : departmentMap.get(searchDept)) {
                System.out.println(p);
            }
        } else {
            System.out.println("Không tìm thấy khoa.");
        }

        // Tìm khoa đông nhất
        String maxDept = "";
        int maxCount = 0;

        for (Map.Entry<String, List<Patient>> entry : departmentMap.entrySet()) {
            int size = entry.getValue().size();
            if (size > maxCount) {
                maxCount = size;
                maxDept = entry.getKey();
            }
        }

        System.out.println("\n=== PHÂN TÍCH ===");
        System.out.println("Khoa " + maxDept + " đang đông nhất (" + maxCount + " bệnh nhân).");
    }
}
