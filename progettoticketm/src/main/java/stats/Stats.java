package stats;
import evento.modello.*;
import java.util.List;

import org.json.simple.JSONObject;
public class Stats {
	List<Eventi> eventi;
	private JSONObject statsObject;
	public Stats(List<Eventi> eventi) {
		setEventi(eventi);
		setStatsObject(null);
	}
	private void setEventi(List<Eventi>eventi) {
		this.eventi=eventi;
	}
	public List<Eventi> getEventi(){
		return eventi;
	}
	public void setStatsObject( JSONObject statsObject) {
		  this.statsObject=statsObject;
	  }
	  public JSONObject getGenere() {
		  return statsObject;
	  }
	}

