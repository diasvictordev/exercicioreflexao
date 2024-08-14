public class Pai extends Pessoa{

    private String sobrenome;

    @Override
    public String getTipoVoz() {
       return "Voz do pai";
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
