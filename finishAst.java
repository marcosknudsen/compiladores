import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;

public class finishAst extends AccionSemantica {

    @Override
    public Pointer ejecutar(BufferedReader codigoFuente, Lex lex, int caracterActual,
            HashMap<String, Simbolo> tablaSimbolos, HashMap<String,Integer> tablaPRes) throws IOException {
        lex.line++;
        return new Pointer(33);

    }
    
}
