import java.util.ArrayList;

public class familyTree {
    // This is a node which represents a member of the family.
    public static class PersonNode {
        // data members
        String     name;    // Name of the person
        int        birth;   // Year of birth
        int        death;   // Year of death
        boolean    alive;
        ArrayList<PersonNode> connections = new ArrayList<PersonNode>();
        String     relationship;

        // methods
        // DisplayInfo method displays the attributes of the person node.
        public void displayInfo() {
            System.out.println("Name: " + this.name);
            if (this.alive) {
                System.out.println(this.birth);
            }
            else {
                System.out.println(this.birth + " - " + this.death);
            }
            System.out.println("Relationship: " + this.relationship);
        }
        // This is the method to connect me (this) to another node. It specifies the relationship type between me (this) and the other node.
        public void connect(PersonNode node, String relationship) {
            // Add the PersonNode to the connection array
            connections.add(node);
            this.relationship = relationship;
        }
    } // public class PersonNode {

    // This is the main function to create the family tree
    public static void main(String[] args) {
        PersonNode mom = new PersonNode();
        mom.name = "Mrs. Gump";
        mom.birth = 1900;
        mom.death = 1990;
        mom.alive = false;
   
        PersonNode forrest = new PersonNode();
        forrest.name = "Forrest Gump";
        forrest.birth = 1944;
        forrest.alive = true;

        mom.connect(forrest, "Parent");
        forrest.connect(mom, "Child");

        mom.displayInfo();
        forrest.displayInfo();

        PersonNode jenny = new PersonNode();
        jenny.name = "Jenny Curan";
        jenny.birth = 1945;
        jenny.alive = false;
        jenny.death = 1982;

        forrest.connect(jenny, "Wife");
        jenny.connect(forrest, "Husband");

        jenny.displayInfo();
        forrest.displayInfo();

        PersonNode child = new PersonNode();
        child.name = "Forrest";
        child.birth = 1979;
        child.alive = true;

        child.connect(jenny, "Child");
        child.connect(forrest, "Child");
        jenny.connect(child, "Parent");
        forrest.connect(child, "Parent");

        child.displayInfo();
    } // public static void main(string[] args) {
} // public class familyTree {