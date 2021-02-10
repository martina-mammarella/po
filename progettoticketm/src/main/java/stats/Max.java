package stats;
import java.util.List;
import java.math.*;
import org.json.simple.JSONObject;

import evento.modello.*;
public class Max extends StatsStati{
	public Max(List<Eventi> eventi) {
		super(eventi);
	}
	
	private int  getMaxS(int[]vettore) {
		
		int max=0;
		for(int c=0;c<vettore.length;c++) {
			 if( vettore[c]>max ) {
			        max=vettore[c];
		}
		
	}
		return max;
		}
	
	
		
	public void saveMaxStatsState(int[]vettore) {
		JSONObject y= new JSONObject();
		if(getMaxS(vettore)==vettore[0])y.put("california", vettore[0]);
		if(getMaxS(vettore)==vettore[1])y.put("floarida", vettore[1]);
		if(getMaxS(vettore)==vettore[2])y.put("texas", vettore[2]);
		if(getMaxS(vettore)==vettore[3])y.put("tasmania", vettore[3]);
		if(getMaxS(vettore)==vettore[4])y.put("victoria", vettore[0]);
		super.setStatsObject(y);
		
		
	}
	
}
