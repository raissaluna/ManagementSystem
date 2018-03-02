import java.util.*;

public class Driver {

	public static void main(String[] args) {

		//ArrayList<User> list1 = new ArrayList<User>();
		
		/*User u1 = new User();
		
		System.out.println("Digit the name of the user: ");
		
		Scanner read = new Scanner(System.in);
		
		u1.setName(read.nextLine());
		
		//System.out.println(u1.nome);
		
		list1.add(u1);
		
		System.out.println(list1.get(0).getName());*/
		
		boolean flag = true;
		
		Scanner read = new Scanner(System.in);
		
		
	
		int option;
		
		while(flag) {
			//System.out.println("Entrei no while, flag: "+flag);
			System.out.println("Welcome!\n1 - Sign Up\n2 - Login\n3 - Print Information\n0 - Quit");
		
			option = Integer.parseInt(read.nextLine());
			
			//System.out.println("Option: "+ option);
			
			switch(option) {
				
				case 1:
					System.out.println("Enter your username: ");
					User u1 = new User();
					u1.setUsername(read.nextLine());
					
					System.out.println("Enter your name: ");
					u1.setName(read.nextLine());
					
					System.out.println("Enter your type of user:\n1 - Graduation Student\n2 - Mastering Student\n3 - PhD Student");
					System.out.println("4 - Teacher\n5 - Researcher\n6 - Administrator");
					//u1.setType(read.nextLine());
					int option_type;
					
					option_type = Integer.parseInt(read.nextLine());
					
					switch(option_type){
						case 1:
							u1.setType("Graduation Student");
							break;
							
						case 2:
							u1.setType("Mastering Student");
							break;
							
						case 3:
							u1.setType("PhD Student");
							break;
							
						case 4:
							u1.setType("Teacher");
							break;
					
						case 5:
							u1.setType("Researcher");
							break;

						case 6:
							u1.setType("Administrator");
							break;
					}
					
					System.out.println("Enter your email: ");
					u1.setEmail(read.nextLine());
					
					System.out.println("Enter your password: ");
					u1.setPassword(read.nextLine());
					
					System.out.println("Please check your informations:");
					System.out.println("Name: "+u1.getName());
					System.out.println("Type of user: "+u1.getType());
					System.out.println("Username: "+u1.getUsername());
					System.out.println("Email: "+u1.getEmail());
					//System.out.println(flag);
					break;
			
				case 2:
					//System.out.println("Entrei no case 2");

					//System.out.println(flag);
					break;
					
				case 0:
					flag = false;
					break;
			
			}
		}
		
		read.close();
		
	}

}