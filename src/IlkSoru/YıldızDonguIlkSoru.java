package IlkSoru;

public class YıldızDonguIlkSoru {
	
	public static void yildiz() 
	{
		int i,j,k;
		
        int yildiz=7;
        for(k=0; k<3;k++) {
        for (j=0; j <yildiz; j++) {
            System.out.print("*");
        }
        System.out.println("");
        }
        for(k=3; k<11;k++) {
        	
            for (i=0; i <yildiz; i++) {
                System.out.print("*");
            }
            System.out.println("");
            yildiz--;
            
        }
		
	}

	public static void main(String[] args) {
		
		yildiz();
		

	}

}
