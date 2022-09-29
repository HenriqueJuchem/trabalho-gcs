package testecodigo1159;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

import Codigo1159.codigo;

public class codigo1159Test {

    private codigo codigo = new codigo();

    @Test
    public void greeterSaysHello() {
        assertThat(codigo.retornaValor(11), equals(80));
    }

}