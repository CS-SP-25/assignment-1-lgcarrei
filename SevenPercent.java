/**
 * Tax calculator for states with 7% tax
 */
public class SevenPercent implements SalesTaxBehavior{
    @Override
    public double compute(double values) {
        return values * 0.07;
    }
}
