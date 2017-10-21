// Adapter = ObjectFractonAdapter
// Target = Fractopm
// Adaptee = LongFraction
// request = Target's method =
    //getNumerator() ; getDenominator() ; add(Fraction b) ; add(int b);
    //subtract(Fraction b) ; subtract(int b) ; toString();

public class ObjectFractionAdapter implements Fraction {

    LongFraction adaptee;

    public  ObjectFractionAdapter ( LongFraction adaptee ){
        this.adaptee = adaptee;
    }

    @Override
    public int getNumerator() {
        return (int) adaptee.numerator();
    }

    @Override
    public int getDenominator() {
        return (int) adaptee.denominator();
    }

    @Override
    public Fraction add(Fraction b) {
        // public LongFraction plus(LongFraction b)
            // convert b to longFraction object
                 //  public LongFraction(long num, long den)
            // plus import LongFraction and old LongFraction
        LongFraction longB = new LongFraction(b.getNumerator() , b.getDenominator());
        LongFraction result = adaptee.plus(longB);
        // create the new adapter by result => LongFraction to Fraction
        return new ObjectFractionAdapter(result);
    }

    @Override
    public Fraction add(int b) {
        // adaptee.plus
        // LongFraction plus (long n)
        LongFraction result = adaptee.plus((long)b);
        return new ObjectFractionAdapter(result);
    }

    @Override
    public Fraction subtract(Fraction b) {
        LongFraction longB = new LongFraction(b.getNumerator() , b.getDenominator() );
        LongFraction result = adaptee.minus(longB);
        return new ObjectFractionAdapter(result);
    }

    @Override
    public Fraction subtract(int b) {
        LongFraction result = adaptee.minus((long)b);
        return new ObjectFractionAdapter(result);
    }

    public String toString(){
        return adaptee.toString();
    }

}
