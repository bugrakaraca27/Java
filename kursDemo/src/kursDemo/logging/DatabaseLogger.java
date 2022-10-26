package kursDemo.logging;

public class DatabaseLogger implements ILogger{
	public void log(String data) {
		System.out.println("veritabanına loglandı : " + data);
		
	}
	
}
