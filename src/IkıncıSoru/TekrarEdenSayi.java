package IkıncıSoru;

public class TekrarEdenSayi {
	
	
	
	public static void YinelenenSayi(int[] value)
	{
		 int sayac=0;
		 int j,k,l;
		 //int x=0;
		// int[] numbers1= { 9, 7, 5, 3, 7,  3, 18, 2, 0,7,};
		
	    for( j=0;j<value.length;j++)
	    {
	    	
	            for( k=0;k<value.length;k++)
	            {
	               
	                    if(value[j]==value[k])
	                    {
	                                       
	                                        for( l=0;l<j;l++)
	                                        {
	                                               
	                                                if(value[l]==value[j])
	                                                    
	                                                sayac=-1;
	                                        }
	                                        sayac++;
	                    }
	            }
	           
	            if (sayac > 1) 
	               System.out.println(value[j] + " sayısı " + sayac + " kez tekrar ediliyor."); 
	        
	            sayac=0;
	          
	    }
//	    if(x==0) {
//	    System.out.println("Tekrar eden sayı bulunamamıştır.");
//	    }
	    
	    }
		
		
		
	

	public static void main(String[] args) 
	{
		int[] numbers1= { 9, 7, 5, 3, 7,  3, 18, 2, 0,7,7};
		int[] numbers2= { 0, 1, 5, 3 };
		
		YinelenenSayi(numbers2);
		
		

	}

}
