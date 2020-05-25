package home.myprojects;

import java.util.*;
import java.io.*;

public class Manager extends Employee{

	// protected void setFirstName(){
	// 	System.out.println("Enter the First Name of the Manager");
	// 	FirstName = input.nextLine();
	// }

	// protected void setLastName() {
	// 	System.out.println("Enter the Last Name of the Manager");
	// 	LastName = input.nextLine();
	// }

	// protected void setManager() {
	// }

	// protected void setOrg() {
	// 	System.out.println("Enter the Organization of the Manager");
	// 	Org = input.nextLine();
	// }

	// protected void setAge() {
	// 	System.out.println("Enter the Age of the Manager");
	// 	Age = input.nextInt();
	// }

	// // protected void setEmpId() { 
	// // 	System.out.println("Enter the Employee ID of the Manager");
	// // 	EmpId = input.nextInt();
	// // }

	// protected void setLevel() {
	// 	System.out.println("Enter the Level of the Manager");
	// 	Level =input.nextInt();
	// }

	private static ArrayList<Manager> createManagerList(ArrayList<Employee> emp){
		ArrayList<Manager> managers = new ArrayList<>();
		ArrayList<String> manager_list = new ArrayList<>();

		try{
			for(Employee empl: emp){
					String managerDetails = empl.getManager();
					if(!manager_list.contains(managerDetails)){
						manager_list.add(managerDetails);
					}
				}

				for (Employee empl: emp) {
					if(manager_list.contains(empl.getFirstName())){
						String[] Record = {empl.getFirstName(), empl.getLastName(), empl.getAge(), empl.getLevel(), empl.getManager(), empl.getOrg()};
						Manager mng = createManager(Record);
						managers.add(mng);
					}
				}
			} catch (IOException e) {
					e.printStackTrace();
				} 

				return managers;
	}

	private static Manager createManager (String[] managerRecord){
		String FirstName = managerRecord[0];
		String LastName = managerRecord[1];
		int Age = Integer.parseInt(managerRecord[2]);
		int Level = Integer.parseInt(managerRecord[3]);
		String Manager = managerRecord[4];
		String Org = managerRecord[5];
		

		return new Manager(FirstName, LastName, Manager, Org, Age, Level);
	}

}