public class Triangle {
	private int x;
	private int y;
	private int z;

	public Triangle(){		
			System.out.println("Empty Constructor");
	}
	public Triangle(int x, int y, int z){
			System.out.println("Parameterized Constructor");
			this.x = x;
			this.y = y;
			this.z = z;
	}
	public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }	
	public int getX() {
        return x;
    }
	public int getY() {
        return y;
    }
	public int getZ() {
        return z;
    }
	public void showInfo() {
        System.out.println("Triangle Information: ");
        System.out.println("X\t\t: "+x);
        System.out.println("Y\t\t: "+y);
        System.out.println("Z\t\t: "+z);
    }
	
}