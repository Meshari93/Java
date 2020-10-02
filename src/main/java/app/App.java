package app;

  import app.enumeratedDataTypes.*;
  import app.javaBasics.DataType;
 import javafx.scene.control.IndexRange;


public class App {

    public static void main(String[] args) {
    DataType dataType = new DataType();
    //    dataType.dataTypeByte();
    //    dataType.primitiveDataType();
    // ---------------------\
    EnumDataType enumDataType = new EnumDataType();
    //enumDataType.enumDataType();

      String str = "MONDAY";
    EnumInSwitch enumInSwitch = new EnumInSwitch(Day.valueOf(str));
//    enumInSwitch.dayIsLike();
        EnumWithLoop enumWithLoop = new EnumWithLoop();
//        enumWithLoop.enumWithLoop();

        Color color = Color.RED;
    System.out.println("color = " + color);
    color.colorInfo();
    }
}
