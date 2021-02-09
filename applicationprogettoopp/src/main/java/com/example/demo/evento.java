package com.example.demo;
public class evento {
private String id ;
private String nome;
private String stato;
private String indirizzo;
private  String data;
private String source;
public evento (String id,String nome) {
	setid(id);
	setnome(nome);
	//setstato(stato);
	//setindirizzo(indirizzo);
//	setdata(data);
	//setsource(source);
	
}
public void setid(String id) {
	this.id=id;
}
public void setnome(String nome) {
	this.nome=nome;
}
public void setstato(String stato) {
	this.stato=stato;
}
public void setindirizzo(String indirizzo) {
	this.indirizzo=indirizzo;
}
public void setdata(String indirizzo) {
	this.indirizzo=indirizzo;
}
public void setsource(String source) {
	this.source=source;
}
public String getid() {
	return id;
}
public String getnome() {
	return nome;
}
public String getstato() {
	return stato;
}
public String getindirizzo() {
	return indirizzo;
}
public String getdata() {
	return data;
}
public String getsource() {
	return source;
}
}
