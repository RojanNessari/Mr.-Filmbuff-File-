// -----------------------------------------------------
// Assignment #2
// COMP 249
// Written by: Mobina Gerayely Moghadam 40258626 , Rojan Nessari 40255637
// -----------------------------------------------------
public class SemanticErrors extends Exception{
     public SemanticErrors(String s){
         super(s);
     }
     static  class MissingPart extends SemanticErrors {
        public MissingPart(String s){ super(s);}
     }


    static class InvalidPart extends  SemanticErrors{
        public InvalidPart(String s){super(s);}
    }
    static class  NumberFormatException extends  SemanticErrors{
        public NumberFormatException(String s){super(s);

        }
    }

}
