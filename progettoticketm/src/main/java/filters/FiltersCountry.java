package filters;
import java.util.List;
import evento.modello.*;
public class FiltersCountry extends Filters  {
	public FiltersCountry(String valoreFiltro){
		super(valoreFiltro);
		
	}
	protected String getValoreFiltro() {
		return super.getValoreFiltro();
	}
	public List<Filters>  getFiltersCountry() {
		return fCountry;
	}
	public void filtraggio(List<Eventi> dafiltrare,List<Eventi>filtrato) {
		for(Eventi a:dafiltrare) {
			if(a.getStato().equals(valoreFiltro)&&!filtrato.contains(a)) {
				filtrato.add(a);
			}
		}
	}

}
