package simplecsproject;

import unit4.collectionsLib.Node;

public class Main {
  
  private Main() {}

  public static void main(String... args) {
    Node<Integer> list = new Node<>(3, new Node<>(5, new Node<>(7)));


    // print list
    Node<Integer> currentNode = list;

    System.out.print(currentNode.getValue());

    while (currentNode.hasNext()) {
      currentNode = currentNode.getNext();
      System.out.print("->" + currentNode.getValue());
    }

    System.out.println();

  }
}
