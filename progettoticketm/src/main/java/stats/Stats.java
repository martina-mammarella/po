package stats;
import evento.modello.*;
import java.util.List;
public class Stats {
	List<Eventi> eventi;
	public Stats(List<Eventi> eventi) {
		setEventi(eventi);
	}
	private void setEventi(List<Eventi>eventi) {
		this.eventi=eventi;
	}
	public List<Eventi> getEventi(){
		return eventi;
	}
	}

