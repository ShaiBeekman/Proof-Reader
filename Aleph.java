import java.math.BigInteger;

public class Aleph {
    Real real;
    BigInteger size;
    SetOfNaturalNumbers setOfNaturalNumbers;

    public Aleph() {
        setOfNaturalNumbers = new SetOfNaturalNumbers();
        size = setOfNaturalNumbers.getSize();
        real = new Real(true);
    }

    public BigInteger getSize() {
        return size;
    }
}
