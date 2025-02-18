import java.util.Scanner;

public class GiaTriTrungBinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int COUNT = 5;
		int numb1;
		int numb2;
		int numb3;
		int numb4;
		int numb5;
		float average;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Vui long nhap so thu nhat: ");
		numb1 = Integer.parseInt(scan.nextLine());
		
		System.out.print("Vui long nhap so thu hai: ");
		numb2 = Integer.parseInt(scan.nextLine());
		
		System.out.print("Vui long nhap so thu ba: ");
		numb3 = Integer.parseInt(scan.nextLine());
		
		System.out.print("Vui long nhap so thu tu: ");
		numb4 = Integer.parseInt(scan.nextLine());
		
		System.out.print("Vui long nhap so thu nam: ");
		numb5 = Integer.parseInt(scan.nextLine());
		
		average = ((1.0f) *(numb1 + numb2 + numb3 + numb4 + numb5)) / COUNT;
		
		System.out.println("Trung binh cua nam so nhap la: " + average);
		
		//sample data: 3,2,4,3,1 average: 2.6
	}

}
