package implementation;

import mobiles.Apple;
import mobiles.Nokia;
import mobiles.Samsung;
import mobiles.Specification;

public class Spec {

	public Specification spec( String s) {
		
		if(s.equalsIgnoreCase("Apple"))
			return new Apple();
		
		else if(s.equalsIgnoreCase("Nokia"))
			return new Nokia();
		
		else if(s.equalsIgnoreCase("samsung"))
			return new Samsung();
		
		else
			return null;
		
	}
}
