package auto_radnja.gume;
/**
 * Klasa koja predstavlja gumu
 * Guma ima marku, precnik,sirinu i visinu
 * @author Milena
 * @version 0.1
 *
 */

public class AutoGuma {
	/**
	 * Marka modela kaoString sa pocetnom vrednoscu null
	 */
	private String markaModel = null;
	/**
	 * Precnik gume kao int sa pocetnom vrednoscu -1
	 */
	private int precnik = -1;
	/**
	 * Sirina gume kao int sa pocetnom vrednoscu -1
	 */
	private int sirina = -1;
	/**
	 * Visina gume kao int sa pocetnom vrednoscu -1
	 */
	private int visina = -1;
	/**
	 * Prazan konstruktor koji inicijalizuje objekat klase AutoGuma(atributi imaju default vrednosti)
	 */
	public AutoGuma() {}
	/**
	 * Konstuktor parametrizovani koji inicijalizuje vrednosti atributa klase 
	 * 
	 * @param markaModel Marka kao String
	 * @param precnik pPrecnik kao int
	 * @param sirina Sirina kao int
	 * @param visina Visina kao int
	 */
	public AutoGuma(String markaModel, int precnik, int sirina, int visina) { 
		super();
		setMarkaModel(markaModel);
		setPrecnik(precnik);
		setSirina(sirina);
		setVisina(visina);
		}
	/**
	 * Metoda koja vraca marku modela
	 * @return vraca Marku kao String
	 */
	public String getMarkaModel() {
		return markaModel;
		}
	/**
	 * Metoda koja postavlja Marku modela na odredjenu vrednost
	 * 
	 * @param markaModel Marka modela kao String
	 * 
	 * @throws java.lang.NullPointerException ako je Marka modela null
	 * 
	 * @throws java.lang.RuntimeException  ako Marka modela sadrzi manje od 3 karaktera
	 * 
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel==null)
			throw new NullPointerException("Morate uneti marku i model");
		if (markaModel.length()<3)
			throw new RuntimeException("Marka i model moraju sadrzati bar 3 znaka");
		this.markaModel = markaModel;
		}
	/**
	 * Metoda koja vraca precnik 
	 * @return vraca Precnik kao int
	 */
	public int getPrecnik() {
		return precnik;
		}
	/**
	 * Metoda koja postavlja precnik gume na odredjenu vrednost
	 * 
	 * @param precnik precnik gume kao int
	 * 
	 * @throws java.lang.RuntimeException ako precnik gume nije izmedju 13 i 22
	 * 
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 && precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
		}
	/**
	 * Metoda koja vraca sirinu 
	 * @return vraca Sirinu kao int
	 */
	public int getSirina() {
		return sirina;
		}
	/**
	 * Metoda koja postavlja sirinu gume na odredjenu vrednost
	 * 
	 * @param sirina sirina gume kao int
	 * 
	 * @throws java.lang.RuntimeException ako sirina gume nije izmedju 135 i 355
	 * 
	 */
public void setSirina(int
		sirina) {
	if (sirina < 135 && sirina > 355)
	throw new RuntimeException("Sirina van opsega");
this.sirina = sirina;
}
/**
 * Metoda koja vraca visinu 
 * @return vraca Visinu kao int
 */
public int getVisina() {
	return
			visina;
	}
/**
 * Metoda koja postavlja visinu gume na odredjenu vrednost
 * 
 * @param visina visina gume kao int
 * 
 * @throws java.lang.RuntimeException ako je visina gume manja od 25 ili veca od 95
 * 
 */
public void setVisina(int visina) {
	if (visina < 25 || visina > 95)
		throw new RuntimeException("Visina van opsega");
	this.visina = visina;
	}
/**
 * Vraca String sa svim podacima o gumi
 */
@Override
public String toString() {
	return"AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina=" + visina + "]";
	}
/**
 * Poredi 2 gume i vraca true ako su iste i false ako nisu
 * 
 * Gume se porede po marki, precniku, sirini i visini
 * 
 * <ul>
 * <li>Vraca true ako su gume isti po marki, precniku, sirini i visini</li>
 * <li>Vraca false u ostalim slucajevima</li>
 * </ul>
 */
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	AutoGuma other = (AutoGuma) obj;
	if (markaModel == null) {
		if (other.markaModel != null)return false;
		} else if (!markaModel.equals(other.markaModel))return false;
		if (precnik != other.precnik)return false;
		if (sirina != other.sirina)return false;
		if (visina != other.visina)return  false;
		return true;}}
