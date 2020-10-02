package app.javaBasics;
// Java program to demonstrate byte data type in Java

public class DataType {
  public void dataTypeByte() {
    byte a = 126;

    // byte is 8 bit value
    System.out.println(" byte a : 126" + a);

    a++;
    System.out.println(" byte a : 127" + a);

    // It overflows here because
    // byte can hold values from -128 to 127
    a++;
    System.out.println(" byte a : 128" + a);

    // Looping back within the range
    a++;
    System.out.println(" byte a : 128" + a);
  }
  // Java programing to demonstrate primitive data types in Java
  public void primitiveDataType() {
    // declaring character
    char a = 'G';

    // Integer data type is generally used for numeric values
    int i = 98;

    // use byte and short if memory is a constraint
    byte b = 4;

    // this will give error as number is larger than range byte b1 = 7888888955;

    short s = 56;
    // this will give error as number is larger than byte range short s1 = 87878787878;

    // by default fraction value is double in java
    double d = 4.355453532;

    // for float use 'f' as suffix
    float f = 4.7333434f;

    System.out.println("char: " + a);
    System.out.println("integer: " + i);
    System.out.println("byte: " + b);
    System.out.println("short: " + s);
    System.out.println("float" + f);
    System.out.println("double" + d);
  }
}
