public class Main {
    public static void main(String[] args) {
        Aleph aleph = new Aleph();
        SetOfNaturalNumbers setOfNaturalNumbers = new SetOfNaturalNumbers();
        Completes completes = new Completes(aleph, setOfNaturalNumbers);
        System.out.println(completes.getCompletionStatus());
    }
}
