package AnnotationAssignment;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface info{
	int ID();
	String Name();
	String Date();
	String Time();
	float Version();
}

@info(ID=0, Name = "Atharva", Date = "16/02/2022", Time = "09:47", Version = 5.8f)
class use_custom{
	int ID;
	String Name;
	String Date;
	String Time;
	float Version;
	public use_custom(int i, String name, String date, String time, float d) {
		super();
		ID = i;
		Name = name;
		Date = date;
		Time = time;
		Version = d;
	}
	public String toString() {
		return "AuthorID:"+ID+" Author:"+Name+" Date:"+Date+" Time:"+Time+" Version:"+Version;
	}
}
public class CustomAnnotation {

	public static void main(String[] args) {
		use_custom dep = new use_custom(101,"Atharva", "16/02/2022", "09:47", 5.8f);
		System.out.println(dep.toString());

	}

}
