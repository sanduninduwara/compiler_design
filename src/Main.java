public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");
        String st="String a = hgh {fafa  jj} \n" +
                "if ";
        Lexer lx=new Lexer(st);

        for (int i = 0; i <15 ; i++) {
            SyntaxToken out = lx.findNextToken();
            System.out.println(out.type+" "+ out.kind+" "+ out.line +" "+ out.column+" "+ out.position );
        }

    }
}