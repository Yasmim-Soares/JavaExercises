package Entities;

public abstract class Freight {
    private Double distance;

    public Freight(Double distance) {
        this.distance = distance;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public abstract Double calculateFreight();
}
