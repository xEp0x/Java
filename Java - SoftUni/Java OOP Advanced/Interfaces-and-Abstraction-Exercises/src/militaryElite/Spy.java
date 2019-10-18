package militaryElite;


public class Spy extends Soldier implements ISpy {

    private int codeNumber;

    public Spy(String id, String firstName, String lastName, int codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public int getCodeNumber() {
        return this.codeNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "\r\nCode Number: " + this.codeNumber;
    }
}
