import java.util.HashMap;
class HashMapsExample {
    public static void main(String[] args) {
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();

        examScores.put("Math", 75);
        examScores.put("Sociology", 85);
        examScores.put("English", 95);
        examScores.put("Bengali", 100);
        examScores.put("Computer Programming", 100);

        examScores.forEach((subject, score) -> {
            examScores.replace(subject, score - 10);
        });

        System.out.println(examScores.toString());
    }
}
