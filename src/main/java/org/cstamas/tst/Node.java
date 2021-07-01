package org.cstamas.tst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Node
{
  private final List<Node> children;

  public Node(Node... children) {
    this.children = new ArrayList<>(Arrays.asList(children));
  }

  public void render() {

  }
}
