
import org.antlr.v4.runtime.*;
import java.nio.file.Paths;
import grammar.CSSLexer;
import grammar.CSSParser;

public class MainCSS {
    public static void main(String[] args) throws Exception {

        CharStream input = CharStreams.fromPath(
                Paths.get("src/grammar/style.css")
        );

        CSSLexer lexer = new CSSLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();

        System.out.println("========== TOKENS ==========");

        for (Token token : tokens.getTokens()) {
            if (token.getType() != Token.EOF) {
                String tokenName =
                        CSSLexer.VOCABULARY.getSymbolicName(token.getType());

                System.out.println(tokenName + " : " + token.getText());
            }
        }

        tokens.seek(0);

        CSSParser parser = new CSSParser(tokens);

        System.out.println("\n========== PARSING ==========");

        parser.stylesheet();

        if (parser.getNumberOfSyntaxErrors() == 0) {
            System.out.println("Parsing successful!");
        } else {
            System.out.println("Parsing failed!");
        }
    }
}
