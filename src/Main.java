import java.util.ArrayList;
import java.util.Arrays;

public class Main {

//		EXERCISE 31	& 32		//
	public static void main(String[] args) {
		Account myAccount = new Account("Madisonne", 100);
		myAccount.deposit(20);
		System.out.println(myAccount);

		Account MattsAccount = new Account("Matt's Account", 1000);
		Account myAccount2 = new Account("My Account", 0);
		MattsAccount.withdrawal(100);
		myAccount2.deposit(100);
		System.out.println(MattsAccount);
		System.out.println(myAccount2);

	}
}
//    	Exercise 30a //
//	Person selection1 = new Person();
//	selection1.setWeight(120);
//	selection1.setHeight(5);
//
//	Person selection2 = new Person();
//	selection2.setWeight(140);
//	selection2.setHeight(5);
//
//	Person selection3 = new Person();
//	selection3.setWeight(130);
//	selection3.setHeight(5);
//
//	System.out.println(selection1.bodyMassIndex());
//	System.out.println(selection2.bodyMassIndex());
//	System.out.println(selection3.bodyMassIndex());
////		Exercise 30b //
//	ArrayList<Person> personsArray = new ArrayList<Person>();
//	personsArray.addAll(Arrays.asList(selection1, selection2, selection3));
////		Exercise 30c //
//		selection2.printPerson();
//    }

