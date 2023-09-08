import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;

public class FinishAst extends AccionSemantica {

    @Override
    public Pointer ejecutar(BufferedReader codigoFuente, Lex lex, int caracterActual,
            HashMap<String, Simbolo> tablaSimbolos, HashMap<String,Integer> tablaPRes) throws IOException {
        if (caracterActual=='\n')
            lex.line+=1;
        codigoFuente.reset();
        return new Pointer(33);

    }
    
}
