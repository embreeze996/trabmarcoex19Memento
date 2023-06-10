package MementoMethod;

public class MaquinaEstadoResfriamento implements MaquinaEstado {

    private MaquinaEstadoResfriamento() {};
    private static MaquinaEstadoResfriamento instance = new MaquinaEstadoResfriamento();
    public static MaquinaEstadoResfriamento getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Resfriamento";
    }

}