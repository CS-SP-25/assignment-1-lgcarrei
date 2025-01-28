public class FourAndHalfPercent implements SalesTaxBehavior{
    @Override
    public double compute(double values) {
        return values * 0.045;
    }
}
