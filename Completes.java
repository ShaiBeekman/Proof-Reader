
public class Completes { //completes is the boolean form of the complete function. completes is also a function. so completes runs after complete runs (or is equivalent words to 'runs',--completes is 'evaluated').

    Aleph aleph;
    SetOfNaturalNumbers setOfNaturalNumbers;
    boolean aCompletesB;

    public Completes(Aleph aleph, SetOfNaturalNumbers setOfNaturalNumbers) {

        this.aleph = aleph;
        this.setOfNaturalNumbers = setOfNaturalNumbers;

        UpperBound potentialUpperBoundAleph = new UpperBound(aleph, setOfNaturalNumbers);
        LeastUpperBound potentialLeastUpperBoundAleph;
        potentialLeastUpperBoundAleph = new LeastUpperBound(potentialUpperBoundAleph, this.setOfNaturalNumbers);
        if (potentialUpperBoundAleph.isUpperBound()) {
            if (potentialLeastUpperBoundAleph.isLeastUpperBound(potentialUpperBoundAleph, setOfNaturalNumbers)) {
                aCompletesB = true;
            } else {
                aCompletesB = false;
            }
        } else {
            aCompletesB = false;
        }
    }

    public boolean getCompletionStatus() {
        return aCompletesB;
    }
}
