package stats;

import java.util.List;

import org.json.simple.JSONObject;

import evento.modello.Eventi;

public class Min extends StatsStati{
	public Min(List<Eventi> eventi) {
		super(eventi);
	}
	private int  getMinS (int[]vettore) {
		int min=0;
		for(int c=0;c<vettore.length;c++) {
			 if( vettore[c]<min ) {
			        min=vettore[c];
		}}
		return min;
			
}
	public void saveMinStatsState(int[]vettore) {
		JSONObject y= new JSONObject();
		if(getMinS(vettore)==vettore[0])y.put("california", vettore[0]);
		if(getMinS(vettore)==vettore[1])y.put("floarida", vettore[1]);
		if(getMinS(vettore)==vettore[2])y.put("texas", vettore[2]);
		if(getMinS(vettore)==vettore[3])y.put("tasmania", vettore[3]);
		if(getMinS(vettore)==vettore[4])y.put("victoria", vettore[0]);
		super.setStatsObject(y);
		
		
	}
	
}
		
		
