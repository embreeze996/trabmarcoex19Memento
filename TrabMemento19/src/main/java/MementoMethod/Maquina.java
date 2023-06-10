package MementoMethod;

import java.util.ArrayList;
import java.util.List;

public class Maquina {

    private MaquinaEstado estado;
    private List<MaquinaEstado> memento = new ArrayList<MaquinaEstado>();

    public MaquinaEstado getEstado() {
        return this.estado;
    }

    public void setEstado(MaquinaEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<MaquinaEstado> getEstados() {
        return this.memento;
    }
}
