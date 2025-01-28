/**
 * Main class to calculate sales tax based on state and sale amount
 */
public class SalesTaxCalculator {
    /**
     * Main method to process command-line arguments and calculate sales tax
     *
     * @param args Command-line arguments:
     *             args[0] - State name (Indiana or Alaska)
     *             args[1] - Sale amount
     */
    public static void main(String[] args) {
        // Check correctness of command line arguments
        if (args.length != 2) {
            System.out.println("Usage: java SalesTaxCalculator <state> <sale_amount>");
            System.exit(1);
        }

        // get state name and sale amount
        String stateName = args[0];
        double saleAmount;

        // check sale amount input
        try {
            saleAmount = Double.parseDouble(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid sale amount. Please provide a valid number.");
            System.exit(1);
            return;
        }

        // create state object based on input - set behavior dynamically after state is identified
        State state;
        switch (stateName) {
            case "Hawaii":
                state = new Hawaii();
                state.setTaxBehavior(new FourAndHalfPercent());
                break;
            case "Indiana":
                state = new Indiana();
                state.setTaxBehavior(new SevenPercent());
                break;
            case "Alaska":
                state = new Alaska();
                state.setTaxBehavior(new NoTax());
                break;
            default:
                System.out.println("Invalid state. Please choose Indiana or Alaska.");
                System.exit(1);
                return;
        }

        // calculate and display sales tax
        state.showTax(saleAmount);
    }
}
