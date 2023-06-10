package MementoMethod;

public class MaquinaEstadoDesligada implements MaquinaEstado {

    private MaquinaEstadoDesligada() {};
    private static MaquinaEstadoDesligada instance = new MaquinaEstadoDesligada();
    public static MaquinaEstadoDesligada getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Desligada";
    }

}