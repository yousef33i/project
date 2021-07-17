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
		
		int Branch=Integer.parseInt(JOptionPane.showInputDialog("ÇÏÎá ÑŞã ÇáİÑÚ"));
		int receipt=Integer.parseInt(JOptionPane.showInputDialog("ÇÏÎá ÑŞã ÇáİÇÊæÑå"));
		x=Integer.parseInt(JOptionPane.showInputDialog("ßã ÚÏÏ ÇáãäÊÌÇÊ"));
		String Products[] = new String[x];
		double price1[]=new double[x];
		for(int i=0;i<x;i++) {

			Products[i]=JOptionPane.showInputDialog("ÇßÊÈ ÇÓã ÇáãäÊÌ" );
			price1[i]=Integer.parseInt(JOptionPane.showInputDialog("ÓÚÑ ÇáãäÊÌ"));
	         total+=price1[i];		

		}
	switch (Branch) {
	case 1:
		if(total>100) {
			dec+=total/10;
			System.out.println("ÑŞã ÇáİÑÚ 1");
		}
			
		break;
	case 2:
		dec+=yousef(total);
		System.out.println("ÑŞã ÇáİÑÚ 2");
		break;
	case 3:
		if(total>500) {
			dec+=50;
			System.out.println("ÑŞã ÇáİÑÚ 3");
		}
			
		break;
		
		default:
			if(Branch>3)
			 System.out.println("áÇíæÌÏ İÑÚ");

	}
	for(int i=0;i<x;i++) {
		 System.out.println("ÑŞã ÇáİÇÊæÑå: "   + receipt );
		System.out.println("ÃÓã ÇáãäÊÌ: "+Products[i] +"\n" + "ÇáÓÚÑ : "  + price1[i]);	
	}
	 System.out.println("ÇÌãÇáí Şíãå ÇáİÇÊæÑå ŞÈá ÇáÎÕã:"   + total );
     System.out.println("ÇÌãÇáí Şíãå ÇáİÇÊæÑå ÈÚÏ ÇáÎÕã: " + (total-dec) );
     System.out.println("Şíãå ÇáÎÕã: " + dec );	
     System.out.println( "ÇÌãÇáí ãÈáÛ Şíãå ÇáİÇÊæÑå ŞÈá ÇÍÊÓÇÈ ÇáÖÑíÈå: " + (total-dec) );	
     System.out.println( "ÇÌãÇáí ãÈáÛ Şíãå ÇáİÇÊæÑå ÈÚÏ ÇÍÊÓÇÈ ÇáÖÑíÈå: " +((total-dec) + yousef(total-dec)));	
     System.out.println("Şíãå ÇáÖÑíÈå: " + yousef(total-dec));
	}

}






	

	

	
