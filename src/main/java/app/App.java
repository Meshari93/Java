package app;

  import app.enumeratedDataTypes.Day;
  import app.enumeratedDataTypes.EnumDataType;
 import app.enumeratedDataTypes.EnumInSwitch;
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
    enumInSwitch.dayIsLike();
  }
}
