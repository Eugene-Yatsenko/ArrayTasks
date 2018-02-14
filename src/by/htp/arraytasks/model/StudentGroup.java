package by.htp.arraytasks.model;



public class StudentGroup {
	//add unlimited number of students
	//print all students 
	private Student[] students;
	private int studentCount;
	int num = 1;
	
	public void printAllStudents(StudentGroup sg) {
		
		System.out.println("============Goup# "+ sg.num + "============");
		for(int i = 0; i < studentCount; i++) {
			System.out.println(students[i].getName());
			System.out.println(students[i].getSurname());
			System.out.println(students[i].getAge());
			System.out.println(students[i].getYear());
			System.out.println("============");
		}
	}
	
	public int getMidAge(StudentGroup sg) {
		int avgAge = 0;
		for(int i = 0; i < sg.studentCount; i++){
			avgAge = avgAge + students[i].age;
		}
		avgAge = (int) avgAge/studentCount;
		return avgAge;
	}
	
	public void addStudent(Student student) {
		if (studentCount == 0) {
			this.students = new Student[15];
			this.students[0] = student;
			
			System.out.println();
			this.studentCount ++;
		} else {
			if(studentCount < 15) {
				students[studentCount] = student;
				this.studentCount ++;
			} else {
				System.out.println("Student is not added, group is full");
			}
			
		}
	}
	
	public void bestYear () {
		int by = 0;
		int byCount = 0;
		for(int i=0; i < this.studentCount; i++) {
			if(studentsInYear(students[i].getYear()) > byCount) {
				by = students[i].getYear();
				byCount = studentsInYear(students[i].getYear());
			}
		}
		
		System.out.println(by);
		System.out.println(byCount);
		
	}

	public int studentsInYear (int year) {
		int count = 0;
		for(int i = 0; i < studentCount; i++){
			if(year == students[i].getYear()) {
				count ++;
			};
		}
		
		return count;
	}
	
	public void swapStudents(int a, int b) {
		Student tmp = new Student();
		tmp = this.students[a];
		this.students[a] = this.students[b];
		this.students[b] = tmp;
	}
	
	public void sortBubbleAsc() {
		
//        int n = arr.length;  
//        int temp = 0;  
//         for(int i=0; i < n; i++){  
//                 for(int j=1; j < (n-i); j++){  
//                          if(arr[j-1] > arr[j]){  
//                                 //swap elements  
//                                 temp = arr[j-1];  
//                                 arr[j-1] = arr[j];  
//                                 arr[j] = temp;  
//                         }  
//                          
//                 }  
//         }  
		
		for(int i= 0; i < this.studentCount; i++) {
				for(int j = 1; j < this.studentCount - i; j++) {
					if (students[j-1].getAge() < students[j].getAge()) {
						swapStudents(j-1, j);							
				}
								
			}
		}
			
		
	}
	
}
