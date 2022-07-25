class Student{
	int id_no,no_of_students_registered,subject_code[]= new int[5];
	float subject_credits[]= new float[5],grade_obtained[]= new float[5],spi[]= new float[5];
	Student(int id_no){
		this.id_no=id_no;
		for (int i=0;i<5 ;i++ ) {
			
		}
		this.subject_code=subject_code;
		this.subject_credits=subject_credits;
		this.grade_obtained=grade_obtained;
		this.spi=spi;
	}
	float void spi(){
		int spi;
		spi=grade_obtained*subject_credits/100;
	}
}