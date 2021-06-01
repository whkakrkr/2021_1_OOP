
public class UnderGradStudent implements Student {
	String name;
	int semester = 0;
	double score[][] = new double[8][6];
	double sum[] = new double[8];
	double average[] = new double[8];
	double total =0, total_average =0;
	
	
	public UnderGradStudent(String n) {
		this.name = n;
	}
	
	@Override
	public void showStudentInfo() {
		System.out.println("================================================");
		System.out.println("학부 " + this.semester + "학기 " + this.name);
	}

	@Override
	public void addSemester(int i, double[] s) {
		
		//학기 업데이트
		this.semester++;
		
		//학기 성적 저장
		this.score[i-1] = s;
		
		
		//학기 성적 합 계산
		for(int k=0; k<6; k++) {
			this.sum[i-1] += this.score[i-1][k];
		}
		
		//학기 성적 평균 계산
		this.average[i-1] = this.sum[i-1]/6;
		
		//점수 총합 업데이트
		this.total += this.sum[i-1];
	}

	@Override
	public void showScore() {
		
		// i+1학기 점수와 학기평균 출력
		for(int k=0; k<this.semester; k++) {
			
			System.out.print(k+1 + "학기: ");
			
			//점수 출력
			for(int t=0; t<6; t++) {
				System.out.print(this.score[k][t] + " ");
			}
			
			//학기평균 출력
			System.out.printf("학기 평균 =  %.2f \n", this.average[k]);
		}
	}

	@Override
	public void showTotAvg() {
		//총 평균 계산
		this.total_average = this.total/(this.semester*6);
		
		//총평균 출력
		System.out.printf("총평균 = %.2f \n ", this.total_average);
		System.out.println(" ");	//공백			
	}

	@Override
	public int getSemester() {
		return this.semester;
	}
	
	//학부 학생은 where 값이 0
	@Override
	public int where() {
		return 0;
	}

}
