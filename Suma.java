import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;

public class Suma extends AccionSemantica{

    @Override
    public Pointer ejecutar(BufferedReader codigoFuente, Lex lex, int caracterActual,
            HashMap<String, Simbolo> tablaSimbolos) throws IOException {
        return new Pointer(34);
    }
    
}
