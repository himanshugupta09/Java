// Simple Inheritance Example//

class Point2D{
		int x;
		int y;
		
		void display(){
			System.out.println("x = "+x+"y = "+y);
		}
}


// Child Class

class Point3D extends Point2D{
		int z;
		
		void display(){
			System.out.println("x = "+x+"y = "+y+"z = "+z);
		}
}

class simpleSingleInheritance{
		public static void main(String args[]){
		
			Point2D P1 = new Point2D();
			Point3D P2 = new Point3D();

			P1.x = 10;
			P1.y = 20;

			System.out.println("Point 2d P1 is\n");
		     P1.display();

			P2.x = 5;
			P2.y = 6;
			P2.z = 8;
			
			System.out.println("Point 3D P2 is \n");
			P2.display();
		}
}
