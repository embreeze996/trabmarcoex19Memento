package MementoMethod;

public class MaquinaEstadoOperacao implements MaquinaEstado {

    private MaquinaEstadoOperacao() {};
    private static MaquinaEstadoOperacao instance = new MaquinaEstadoOperacao();
    public static MaquinaEstadoOperacao getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Operando";
    }

}

