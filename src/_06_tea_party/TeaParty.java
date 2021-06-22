package _06_tea_party;

public class TeaParty {
	  public String welcome(String name, boolean isWoman, boolean isKnighted) {
	        String greeting = "Hello ";
		  if(isWoman == true && isKnighted == true) {
			   greeting += "Lady ";
		  } else if(isWoman == true && isKnighted == false) {
			  greeting += "Ms. ";
		  } else if(isWoman == false && isKnighted == true) {
			  greeting += "Sir ";
		  } else if(isWoman == false && isKnighted == false) {
			  greeting += "Mr. ";
		  }
		  greeting += name;
		  return greeting;
	    }
}
