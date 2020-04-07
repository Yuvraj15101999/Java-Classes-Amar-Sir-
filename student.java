import java.util.Scanner;
import java.io.*;
 class student_data{

  private String name; private float percentage; private int roll_no=0; private int count=0;
  
    //Method 1: Using Method 
  /*public void set_data(String name,float percentage){
    this.name=name; this.percentage=percentage; roll_no++; count++;}*/
    
  // Method 2 : Constructor for loading values 
  student_data(String name,float percentage){
  this.name=name;this.percentage=percentage;roll_no++;count++; }
  
  public float get_percentage(){
    return percentage;}
    
  public String toString(){
   return "The name of the student is: "+name+"\n"+"roll no: "+roll_no+"\n"+"the percentage is: "+percentage+;}


class student{
  public static void main(String args[]) throws Exception {
    //Using Scanner To input Values from user
    /*Scanner s =new Scanner(System.in);
    System.out.println("Please enter the number of student's data has to be inserted");
    int n=s.nextInt(); //Number of students
    student_data a []=new student_data[n];

    //Loop to input value in the array of objects
    for(int i =0;i<a.length();i++){
    student_data a[i] = new student_data(s.next,s.nextFloat);
    }
    
    //Bubble Sort
    for(int i =0;i<n-1;i++){
    for(int j=0;j<n-i-1;j++){
    float temp=0f;
    if (a[j].get_percentage<a[j+1].get_percentage){
    temp =a[j].get_percentage;
    a[j].get_percentage=a[j+1].get_percentage;
    a[j+1].get_percentage=temp;}}}

    for(int i =0;i<n;i++){
    a[i].get_student_data();}
    */
    
    //Using BufferedReader to input values from user
   BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
   student_data s = new student_data();
    List<student_data> stu= new Arraylist<student_data>();
    stu.add(s(reader.readline(),reader.read()));
    stu.add(s(reader.readline(),reader.read()));
    stu.add(s(reader.readline(),reader.read()));
    
  }
}
