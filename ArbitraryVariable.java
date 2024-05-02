import java.math.BigInteger;

public class ArbitraryVariable {

    boolean isUpperBound;
    BigInteger size;
    SetOfNaturalNumbers setOfNaturalNumbers;
    UpperBound upperbound;

    public ArbitraryVariable(SetOfNaturalNumbers setOfNaturalNumbers) {
        upperbound = new UpperBound(setOfNaturalNumbers);
        isUpperBound = upperbound.isUpperBound; //need true;
        this.setOfNaturalNumbers = upperbound.setOfNaturalNumbers;
        size = this.setOfNaturalNumbers.getSize();
    }

    public BigInteger getSize() {
        return size;
    }

    public boolean isUpperBound() {
        return isUpperBound;
    }

    //
//    Cardinal yMin =new Cardinal(max(N))
//
//    Cardinal yMin = max(S) or
//
//    Cardinal yMin = max(N);
//    but max(N) = a;
//
//    therefore y.min >=/*/geq*/ a;
//    public ArbitraryVariable()
//
//    }
}
