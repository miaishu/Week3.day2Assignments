package week3.day2assignments;

public class Automation extends MultipleLanguages implements Language,TestTool{
	
	public void Selenium() {
		System.out.println("Learnt Selenium");
		
	}

	public void Java() {
		System.out.println("Learnt Java");
	}

	@Override
	public void ruby() {
		System.out.println("Learnt Ruby");
		
	} 
	
	public void python()
	{
		System.out.println("Language not Learnt-Python");
	}
	
	public static void main(String[] args) {
		
		 Automation result = new Automation();
		 result.Selenium();
		 result.Java();
		 result.ruby();
		 result.python();
		
	}

	//Implement all the methods of interface and abstract class in Automation class


}