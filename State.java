import java.util.Locale;

/**
 * A class that represents a state from a nation
 */
public class State implements SalesTaxBehavior{
    // Data fields
    private String name;
    private SalesTaxBehavior taxBehavior;

    //getters/setters and constructor
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public State(String name){
        this.name = name;
    }

    public void setTaxBehavior(SalesTaxBehavior taxBehavior){
        this.taxBehavior= taxBehavior;
    }

    // other methods
    /**
     * Displays the tax
     *
     * @param value the value to be used
     */
    public void showTax(double value){
        System.out.printf(Locale.US, "The sales tax on $%.2f in %s is $%.2f. %n", value, this.getName(), this.compute(value));
    }

    /**
     * Given values, computes the tax
     *
     * @param values amount on which tax are calculated
     * @return the tax
     */
    @Override
    public double compute(double values) {
        return this.taxBehavior.compute(values);
    }
}
