package employee.model;

public class SaleManager extends Employee {
    private double saleValue;
    private double percent;

    public SaleManager(int id, String firstName, String lastName, double hours, double saleValue, double percent) {
        super(id, firstName, lastName, hours);
        this.saleValue = saleValue;
        this.percent = percent;
    }

    public double getSaleValue() {
        return saleValue;
    }

    public void setSaleValue(double saleValue) {
        this.saleValue = saleValue;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public double calcSalary(){
        return saleValue * percent;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append(", salary ").append(calcSalary());

        return sb.toString();
    }
}
