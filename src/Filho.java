public class Filho extends Pessoa{

    private Integer idade;

    @Override
    public String getTipoVoz() {
        return "Voz do filho";
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade){
        this.idade = idade;
    }

}
