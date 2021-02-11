package filters;
import java.util.Vector;
import java.util.List;
import org.json.simple.JSONObject;
import evento.modello.*;
import exception.NotFoundException;
import org.json.simple.*;

public class Filters {
	protected String valoreFiltro;
	protected List<Filters>f= new Vector<>();
	protected List<Filters>fCountry= new Vector<>();
	protected List<Filters>fType= new Vector<>();
	public Filters() {};
;	public Filters(String valoreFiltro) {
		setValoreFiltro(valoreFiltro);
	}
	protected void setValoreFiltro(String valoreFiltro) {
		this.valoreFiltro=valoreFiltro;
	}
	protected String getValoreFiltro() {
		return valoreFiltro;
	}
	
	public void parseFilteres(JSONObject filtroFornito) {
		if(filtroFornito.containsKey("countryCode")) {
			String countryCode=(String)filtroFornito.get("countryCode");
			Filters x= new Filters();
		for(String c:x.parseString(countryCode)) {
			Filters xCountry=new FiltersCountry(c);
			fCountry.add(xCountry);
		}
			
		}
		if(filtroFornito.containsKey("type")) {
			Filters x= new Filters();
			String type=(String)filtroFornito.get("type");
			for(String t:x.parseString(type)) {
				Filters x1=new FiltersType(t);
				fType.add(x1);
			}
			
		}
		
		}
	public String[] parseString(String line){
		String[] s=null;
	    s=line.split(";");
		return s;
	}
	public List<Filters> getFilters(){
		return f;
	}
	public  void filtraggio(List<Eventi> dafiltrare, List<Eventi>filtrato ) {};
	
	public List<Filters>  getFiltersCountry() {
		return fCountry;
	}
	public List<Filters>  getFiltersType() {
		return fType;
	}
	

}
