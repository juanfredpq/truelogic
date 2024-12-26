
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Calculations {


    public Calculations() {

    }

    public double returnScoreAvarageCalculation(String jsonString) {

        ObjectMapper objectMapper = new ObjectMapper();
        double averageScore = 0;
        try {
            // Bind JSON to the StudentList object
            StudentList studentList = objectMapper.readValue(jsonString, StudentList.class);

            // Calculate the average score
            int totalScore = 0;
            int numberOfStudents = studentList.getStudents().size();

            for (Student student : studentList.getStudents()) {
                totalScore += student.getScore();
            }

            averageScore = (double) totalScore / numberOfStudents;


        } catch (IOException e) {
            e.printStackTrace();
        }


        return averageScore;

    }


}
