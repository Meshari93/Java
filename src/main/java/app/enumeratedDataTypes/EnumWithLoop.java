package app.enumeratedDataTypes;

// Java programing to demonstrate working of values() ordinal() and valueOf()

public class EnumWithLoop {
    public void enumWithLoop(){
    //Calling vallues
    Color arr[] = Color.values();

    //enum with loop
    for( Color color : arr){
      // Calling ordinal() to find index of color.
      System.out.println(color + "a index " + color.ordinal());
    }
    // Using valueOf(). Returns an object of Color with given constant
    // Uncommenting second line causes exception IllegalArgumentException

        System.out.println(Color.valueOf("RED"));

    }
}


