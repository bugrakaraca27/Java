package kursDemo.logging;

public class FileLogger implements ILogger{
	public void log(String data) {
		System.out.println("dosyaya loglandı : " + data);
		
	}
 
}
