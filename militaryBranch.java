public class militaryBranch {
    private String type;
    private String name;

    public void setBranch(String t, String n) {
        this.type = t;
        this.name = n;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("Type: " + getType());
        System.out.println("Name: " + getName());
    }
}