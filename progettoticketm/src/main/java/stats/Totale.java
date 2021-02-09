package stats;
import java.util.List;
import evento.modello.*;
public class Totale extends Stats{
	private int totale;
	public Totale(List<Eventi> eventi) {
		super(eventi);
		setTotale(0);
	}
	private void setTotale(int totale) {
		this.totale=totale;
	}
	public int getTotale() {
		return totale;
	}
	public void calcolototale() {
		int tot=super.eventi.size();
	}

}
