package app.Chapter2;

public class Array {

  void array() {
    char[] c;
    c = new char[3];
    int[] i = new int[3];

    String str[] = {"welcome", "to", "Java."};

    c[0] = 'A';
    c[1] = 'B';
    c[2] = 'C';

    i[0] = 100;
    i[1] = 200;
    i[2] = 300;

    System.out.println("strのサイズ:" + str.length);
    System.out.println("c[0] : " + c[0]);
    System.out.println("i[1] : " + i[1]);
  }
}
