package UcuncuSoru;

import java.util.ArrayList;
import java.util.List;

public class HayvanatBahcesi implements IBahceMethods {

	List<Hayvan> a = new ArrayList<>();
	@Override
	public void bahceyeMemeliHayvanEkle(MemeliHayvan m) {
		
		a.add(m);
		System.out.println(m+ "memeli hayvan listeye eklendi.");
	}

	@Override
	public void bahceyeSurungenEkle(Surungen s) {
		
		a.add(s);
		
		
	}
	
	
	

}
