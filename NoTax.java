/**
 * Tax calculator for states with 0% tax
 */
public class NoTax implements SalesTaxBehavior{
    @Override
    public double compute(double values) {
        return values * 0.0;
    }
}
