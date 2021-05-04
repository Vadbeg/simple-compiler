# Simple language compiler

Programming language compiler based on ANTLR

## Download

First, clone this repository:

```bash
git clone https://github.com/Vadbeg/simple-compiler.git
cd simple-compiler
```

## Install

To use give grammar you need to install ANTLRv4 on your machine.

```shell
$ cd /usr/local/lib
$ sudo curl -O https://www.antlr.org/download/antlr-4.9.2-complete.jar
$ export CLASSPATH=".:/usr/local/lib/antlr-4.9.2-complete.jar:$CLASSPATH"
$ alias antlr4='java -jar /usr/local/lib/antlr-4.9.2-complete.jar'
$ alias grun='java org.antlr.v4.gui.TestRig'
```

Next go to antlr4 directory with .g4 file

```shell
$ cd /src/main/antlr4/tl/antlr4
```

And print next commands:

```shell
$ antlr4 GrammarSimple.g4
$ javac GrammarSimple*.java
```

Now you can run parser on given file. For example:

```shell
grun GrammarSimple program path_to_file -gui
```

## Built With

* [ANTLRv4](https://www.antlr.org) - Framework with lexer and parser.

## Authors

* **Vadim Titko** aka *Vadbeg* - [GitHub](https://github.com/Vadbeg)
  | [LinkedIn](https://www.linkedin.com/in/vadtitko/)
