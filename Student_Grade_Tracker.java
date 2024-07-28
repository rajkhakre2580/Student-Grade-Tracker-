package pack1;
import java.util.ArrayList;
import java.util.Scanner;

public class Student_Grade_Tracker 
{
	    public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);
	        ArrayList<Integer> grades = new ArrayList<>();

	        // Input student grades
	        while (true) {
	            System.out.print("Enter a student's grade (-1 to stop): ");
	            int grade = scanner.nextInt();
	            if (grade == -1) {
	                break;
	            }
	            grades.add(grade);
	        }

	        // Calculate and display results
	        if (!grades.isEmpty()) {
	            int highest = findHighest(grades);
	            int lowest = findLowest(grades);
	            double average = calculateAverage(grades);
	            System.out.println("Highest score: " + highest);
	            System.out.println("Lowest score: " + lowest);
	            System.out.println("Average score: " + average);
	        } else {
	            System.out.println("No grades entered.");
	        }
	    }

	    private static int findHighest(ArrayList<Integer> grades) {
	        int highest = Integer.MIN_VALUE;
	        for (int grade : grades) {
	            if (grade > highest) {
	                highest = grade;
	            }
	        }
	        return highest;
	    }

	    private static int findLowest(ArrayList<Integer> grades) {
	        int lowest = Integer.MAX_VALUE;
	        for (int grade : grades) {
	            if (grade < lowest) {
	                lowest = grade;
	            }
	        }
	        return lowest;
	    }

	    private static double calculateAverage(ArrayList<Integer> grades) {
	        double sum = 0;
	        for (int grade : grades) {
	            sum += grade;
	        }
	        return sum / grades.size();
	    }
	}