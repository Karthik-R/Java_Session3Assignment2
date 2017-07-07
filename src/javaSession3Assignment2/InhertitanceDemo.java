package javaSession3Assignment2;

class Super {
	int length;
	int breadth;

	Super(int x, int y) {
		this.length = x;
		this.breadth = y;
	}

	int area() {
		return (length * breadth);
	}

}

class Sub extends Super { // Inheriting Super

	int height;

	Sub(int x, int y, int z) {
		super(x, y); //Passing the values to superclass
		this.height = z;
	}

	int volume() {
		return (length * breadth * height);
	}

}

public class InhertitanceDemo {

	public static void main(String[] args) {

		Sub obj = new Sub(36, 12, 18);
		int area1 = obj.area(); //calling superclass method
		int volume1 = obj.volume(); // calling subclass method
		System.out.println("Calculated Area: " + area1);
		System.out.println("Calculated Volume: " + volume1);
	}

}
