import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Ex04 {
    public static void main(String[] args) {
        List<String> diseaseList = new ArrayList<>();
        diseaseList.add("Cúm A");
        diseaseList.add("Sốt xuất huyết");
        diseaseList.add("Cúm A");
        diseaseList.add("Covid-19");
        diseaseList.add("Cúm A");
        diseaseList.add("Sốt xuất huyết");

        Map<String, Integer> report = new TreeMap<>();

        for (String disease: diseaseList) {
            if (report.containsKey(disease)) {
                report.put(disease, report.get(disease) + 1);
            }else {
                report.put(disease, 1);
            }
        }

        System.out.println("Báo cáo thống kê: ");
        for (Map.Entry<String, Integer> entry: report.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ca");
        }
    }
}
