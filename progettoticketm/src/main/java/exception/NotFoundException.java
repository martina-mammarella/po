package exception;

public class NotFoundException extends Exception {
public NotFoundException() {
	super("non ci sono dati da poter elaborare dopo la richiesta");
}
}
