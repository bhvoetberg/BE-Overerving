package nl.novi.javaprogrammeren.overerving;

public class Wild {
    private int cage;
    private String lastFed;
    private String country;

    public Wild(int cage, String lastFed, String country) {
        this.cage = cage;
        this.lastFed = lastFed;
        this.country = country;
    }

    public int getCage() {
        return cage;
    }

    public void setCage(int cage) {
        this.cage = cage;
    }

    public String getLastFed() {
        return lastFed;
    }

    public void setLastFed(String lastFed) {
        this.lastFed = lastFed;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
