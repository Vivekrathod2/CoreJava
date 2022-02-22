package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Student 
{	
		int id;
		String name;
		public Student(int id, String name)
		{
			this.id =id;
			this.name=name;
		}
		public String toString()
		{
			return "Student [id=" +id+", name=" +name+"]";
		}

		public static void main(String[] args) 
		{
			Student st1 = new Student(10, "vivek");
			Student st2 = new Student(20,"arpit");
			Student st3 = new Student(30,"abcj");
			ArrayList al = new ArrayList();
			al.add(st1);
			al.add(st2);
			al.add(st3);
			for(int i=0; i<al.size(); i++)
			{
				System.out.println(al.get(i));
			}

			System.out.println(al);

		}
	}

