// Adapter = ObjectFractionAdapter
// Target = Fraction
// Adaptee = LongFraction
// request = Target's method =
    //getNumerator() ; getDenominator() ; add(Fraction b) ; add(int b);
    //subtract(Fraction b) ; subtract(int b) ; toString();

public class ClassFractionAdapter extends LongFraction implements Fraction {

    //public LongFraction(long num, long den)
    public ClassFractionAdapter( long num , long den ){
        super(num , den);
    }

    @Override
    public int getNumerator() {
        return (int) numerator_;
    }

    @Override
    public int getDenominator() {
        return (int)denominator_ ;
    }

    @Override
    public Fraction add(Fraction b) {
        // public LongFraction plus(LongFraction b)
            // convert b to longFraction object
                 //  public LongFraction(long num, long den)
            // create new LongFraction and receive para
            // plus new LongFraction to itself and save to new LongFraction
        LongFraction longB = new LongFraction(b.getNumerator() , b.getDenominator() );
        LongFraction result = plus(longB);
        return new ClassFractionAdapter(result.numerator() , result.denominator() );
    }

    @Override
    public Fraction add(int b) {
        LongFraction result = plus(b);
        return new ClassFractionAdapter(result.numerator(), result.denominator() );
    }

    @Override
    public Fraction subtract(Fraction b) {
        LongFraction longB = new LongFraction(b.getNumerator() , b.getDenominator());
        LongFraction result = minus(longB);
        return new ClassFractionAdapter(result.numerator() , result.denominator() );
    }

    @Override
    public Fraction subtract(int b) {
        LongFraction result = minus(b);
        return new ClassFractionAdapter(result.numerator(), result.denominator() );
    }


}
