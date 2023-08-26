class FirstClass { 
	int idNo;
	idNo = 555;
		public static void print(  ) { 
			System.out.println ( " First Class citizen"  + idNo );  
		}
	}

	class SecondClass { 
	int idNo;
		idNo = 111;
		public static void print(  ) {
			System.out.println ( " Second Class citizen " + idNo) ;
		}
	}
	public class PeopleApp {
	FirstClass female;
	SecondClass male;
		public static void main( String args[ ] ) {
			System.out.print("People from Java World");
			female.print( );
			male.print( );
		}
	}