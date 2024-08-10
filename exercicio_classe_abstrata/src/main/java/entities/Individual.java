package entities;

public class Individual extends TaxPayer {

    private Double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        double result = 0.0;
        if (super.getAnualIncome() <= 20000.00) {
            result = (getAnualIncome() * 0.15) - (healthExpenditures * 0.50);
        } else {
            result = (getAnualIncome() * 0.25) - (healthExpenditures * 0.50);
        }
        return result;
    }

    public String toString() {
        return getName() + ":" + " $ " + String.format("%.2f%n", tax());
    }

}
