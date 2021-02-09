package service;
import java.util.List;
import java.util.Vector;
import org.json.simple.JSONObject;
import evento.modello.Eventi;
import exception.NotFoundException;

public class ServiceAppImpl implements ServiceApp{
	private List<Eventi> eventiCercati=new Vector<>();
	public List<Eventi> getEventi(String url)throws NotFoundException{
		try {
		DownloadEventi e =new DownloadEventi();
		this.eventiCercati=e.scaricoeventi(url);
	
		if(this.eventiCercati==null) {
			throw new NotFoundException();
		}
		return this.eventiCercati;}
	public List<Eventi>getEventiFiltrati(String url, JSONObject filtro)throws NotFoundException;
	public JSONObject getStats(String url)throws NotFoundException;
}
