package Impostos.entities;

public class Individual extends TaxPayer {
    private Double healthexpenditures;

    //Constructors
    public Individual(Double healthexpenditures) {}

    public Individual(String name, Double anualIncome, Double healthexpenditures) {
        super(name, anualIncome);
        this.healthexpenditures = healthexpenditures;
    }


    //Getters and Setters
    public Double getHealthexpenditures() {
        return healthexpenditures;
    }

    public void setHealthexpenditures(Double healthexpenditures) {
        this.healthexpenditures = healthexpenditures;
    }


    //Metods
    @Override
    public Double taxPay() {
        if (getAnualIncome() < 20000){
            if (healthexpenditures > 0){
                return (getAnualIncome() * 0.15) - (0.5 * healthexpenditures);
            }
            else {
                return getAnualIncome() * 0.15;
            }
        }
        else{
            if (healthexpenditures > 0){
                return (getAnualIncome() * 0.25) - (0.5 * healthexpenditures);
            }
            else {
                return getAnualIncome() * 0.25;
            }

        }
    }
}
