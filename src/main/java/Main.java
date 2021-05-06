import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.io.File;
import java.io.FileReader;

import antlr4.*;



public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("/home/vadbeg/Projects/university/compilers/simple-compiler/src/main/tl/test.tl");

        GrammarSimpleLexer testLexer = new GrammarSimpleLexer(new ANTLRInputStream(new FileReader(file)));
    }
}