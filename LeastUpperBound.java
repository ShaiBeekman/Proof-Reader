public class LeastUpperBound {


    //There is a weird bug with this file: if you modify it, changes wont be updated.
    //But, if you change Completes, it will update LeastUpperBound, even if the change 
    //is just a single keystroke.
    
    //Still, the code is accurate and will update if you just add a println 
    //to any line of Completes.


    Aleph aleph;
    SetOfNaturalNumbers setOfNaturalNumbers;
    UpperBound upperBound;
    ArbitraryVariable y;
    boolean isLeastUpperBound;

    public LeastUpperBound(UpperBound upperBoundAleph, SetOfNaturalNumbers setOfNaturalNumbers) {
        this.upperBound = upperBoundAleph;
        this.setOfNaturalNumbers = setOfNaturalNumbers;
        y = new ArbitraryVariable(setOfNaturalNumbers);
    }

    public boolean isLeastUpperBound(UpperBound upperBoundAleph, SetOfNaturalNumbers setOfNaturalNumbers) {
        boolean yEqN = y.getSize().equals(setOfNaturalNumbers.getSize());
        boolean NEqAleph = setOfNaturalNumbers.getSize().equals(upperBoundAleph.getSize());

        if (y.isUpperBound()) {
            boolean yGeqx;
            yGeqx = (yEqN && NEqAleph);
            if (yGeqx == true) {
                isLeastUpperBound = true;
                return isLeastUpperBound;
            }
            else {
                isLeastUpperBound = false;
                return isLeastUpperBound;
            }
        } else {
            return false;
        }
    }
}


//                                                 comments
///       y is a static variable whose isUpperBound variable is always true
//        this y is automatically set to exist as an upperbound of B always; this makes y a generic upper bound. This means as well that y is a representation of every possible upper bound of B.;//is an UpperBound object
//        (y.isUpperBound == true)
//        y is always an indicator that y is actually aleph, and that, it being an arbitrary variable that has no specified value yet, it, by some law of logical entropy, must be aleph.