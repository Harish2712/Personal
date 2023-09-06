package week3assignment;

public class Automation extends MultipleLangauge implements TestTool,Language{

	public static void main(String[] args) {
		
		Automation a = new Automation();
		a.Java();
		a.Selenium();
		a.ruby();
		a.python();
	}
	
	@Override
	public void Java() {
		System.out.println("Language is Java");
	}

	@Override
	public void Selenium() {
		System.out.println("Tool used is Selenium");
	}

	@Override
	public void ruby() {
		System.out.println("Language is ruby");		
	}
}
