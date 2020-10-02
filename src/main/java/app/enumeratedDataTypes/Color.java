package app.enumeratedDataTypes;

// Java program to demonstrate that enums can have constructor and concrete methods.
// An enum (Note enum keyword inplace of class keyword)
public enum Color {
    RED,
    GREEN,
    BLUE;
    // enum constructor called separately for each constant
    private Color() {
    System.out.println("Constructor called for : " + this.toString());

    }
    public void colorInfo(){
    System.out.println("Universal Color");

    }
}
