package service;
import exception.NotFoundException;
import evento.modello.*;
import java.util.List;
import java.util.Vector;
import org.json.simple.JSONObject;
import org.json.simple.*;
public interface ServiceApp {
	

	//i servizi implementati sono:richiesta degli eventi,applicazione filtri e stats
		public List<Eventi> getEventi(String url)throws NotFoundException;
		public List<Eventi>getEventiFiltrati(String url, JSONObject filtro)throws NotFoundException;
		public JSONObject getStats(String url)throws NotFoundException;
		
	
}
