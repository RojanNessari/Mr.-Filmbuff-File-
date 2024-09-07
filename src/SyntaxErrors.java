// -----------------------------------------------------
// Assignment #2
// COMP 249
// Written by: Mobina Gerayely Moghadam 40258626 , Rojan Nessari 40255637
// -----------------------------------------------------
public class SyntaxErrors extends Exception {
    public SyntaxErrors(){
        super(", SyntaxErrors! ");
    }
    public SyntaxErrors(String s) {
        super(s);
    }
    static class MissingQuotesException extends SyntaxErrors {
        public MissingQuotesException(String message) {
            super(message);
        }
    }

    static class ExcessFieldsException extends SyntaxErrors {
        public ExcessFieldsException(String s ) {
            super(s);
        }
    }

    static class MissingFieldsException extends SyntaxErrors {
        public MissingFieldsException(String s) {
            super(s);
        }

    }

}

