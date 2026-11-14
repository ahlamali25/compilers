import grammar.HTMLLexer;
import grammar.HTMLParser;
import org.antlr.v4.runtime.*;
import java.nio.file.Paths;

public class MainHTML {

    public static void main(String[] args) throws Exception {

        // Read HTML file
        CharStream input = CharStreams.fromPath(
                Paths.get("src/grammar/products.html")
        );

        // Create Lexer
        HTMLLexer lexer = new HTMLLexer(input);

        // Create Token Stream
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Generate all tokens
        tokens.fill();

        System.out.println("========== TOKENS ==========");

        for (Token token : tokens.getTokens()) {

            if (token.getType() != Token.EOF) {

                String tokenName =
                        HTMLLexer.VOCABULARY.getSymbolicName(token.getType());

                System.out.println(
                        tokenName + " : " + token.getText()
                );
            }
        }

        // Reset token stream before parsing
        tokens.seek(0);

        // Create Parser
        HTMLParser parser = new HTMLParser(tokens);

        System.out.println("\n========== PARSING ==========");

        // Start parsing
        parser.htmlDocument();

        if (parser.getNumberOfSyntaxErrors() == 0) {
            System.out.println("Parsing successful!");
        } else {
            System.out.println("Parsing failed!");
        }
    }
}
