
public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score=91;
		String grade;
		if(score >90)
		{
			grade="A";
		}
		else if(score<80)
		{
			grade="B";
		}
		else{
			grade="C";
		}
		
		System.out.println("score" + score);
		System.out.println("grade" + grade);
		
	}

}
