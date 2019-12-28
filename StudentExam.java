package testjava;

public class StudentExam extends Library{
      
		private  int sub1;
        private int sub2;
        
        public StudentExam(int regno, String stdname, String group, int BooksDue,int sub1, int sub2) {
    		super(regno, stdname, group,BooksDue);
    		this.sub1 = sub1;
    		this.sub2 = sub2;
        }
        public void output()
        {
        	int total = (sub1+sub2);
        	System.out.println("total = "+ total );
        	System.out.println("No.of Books Due :"+ BooksDue);
        }
        public void display()
        {
        	System.out.println("THIS IS FROM SUBCLASS");
        }
 
	public static void main(String[] args) {
		
		StudentExam exam = new StudentExam(123,"harshu","ece",3,78,90);
		Student student = new Student(134,"jfhh","ghy");
		Student stu = new Student();
		stu.display();
		student.display();
		student = exam;
		student.display();
		exam.display();
	    exam.output();

	}

}
