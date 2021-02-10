package stats;

import java.util.List;

import org.json.simple.JSONObject;

import evento.modello.Eventi;

public class StatsStati extends Stats {
	public StatsStati(List<Eventi> eventi) {
		super(eventi);
	}
	public void statsStati() {
		int california=0;
		int florida=0;
		int texas=0;
		int tasmania=0;
		int victoria=0;
	    JSONObject y=null;
	    for(Eventi x:super.eventi) {
	    if(x.getStato().contains("california")) california++;
	    if(x.getStato().contains("florida"))florida++;
	    if(x.getType().contains("texas"))texas++;
		if(x.getType().contains("tasmania"))tasmania++;
		if(x.getType().contains("victoria"))victoria++;		}
        y.put("california", california);
	    y.put("texas", texas);
	    y.put("tasmania", tasmania);
		y.put("victoria",victoria );
		y.put("florida", florida);
	    super.setStatsObject(y);
	    int []vettore;
	    vettore=new int[5];
	    vettore[0]=california;
	    vettore[1]=florida;
	    vettore[2]=texas;
	    vettore[3]=tasmania;
	    vettore[4]=victoria;
	    
	    
		  }

}
