import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;

public class warningNL extends AccionSemantica {

    @Override
    public Pointer ejecutar(BufferedReader codigoFuente, Lex lex, int caracterActual,
            HashMap<String, Simbolo> tablaSimbolos, HashMap<String, Integer> tablaPRes) throws IOException {
        System.out.println("Error in line:"+ lex.line +"  = expected");
        lex.line++;
        return new Pointer(-1);
    }
    
}
