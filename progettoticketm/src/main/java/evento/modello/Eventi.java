package evento.modello;
public class Eventi {                //implementazione classe che modella ogni evento
 private String id ;                //attributo id
 private String nome;              //attributo nome
 private String stato;            //attributo stato
 private String indirizzo;       //attributo indirizzo
 private  String data;          //attributo data
 private String type;          //attributo type
 private String state;        //attributo state
 //private String souce;
 public Eventi (String id,String nome,String stato,String indirizzo,String data,String type,String state) { //costruttore non di default
  setId(id);                    //richiamo metodo setid 
  setNome(nome);               //richiamo metodo setnome
  setStato(stato);            //richiamo metodo setstato
  setIndirizzo(indirizzo);   //richiamo metodo setindirizzo
  setData(data);            //richiamo metodo setdata
  setType(type);           //richiamo metodo settype
  setState(state);        //richiamo metodo setstate
  //setSource(source);
				
			}
 private void setId(String id) { //imposta valore attriuto id
  this.id=id;
			}
 private void setNome(String nome) {//imposta valore attributo nome
  this.nome=nome;
			}
 private void setStato(String stato) {//imposta valore attributo stato
  this.stato=stato;
			}
 private void setIndirizzo(String indirizzo) { //imposta valore attributo indirizzo
  this.indirizzo=indirizzo;
			}
 private void setData(String indirizzo) { //imposta valore attributo indirizzo
  this.indirizzo=indirizzo;
			}
 private void setType(String type) { //imposta valore attributo type
	 this.type=type;
 }
 private void setState(String state) { //imposta valore attributo state
	 this.state=state;
 }
// private void setSource(String source) {
 // this.source=source;}
			
 public String getId() { //restituisce valore attributo id
  return id;
			}
 public String getNome() { //restituisce valore attributo nome
  return nome;
			}
 public String getStato() { //restituisce valore attributo stato
  return stato;
			}
 public String getIndirizzo() { //restituisce valore attributo indirizzo
  return indirizzo;
			}
 public String getData() { //restituisce valore attributo data 
  return data;
			}
 public String getType() {  //restituisce valore attributo type 
	 return type;
 }
 public String getState() {  //restituisce valore attributo state
	 return state;
 }
 //public String getSource() {
  //return source;}
}


