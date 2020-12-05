package org.tweeted.designpatterns;

import org.tweeted.designpatterns.singleton.seriable.SerializeSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author tweeted
 * @date 2020/11/29 15:37
 */
public class SerializeSingletonTest {
     public static void main(String[] args) {

        SerializeSingleton s1 = null;
        SerializeSingleton s2 = SerializeSingleton.getInstance();

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();


            FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (SerializeSingleton)ois.readObject();
            ois.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
