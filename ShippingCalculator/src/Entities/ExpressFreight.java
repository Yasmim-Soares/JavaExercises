package Entities;

public class ExpressFreight extends Freight{
    private  Double insuranceValue;

    public ExpressFreight(Double distance, Double insuranceValue) {
        super(distance);
        this.insuranceValue = insuranceValue;
    }

    public Double getInsuranceValue() {
        return insuranceValue;
    }

    public void setInsuranceValue(Double insuranceValue) {
        this.insuranceValue = insuranceValue;
    }

    @Override
    public Double calculateFreight() {
        return (getDistance() * 2.5) + (getInsuranceValue() * 0.03);
    }
}
