package Impostos.entities;

public class Company extends TaxPayer {
    private Integer numEmployees;

    //Constructors
    public Company(){}

    public Company(String name, Double anualIncome, Integer numEmployees) {
        super(name, anualIncome);
        this.numEmployees = numEmployees;
    }



    //Getters e Setters
    public Integer getNumEmployees() {
        return numEmployees;
    }

    public void setNumEmployees(Integer numEmployees) {
        this.numEmployees = numEmployees;
    }



    //Metods
    @Override
    public Double taxPay() {
        if (numEmployees > 10){
            return getAnualIncome() * 0.14;
        }
        else {
            return getAnualIncome() * 0.16;
        }
    }
}
