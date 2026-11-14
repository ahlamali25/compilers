import grammar.JavaSpringLexer;
import grammar.JavaSpringParser;
import org.antlr.v4.runtime.*;
import java.nio.file.Paths;

public class MainSpring {

    public static void main(String[] args) throws Exception {

        // 1. Read the test file
        CharStream input = CharStreams.fromPath(
                Paths.get("src/grammar/ProductController.txt")
        );

        // 2. Create the Lexer
        JavaSpringLexer lexer = new JavaSpringLexer(input);

        // 3. Get the tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();

        System.out.println("========== TOKENS ==========");

        for (Token token : tokens.getTokens()) {
            if (token.getType() != Token.EOF) {
                String tokenName =
                        JavaSpringLexer.VOCABULARY
                                .getSymbolicName(token.getType());

                System.out.println(
                        tokenName + " : " + token.getText()
                );
            }
        }

        // 4. Reset tokens to the beginning
        tokens.seek(0);

        // 5. Create the Parser
        JavaSpringParser parser = new JavaSpringParser(tokens);

        System.out.println("\n========== PARSING ==========");

        parser.controllerFile();
//        parser.classDeclaration();
        if (parser.getNumberOfSyntaxErrors() == 0) {
            System.out.println("Parsing successful!");
        } else {
            System.out.println("Parsing failed!");
        }
    }
}
