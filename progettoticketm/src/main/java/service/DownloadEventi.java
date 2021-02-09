package service;
import evento.modello.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import java.util.Vector;
import exception.NotFoundException;
import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



public class DownloadEventi {
	String url="https://app.ticketmaster.com/discovery/v2/events.json?&apikey=EJXHVvfXe25d3dcivdfutpAiC4MIkeE3";
	public List<Eventi> scaricoeventi(String url) {
		List<Eventi> eventiscaricati= new Vector<>();
		JSONParser parser= new JSONParser();
		
		try { //chiamataapi
			URL oracle = new URL(url);
			HttpsURLConnection yc=(HttpsURLConnection)oracle.openConnection();
			yc.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1;WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
			BufferedReader in= new BufferedReader( new InputStreamReader(yc.getInputStream()));
			String input;
			while((input=in.readLine())!=null) {
				JSONObject stats=(JSONObject)parser.parse(input);
				JSONObject stats2=(JSONObject)stats.get("_embedded");
				JSONArray a=(JSONArray) stats2.get( "events");
				costruttoreeventi(a,eventiscaricati);
				
			}
			in.close();
		}catch(NotFoundException e) {
			e.printStackTrace();
		}catch(Exception e ){
			e.printStackTrace();
			
		}return eventiscaricati;
		
		}
	private void costruttoreeventi(JSONArray a,List<Eventi>eventiscaricati) {
		for(Object o:a) {try {
			JSONObject evento=(JSONObject)o;
			String id=(String)evento.get("id");
			String nome=(String)evento.get("nome");
			Eventi x= new Evento(id,nome);
			eventiscaricati.add(x);
			//mancanoaltri
			
		}catch(Exception e ) {
			System.out.println("error");
		}
		}
		
	}
		
	}




}
