package assignment2;

import java.util.ArrayList;

/**
 *
 * @author Calum
 */
public class Assignment2 {
    public static void main(String[] args)
    {
		//1. Populate the data structure with information for 5 students, each with 5 grades
        
		//An Array list to store Students.
		ArrayList <Student> students = new ArrayList<>();
                
                //Adding Students to the Array list.
		students.add(new Student("Hardy Harr", 88, 76, 66, 87, 92));
		students.add(new Student("Bear Trapp", 55, 92, 88, 85, 78));
		students.add(new Student("Jim Shorts", 66, 77, 88, 99, 55));
		students.add(new Student("Brock Lees", 23, 45, 33, 45, 91));
		students.add(new Student("Anita Bath", 23, 25, 33, 45, 66));	
		
		//Print chart header info.
		System.out.println("Student         Course 1    Course 2     Course 3     Course 4     Course 5");
                
                //2. There should be a method that will display a chart with all of the students and their grades (see example below).
                
		//Print the data for each Student.
                for (int i = 0; i < students.size(); i++)
                {
			System.out.println(students.get(i).toString());
		}
                
                //Method to display highest average is being called.
		displayHighestAverage(students);
                
                //Method to display every student below 50% average is being called.
		displayLowestAverage(students);
		
	}
    
        //3. There should be a method that establishes the student with the highest overall average.
	/**
         * This method reads the "students" ArrayList and prints to output
         * which student (out of all of them) has the highest grade.
         * @param students 
         */
	public static void displayHighestAverage(ArrayList <Student> students)
        {
            
		//Variables to store the name and average.
		String name = "";
		double avg = 0;
                
		//Loops through ALL the students in Students array list.
		for (int i = 0; i < students.size(); i++)
                {
                    
                        //Create variable to store students grades.
			int grades[] = students.get(i).getGrades();
                        
			//Recieve average using the getAverage method.
			double average = getAverage(grades);
                        
			//If the average is higher than the current highest average, 
                        //set name to current student and set avg variable to average.
			if(average > avg)
                        {
                            name = students.get(i).getName();
                            avg = average;
				
			}
			
		}
                
		//Print name and total average of student with the HIGHEST average.
		System.out.printf("%nThe student with the highest average (%.1f%%) is %s. %n", avg, name);
		
	}
        
        /**
         * This method reads an array of integers, calculates the average
         * and returns the calculated average as a double.
         * @param grades
         * @return 
         */
	public static double getAverage(int[] grades)
        {
            
		//Calculates average from all 5 grades and returns as a double.
		return ((double)(grades[0] + grades[1] + grades[2] + grades[3] + grades[4])/5);
		
	}
        
        //4. There should be a method that will display all of the students that have an overall average mark below 50%
        /**
         * This method reads the "students" ArrayList and
         * prints to output the students and average of
         * those with an average of below 50%.
         * @param students 
         */
	public static void displayLowestAverage(ArrayList <Student> students)
        {
            
                //Loops through ALL the students in Students array list.
		for (int i = 0; i < students.size(); i++)
                {
                        
                        //Create variable to store students grades.
			int grades[] = students.get(i).getGrades();
                        
			//Recieve average using the getAverage method.
			double average = getAverage(grades);
                        
			//If the average is below 50% for the current student, 
                        //print name and total average of each student.
			if(average < 50)
                        {
				System.out.printf("We are concerned with %s who has an average of %.1f%%. %n", students.get(i).getName(), average);
			}
			
		}
        }
}