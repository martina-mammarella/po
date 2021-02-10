package stats;
import java.util.List;
import evento.modello.*;
import org.json.simple.*;
import org.json.simple.JSONObject;
public class Generi extends Stats{
  private JSONObject genere;
  public Generi(List<Eventi> eventi) {
	  super(eventi);
	  setGenere(null);
  }
  public void setGenere( JSONObject genere) {
	  this.genere=genere;
  }
  public JSONObject getGenere() {
	  return genere;
  }
  public void statsGenere() {
	  int m=0;;
	  int a=0;
	  int tl=0;
	  int f=0;
	  JSONObject y=null;
	  for(Eventi x:super.eventi) {
		  if(x.getType().contains("musica")) m++;
		  if(x.getType().contains("arte&teatro"))a++;
		  if(x.getType().contains("festival"))f++;
		  if(x.getType().contains("tempo libero"))tl++;
		  		
	  }
	  y.put("musica", m);
	  y.put("arte e teatro", a);
	  y.put("festival", f);
	  y.put("tempolibero", tl);
	  this.setGenere(y);
  }
}
