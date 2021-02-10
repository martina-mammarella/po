package filters;
import evento.modello.*;
import java.util.List;

public class FiltersType extends Filters  {
	public FiltersType(String valoreFiltro) {
		super(valoreFiltro);
	}
	protected String getValoreFiltro() {
		return super.getValoreFiltro();
	}
	public List<Filters>  getFiltersType() {
		return fType;
	}
	public void filtraggio(List<Eventi> dafiltrare,List<Eventi> filtrato) {
		for(Eventi a:dafiltrare) {
			if(a.getType().equals(valoreFiltro)&&! dafiltrare.contains(a)) {
				filtrato.add(a);
			}
		}
	}
}
