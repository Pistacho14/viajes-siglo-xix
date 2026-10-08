package org.iesteis;

public class Row {

    private Integer pounds = 0;
    private Integer shillings = 0;
    private Integer pence = 0;

    public Row(Integer pounds, Integer shillings, Integer pence) {
        this.pounds = pounds;
        this.shillings = shillings;
        this.pence = pence;
    }

    public Integer getPounds() {
        return pounds;
    }

    public Integer getShillings() {
        return shillings;
    }

    public Integer getPence() {
        return pence;
    }

    public void setPounds(Integer pounds) {
        this.pounds = pounds;
    }

    public void setShillings(Integer shillings) {
        this.shillings = shillings;
    }

    public void setPence(Integer pence) {
        this.pence = pence;
    }

    @Override
    public String toString() {
        return this.pounds.toString()+ " " + this.shillings.toString() + " " + this.pence.toString();
    }
}
