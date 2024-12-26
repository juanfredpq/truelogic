
public class Main {
    public static void main(String[] args) {

        String jsonString = """
                {
                  "students": [
                    { "name": "Alice", "score": 95 },
                    { "name": "Bob", "score": 58 },
                    { "name": "Charlie", "score": 72 },
                    { "name": "Daisy", "score": 88 },
                    { "name": "Eve", "score": 40 }
                  ]
                }
                """;

        Calculations calculations = new Calculations();
        double scoreAvarage = calculations.returnScoreAvarageCalculation(jsonString);
        System.out.println(String.format("Total score avarage for our students: %s", scoreAvarage));

    }
}
