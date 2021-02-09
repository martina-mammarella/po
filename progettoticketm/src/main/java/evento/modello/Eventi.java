package evento.modello;

public class Eventi {


 private String id ;
 private String nome;
 private String stato;
 private String indirizzo;
 private  String data;
 private String source;
 public Eventi (String id,String nome) {
  setId(id);
  setNome(nome);
  setStato(stato);
  setIndirizzo(indirizzo);
  setData(data);
  setSource(source);
				
			}
 private void setId(String id) {
  this.id=id;
			}
 private void setNome(String nome) {
  this.nome=nome;
			}
 private void setStato(String stato) {
  this.stato=stato;
			}
 private void setIndirizzo(String indirizzo) {
  this.indirizzo=indirizzo;
			}
 private void setData(String indirizzo) {
  this.indirizzo=indirizzo;
			}
 private void setSource(String source) {
  this.source=source;
			}
 public String getId() {
  return id;
			}
 public String getNome() {
  return nome;
			}
 public String getStato() {
  return stato;
			}
 public String getIndirizzo() {
  return indirizzo;
			}
 public String getData() {
  return data;
			}
 public String getSource() {
  return source;
}
}

