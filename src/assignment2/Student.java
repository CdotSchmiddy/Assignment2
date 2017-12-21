package assignment2;

/**
 *
 * @author Calum
 */
public class Student {
        //Class Variables
	private int grades[] = new int[5];
	private String name;
        
	//A constructor that recieves the name and grades
	public Student(String name, int g1, int g2, int g3, int g4, int g5)
        {
            
                //Set the name
		this.name = name;
                
		//Add each grade to array
		grades[0] = g1;
		grades[1] = g2;
		grades[2] = g3;
		grades[3] = g4;
		grades[4] = g5;
		
	}
        
	//Get student grades
	public int[] getGrades()
        {
            return this.grades;
	}
	//Get student name
	public String getName()
        {
            return this.name;
        }
	
        //Print student name and grades
        @Override
	public String toString()
        {
		return this.name + "         " 
				+ this.grades[0] + "          " 
				+ this.grades[1] + "           " 
				+ this.grades[2] + "           " 
				+ this.grades[3] + "           " 
				+ this.grades[4] ;
	}
	
}
