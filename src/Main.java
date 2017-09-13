import java.util.*;
import java.lang.*;
public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
                Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Date e = new Date();

		Student[] stu = new Student[5];
                StudentGroup sgroup=new StudentGroup(5);
                stu[0]=new Student(20,"abc",e,1.2);
		stu[1]=new Student(30,"def",e,2.2);
		stu[2]=new Student(40,"ghi",e,3.2);
		stu[3]=new Student(50,"jkl",e,4.2);
                sgroup.setStudents(stu);
		
	}
}
