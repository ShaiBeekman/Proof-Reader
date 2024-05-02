import java.math.BigInteger;

public class UpperBound {

//    ArbitraryVariable y;
//    public boolean isUpperBound;
//    real.isReal(ArbitraryVariable y), real.isReal(ArbitraryVariable a);

    boolean isUpperBound; //maybe isupperboundtrue instead
    Aleph aleph;
    SetOfNaturalNumbers setOfNaturalNumbers;
    BigInteger size;

    public UpperBound(Aleph aleph, SetOfNaturalNumbers setOfNaturalNumbers) {
        this.aleph = aleph;
        this.setOfNaturalNumbers = setOfNaturalNumbers;
        size = aleph.getSize();
    }

    public UpperBound(SetOfNaturalNumbers setOfNaturalNumbers) {
        isUpperBound = true; //maybe isupperboundtrue instead
        this.setOfNaturalNumbers = setOfNaturalNumbers;
//        y = new ArbitraryVariable(true)
    }

    public boolean isUpperBound() {
        if ((aleph.real.isReal() == true) && ((Integer.parseInt(aleph.getSize().toString()) >= Integer.parseInt(setOfNaturalNumbers.getSize().toString())))) {
            //remember, the largest element of N~the natural numbers~, is equivalent to the size of N
            isUpperBound = true;
            return isUpperBound;
        } else {
            isUpperBound = false;
            return isUpperBound;
        }
    }

    public BigInteger getSize() {
        return size;
    }

//    public void setPropertiesOfArbitraryVariable() {
//
//    }

//    public boolean setUpperBound() {
//
//    }

}