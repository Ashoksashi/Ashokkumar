package org.system;

public class Desktop extends Computer{
	
	private void desktopSize() {
		// TODO Auto-generated method stub
		System.out.println("desktop Size 1tb");
	}
	public static void main(String[] args) {
		
		Desktop obj = new Desktop();
		
		obj.computerModel();
		obj.desktopSize();
		
	}

}
