
public class ExceptionParImpar extends Exception{
	private int num;
	
	public ExceptionParImpar() {
		
	}
	
	public ExceptionParImpar(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public String toString() {
		return "o número " + num + " é impar!";
	}
	
	public String getMessage() {
		return "O número é impar!";
	}
}
