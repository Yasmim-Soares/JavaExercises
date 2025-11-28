package Entities;

public class StandardFreight extends Freight {
    private Double weight;

    public StandardFreight(Double distance, Double weight) {
        super(distance);
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public Double calculateFreight() {
        return (getDistance() * 1) + (getWeight() * 1.5);
    }
}
