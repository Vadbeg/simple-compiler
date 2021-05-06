import ast.Node;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.io.File;
import java.io.FileReader;

import antlr4.*;
import translator.Translator;


public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("/home/vadbeg/Projects/University/compilers/simple-compiler/src/main/tl/test.tl");

        GrammarSimpleLexer testLexer = new GrammarSimpleLexer(new ANTLRInputStream(new FileReader(file)));
        TokenStream tokenStream = new CommonTokenStream(testLexer);
        GrammarSimpleParser parser = new GrammarSimpleParser(tokenStream);
        parser.program();

        System.out.println(parser.getTokenStream().get(4));
        try {
            Node ast = new Node(tokenStream);
            System.out.println("The End");
            Translator translator = new Translator(ast);
            translator.translate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}