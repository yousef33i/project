import javax.swing.*;
public class lec26 {
public static  double yousef(double total) {	   
	double vat=total*0.15;
	return vat;
}
	public static void main(String[] args) {
		int x ;
		double dec=0, n=0 ,total=0, sumprice;
		sumprice=total+yousef(total);
		
		int Branch=Integer.parseInt(JOptionPane.showInputDialog("���� ��� �����"));
		int receipt=Integer.parseInt(JOptionPane.showInputDialog("���� ��� ��������"));
		x=Integer.parseInt(JOptionPane.showInputDialog("�� ��� ��������"));
		String Products[] = new String[x];
		double price1[]=new double[x];
		for(int i=0;i<x;i++) {

			Products[i]=JOptionPane.showInputDialog("���� ��� ������" );
			price1[i]=Integer.parseInt(JOptionPane.showInputDialog("��� ������"));
	         total+=price1[i];		

		}
	switch (Branch) {
	case 1:
		if(total>100) {
			dec+=total/10;
			System.out.println("��� ����� 1");
		}
			
		break;
	case 2:
		dec+=yousef(total);
		System.out.println("��� ����� 2");
		break;
	case 3:
		if(total>500) {
			dec+=50;
			System.out.println("��� ����� 3");
		}
			
		break;
		
		default:
			if(Branch>3)
			 System.out.println("������ ���");

	}
	for(int i=0;i<x;i++) {
		 System.out.println("��� ��������: "   + receipt );
		System.out.println("��� ������: "+Products[i] +"\n" + "����� : "  + price1[i]);	
	}
	 System.out.println("������ ���� �������� ��� �����:"   + total );
     System.out.println("������ ���� �������� ��� �����: " + (total-dec) );
     System.out.println("���� �����: " + dec );	
     System.out.println( "������ ���� ���� �������� ��� ������ �������: " + (total-dec) );	
     System.out.println( "������ ���� ���� �������� ��� ������ �������: " +((total-dec) + yousef(total-dec)));	
     System.out.println("���� �������: " + yousef(total-dec));
	}

}






	

	

	
