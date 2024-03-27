package PrototypeMode;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Prototype implements Cloneable{
  public String name;

  public Prototype() {
  }

  public Object clone() {
    Prototype clone = null;
    try{
      clone = (Prototype) super.clone();
    }
    catch (CloneNotSupportedException e) {
      System.out.println("clone failed");
    }
    return clone;
  }

  // TODO:
  public Object deepClone() throws IOException, ClassNotFoundException {
    ByteArrayOutputStream bao = new ByteArrayOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(bao);
    oos.writeObject(this);

    ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
    ObjectInputStream ois = new ObjectInputStream(bis);
    return (ois.readObject());
  }

  public void setName(String _name) {
    name = _name;
  }

  public void show() {
    System.out.println("Prototype show");
  }
}
