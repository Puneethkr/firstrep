package implementation;

import java.util.Scanner;

import mobiles.Apple;
import mobiles.Specification;

public class Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("Enter name of mobile : ");
        Scanner sc= new Scanner (System.in);
		String str= sc.next();
		
	Spec spec=new Spec();
	Specification spe=	spec.spec(str);
		spe.spec();
	}

}
