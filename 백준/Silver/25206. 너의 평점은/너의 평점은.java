import java.util.*;

public class Main {

	public static void main(String[] args) {
		String[] major = new String[20];
		double[] credit = new double[20];
		String[] grade = new String[20];
		double score = 0;
		double sumCreditScore = 0;

		double sumCredit = 0;

		double creditScore = 0;

		Scanner scanner = new Scanner(System.in);

		HashMap<String, Double> gradeToPointMap = new HashMap<>();
		gradeToPointMap.put("A+", 4.5);
		gradeToPointMap.put("A0", 4.0);
		gradeToPointMap.put("B+", 3.5);
		gradeToPointMap.put("B0", 3.0);
		gradeToPointMap.put("C+", 2.5);
		gradeToPointMap.put("C0", 2.0);
		gradeToPointMap.put("D+", 1.5);
		gradeToPointMap.put("D0", 1.0);
		gradeToPointMap.put("F", 0.0);

		for (int i = 0; i < 20; i++) {
			major[i] = scanner.next();
			credit[i] = scanner.nextDouble();
			grade[i] = scanner.next();
			
			if (grade[i].equals("P")) {
                continue; ////
            }
			
			score = gradeToPointMap.get(grade[i]);

			creditScore = credit[i] * score;
			sumCreditScore += creditScore;
			sumCredit += credit[i];

		}
		double avg = sumCreditScore / sumCredit;
		System.out.printf("%.6f\n", avg);
	}
}