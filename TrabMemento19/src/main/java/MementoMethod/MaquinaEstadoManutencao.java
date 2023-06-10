package MementoMethod;

public class MaquinaEstadoManutencao implements MaquinaEstado {

    private MaquinaEstadoManutencao() {};
    private static MaquinaEstadoManutencao instance = new MaquinaEstadoManutencao();
    public static MaquinaEstadoManutencao getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Manutenção";
    }

}