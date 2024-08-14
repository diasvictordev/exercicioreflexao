import java.lang.reflect.Field;
import java.lang.reflect.Method;
import static sun.reflect.misc.FieldUtil.getDeclaredFields;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        Avo avo = new Avo();
        avo.setCpf("700.765.982-65");
        avo.setNome("Fulano");
        Pai pai = new Pai();
        pai.setNome("Fulano");
        pai.setSobrenome("da Silva");
        Filho filho = new Filho();
        filho.setNome("Fulano");
        filho.setIdade(21);
        Class cAvo = Class.forName("Avo");
        cAvo.getDeclaredMethods()[0].setAccessible(true);
        System.out.print(cAvo);
    }
}