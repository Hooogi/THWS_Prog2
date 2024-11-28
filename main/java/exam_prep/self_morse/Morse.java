package exam_prep.self_morse;

public enum Morse {

    A(".-"),B( "−..."),C("−.-."),D("-.."),E("."),F("..-."),G("--."),H("...."),I(".."),
    J(".---"),K("_._"),L(".-.."),M("--"),N("-."),O("---"),P(".--."),Q("--.-"),R(".-."),S("..."),
    T("-"),U("..-"),V("...-"),W(".--"),X("-..-"),Y("-.--"),Z("--..");
    public final String code;

    Morse(String code){
        this.code = code;
    }


}
