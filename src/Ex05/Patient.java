package Ex05;

public class Patient {
    String name;
    int severity;
    int arrivalTime;

    public Patient(String name, int severity, int arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return "Bệnh nhân " +name + "( " + severity + " đến lúc " +arrivalTime + ") ";
    }
}
