package service;
import java.lang.*;
import evento.modello.*;
import org.json.simple.*;
import org.json.simple.JSONObject;
import java.util.*;
import java.util.List;
import java.util.Vector;
import exception.NotFoundException;
import org.json.simple.parser.*;
import java.net.URL;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import javax.net.ssl.HttpsURLConnection;
public class DownloadEventi {
String url="https://app.ticketmaster.com/discovery/v2/events.json?&apikey=EJXHVvfXe25d3dcivdfutpAiC4MIkeE3";
	private void costruttoreeventi(JSONArray a,List<Eventi>eventiscaricati) {  
		for(Object eventox:a){
		try {
			JSONObject evento=(JSONObject)eventox;
			String id=(String)evento.get("id");
			String nome=(String)evento.get("nome");
			String CountryCode=(String)evento.get("CountryCode");
			String data=(String)evento.get("dateTime");
			String indirizzo=(String)evento.get("address");
			String type=(String)evento.get("genre");
			String state=(String)evento.get("state");
			Eventi x= new Eventi(id,nome,CountryCode,indirizzo,data,type,state);
			eventiscaricati.add(x);
			
		}catch(Exception e ) {
			e.printStackTrace();
		}}}
	public List<Eventi> scaricoeventi(String url) {
		List<Eventi> eventiscaricati= new Vector<>();
		JSONParser parser= new JSONParser();
		
		try { 
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
		}
		catch(Exception e ){
			e.printStackTrace();}
		return eventiscaricati;
		
		
	}
		
	}





