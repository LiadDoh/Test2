package q1;

public class Citizen {

    private String name;
    private long id;

    public Citizen(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public void changeId() {
        long digit = this.id % 10;
        long tensDigit = (this.id / 10) % 10;
        long newId = (long) (this.id / Math.pow(10, tensDigit));
        long secondHalf = (long) (this.id % Math.pow(10, tensDigit));
        newId = newId * 10 + digit;
        newId = (long) (newId * Math.pow(10, tensDigit) + secondHalf);
        setId(newId);
    }
}

