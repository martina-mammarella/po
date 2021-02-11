package filters;
	import java.util.Vector;
	import java.util.List;
	import org.json.simple.JSONObject;
	import evento.modello.*;
	import exception.NotFoundException;
	import org.json.simple.*;
    import org.json.simple.JSONArray;
    import java.lang.*;
public  class Filters {
	protected List<Filters>filtri=new Vector();
	protected List<Filters>fCountry= new Vector();
	protected List<Filters>fType=new Vector();
	public void tipoFiltro(JSONObject filtro) {
		try {
			if(filtro.containsKey("countryCode")) {
			FiltersCountry x= new FiltersCountry((String)filtro.get("countryCode"));
			fCountry.add(x);
				
			}
			if(filtro.containsKey("type")) {
			FiltersType x= new FiltersType((String)filtro.get("type"));
			fType.add(x);
			}
		}catch(Exception e) {
			System.out.println("non sono stati applicati filtri");
		}
	}
	public void filtraggio(List<Eventi> dafiltrare,List <Eventi>filtrati) {};
	
	
	
	
	
	
	
}
