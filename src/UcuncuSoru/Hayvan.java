package UcuncuSoru;

public abstract class Hayvan {
	
	String ad;
	int kilosu;
	int uzunlugu;
	boolean tehlikelimi;
	
	public abstract void sesCikar();

	public Hayvan(String ad, int kilosu, int uzunlugu) {
		
		this.ad = ad;
		this.kilosu = kilosu;
		this.uzunlugu = uzunlugu;
	}
	

}
