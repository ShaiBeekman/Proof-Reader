/*Documentation*/
// -> https://www.w3schools.com/java/ref_string_split.asp
// -> https://www.geeksforgeeks.org/classes-objects-java/

import java.io.File;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prove {
    String theorem;
    String[] tokenizedTheorem;
    //turn each word into a token, and whichever word is undefined you can ignore
    String[] definedTheoremTokens;
    int numOfTokensDefined;
    boolean fullyDefinedTheorem;
    String[] definitions;

    public Prove(String theorem) {
        fullyDefinedTheorem = false;
        this.theorem = theorem;
        this.tokenizedTheorem = theorem.split(" ");
        definedTheoremTokens = new String[tokenizedTheorem.length];

        int numOfTokensDefined = 0;
        int indexOfToken = 0;
        for (String token : tokenizedTheorem) {
//            System.out.println("Token: " + token);
            if (isDefined(token, tokenizedTheorem, indexOfToken)) {
//                System.out.println(token + " is defined");
                numOfTokensDefined++;
            }
            indexOfToken++;
        }

        definitions = new String[numOfTokensDefined];
        int i = 0;
        for (String definedTokens : definedTheoremTokens) {
            if (definedTokens != null) {
                definedTokens = definedTokens.replaceAll("\\s", "");
                definitions[i] = definedTokens;
                i++;
            }
        }
    }


    public boolean isDefined(String token, String[] tokenizedTheorem, int indexOfToken) {
        String capitalizedToken = token.substring(0, 1).toUpperCase() + token.substring(1);
//        System.out.println(capitalizedToken);
        File definitionFile = new File(capitalizedToken + " Definition" + ".txt");
        if (definitionFile.exists() && !definitionFile.isDirectory()) {
//            System.out.println("file exists");
            definedTheoremTokens[numOfTokensDefined] = capitalizedToken;
            numOfTokensDefined = numOfTokensDefined + 1;
            return true;
        } else { //token is not a file name
//            System.out.println(capitalizedToken + " file does not exist...");
            String multiToken = "" + capitalizedToken;
//            System.out.println("Multitoken result of " + token + " is " + multiToken);
            int c = 0;
            while (c != 1) {
                indexOfToken++;
//                System.out.println("inside while for " + multiToken);
//                System.out.println("multiToken is " + multiToken);
                if (indexOfToken == tokenizedTheorem.length) {
//                    System.out.println("file does not exist at all");
//                    System.out.println("all tokens defined");
                    fullyDefinedTheorem = true;
                    return false;
                } else {
//                    System.out.println("inside else for " + multiToken);
//                    System.out.println("token index: " + indexOfToken);
                    String capitalizedToken2 = tokenizedTheorem[indexOfToken].substring(0, 1).toUpperCase() + tokenizedTheorem[indexOfToken].substring(1);
//                    System.out.println("just initialized " + capitalizedToken2);
                    multiToken += " " + capitalizedToken2;
//                    System.out.println("new multitoken: " + multiToken);
                    definitionFile = new File(multiToken + " Definition" + ".txt");
//                    System.out.println("File name is " + definitionFile.getName());
                    if (definitionFile.exists() && !definitionFile.isDirectory()) {
//                        System.out.println("file exists");
                        definedTheoremTokens[numOfTokensDefined] = multiToken;
                        numOfTokensDefined = numOfTokensDefined + 1;
                        return true;
                    } else {
//                        System.out.println("file does not exist, append more");
                        continue;
                    }
                }
            }
        }
        return false;
    }

    public String[] getDefinitions() {
        return definitions;
    }

    //    public void proof() {
//
//        Aleph aleph = new Aleph();
//        SetOfNaturalNumbers setOfNaturalNumbers = new SetOfNaturalNumbers();
//        Completes complete = new Completes(aleph, setOfNaturalNumbers);
//        System.out.println("proof complete!");
//    }
//             for (int i = indexOfToken; i < tokenizedTheorem.length; i++) {
//                 multiToken = tokenizedTheorem[i] + tokenizedTheorem[i+1];
//                 return isDefined()
//                 }
//        }


////        while {
//        if (theorem.toUpperCase().contains(token.toUpperCase())) {
//                /*then*/ if tokenizedTheorem(tokenizedTheorem[token]+1)
//            }
//            return true /* +new d value */;
////        }


//        if tokenizedTheorem[n] \in


//        if (token.upper() == definition.getName().upper()) {
//        }

//    public boolean isConnected() {
//        if (){}
//    }
//    public String getTheorem() {
//        return theorem;
//    }

//    public String[] getTokenizedTheoremArray() {
//        return tokenizedTheoremArray;
//    }

//    public boolean isFullyDefinedTheorem() {
//
//    }

}
//
//    String theorem;
//    String[] splitTheorem;


//this.splitTheorem = theorem.split(" ");
//        this.theorem = splitTheorem;