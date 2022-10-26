package kursDemo.logging;

public class MailLogger implements ILogger{
	public void log(String data) {
		System.out.println("maile loglandı : " + data);
	}
}
