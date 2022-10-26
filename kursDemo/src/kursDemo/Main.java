package kursDemo;

import java.io.File;

import kursDemo.business.CategoryManager;
import kursDemo.business.CourseManager;
import kursDemo.business.InstructorManager;
import kursDemo.dataAccess.CategoryDao.CategoryHibernateDao;
import kursDemo.dataAccess.CategoryDao.CategoryJdbcDao;
import kursDemo.dataAccess.CourseDao.CourseHibernateDao;
import kursDemo.dataAccess.CourseDao.CourseJdbcDao;
import kursDemo.dataAccess.InstructorDao.InstructorHibernateDao;
import kursDemo.entities.Category;
import kursDemo.entities.Course;
import kursDemo.entities.Instructor;
import kursDemo.logging.DatabaseLogger;
import kursDemo.logging.FileLogger;
import kursDemo.logging.ILogger;
import kursDemo.logging.MailLogger;

public class Main {
	public static void main(String[] args) throws Exception {
		Course course1 = new Course(1, "Java Yazılım Geliştirme Kampı", 500);
		Course course2 = new Course(2, "SQL Yazılım Geliştirme Kampı", 40);
		Course course3 = new Course(3, "Python Yazılım Geliştirme Kampı", 600);
		Course course4 = new Course(4, "C# Yazılım Geliştirme Kampı", 200);
		ILogger[] loggers = { new FileLogger(), new DatabaseLogger(), new MailLogger() };
		CourseManager courseManager = new CourseManager(new CourseHibernateDao(), loggers);
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		courseManager.add(course4);
		System.out.println("----------------------------------------------------");
		Category category1 = new Category(1,"Programlama");
		Category category2 = new Category(2,"Tümü");
		CategoryManager categoryManager = new CategoryManager(new CategoryHibernateDao(),loggers);
		categoryManager.add(category1);
		CategoryManager categoryManager2 = new CategoryManager(new CategoryJdbcDao(),loggers);
		categoryManager2.add(category2);
		System.out.println("----------------------------------------------------");
		Instructor instructor1 = new Instructor("Engin","Demiroğ");
		InstructorManager instructorManager1 = new InstructorManager(new InstructorHibernateDao(),loggers);
		instructorManager1.add(instructor1);
		System.out.println("----------------------------------------------------");

		
	}

}
