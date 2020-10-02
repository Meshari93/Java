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
    // Using valueOf()

    }
}


