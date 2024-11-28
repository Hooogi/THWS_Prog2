package exam_prep.ex_5;

public class FalscheIBANException extends Exception{

    public FalscheIBANException() {
        super("FEHLER: Datei enthält ungültige IBAN");
    }

    public FalscheIBANException(String message) {
        super(message);
    }
}
