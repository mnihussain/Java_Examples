package practice;

import java.io.*;

public class Serialization implements Serializable {

    public String name;
    public int roll;

    public Serialization(String name, int roll){
        this.name = name;
        this.roll = roll;
    }

    public static class ClassTest{
        public static void main(String[] args) throws IOException, ClassNotFoundException {
           // Serialization writeClass = new Serialization("Adam", 2);
            String path = "files/Names.txt";
/*            FileOutputStream outputStream = new FileOutputStream(path);
            ObjectOutputStream stream = new ObjectOutputStream(outputStream);
            stream.writeObject(writeClass);
            outputStream.close();
            stream.close();*/

            Serialization readObject = null;

            FileInputStream inputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            readObject = (Serialization) objectInputStream.readObject();
            System.out.println(readObject.name);
            System.out.println(readObject.roll);

            Object a = "new";
            Object b = 1;
            String c = (String)a;
            int d = (int)b;
            Object e = d;
        }
    }
}
