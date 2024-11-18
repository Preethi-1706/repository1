import java.util.Scanner;
class Student
{
	String studName;
	String studUSN;
	int studAge;
	float studCGPA;
	String studbranchName;
	Student (String name,float CGPA)
	{
		studName=name;
		studCGPA=CGPA;
	}
void display()
{
	System.out.println("the name of a student is " + studName);
	System.out.println("the CGPA of a student is " + studCGPA);
	System.out.println(" ");
}
class DemoStudent
{
public static void main (String args[])
{
	Scanner.scan=new Scanner (System.in);
	System.out.println("enter the number of student");
	int n=Scan.nextInt();
	
	Student[] arr =new Student[n];
	System.out.println("enter the details of the student");
	
	
	for(int i=0;i<n;i++)
	{
	System.out.println("enter the name of the student");
	System.out.println("enter the CGPA of the student");
