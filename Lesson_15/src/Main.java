import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException  {
		
		
		try (FileOutputStream fileOutputStream= new FileOutputStream("output.txt");
				ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream)){
				Human human = new Human("anton",12,1);
				Human human2= new Human("valera",23 ,2 );
				Human human3 = new Human("vova", 40, 3);
				Human human4 = new Human("tolik", 21, 5);
				List<Human>list = new ArrayList<Human>();
				list.add(human);
				list.add(human2);
				list.add(human3);
				list.add(human4);
				objectOutputStream.writeObject(list);
		
		/*objectOutputStream.writeObject(human);
		objectOutputStream.writeObject(human2);
		objectOutputStream.writeObject(human3);
		objectOutputStream.writeObject(human4);
				*/
				
		}
	/*	
		FileInputStream fileInputStream = new FileInputStream("output.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		List<Human>humans =(List<Human>)objectInputStream.readObject();
		for (Human human : humans) {
			System.out.println(human);
		}
		*/
		Users users = new Users("anton", 23, 1, 2, "pavliv");
		Users users2 = new Users("valera", 23, 2, 1,"tymoshenko");
		Users users3 = new Users("vova", 40, 3,3,"parhomenko");
		Users users4 = new Users("tolik", 21, 5, 4,"demchyk");
		Users users5= new Users("max", 24, 6, 5, "goyanuk");
		List<Users>list = new ArrayList<Users>();
		list.add(users);
		list.add(users2);
		list.add(users3);
		list.add(users4);
		list.add(users5);
		FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(list);
		
		FileInputStream fileInputStream = new FileInputStream("output.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		
	
		
	}

}
