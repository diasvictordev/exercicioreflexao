public class Avo extends Pessoa{

    private String cpf;

    @Override
    public String getTipoVoz() {
        return "Voz do avô";
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


}
