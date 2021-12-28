package ProjetoFidelidade;

import java.util.Date;

public class Cliente extends Pessoa {

    private String dataCadastro;
    private int codFidelidade;
    private float qtPontos;



    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public int getCodFidelidade() {
        return codFidelidade;
    }

    public void setCodFidelidade(int codFidelidade) {
        this.codFidelidade = codFidelidade;
    }

    public float getQtPontos() {
        return qtPontos;
    }

    public void setQtPontos(float qtPontos) {
        this.qtPontos = qtPontos;
    }

    public void retirarPremios(int codPremio){

    }
}
