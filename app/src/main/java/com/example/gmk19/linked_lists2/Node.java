package com.example.gmk19.linked_lists2;

/**
 * Created by gmk19 on 2/6/2018.
 */

public class Node {
    private int payload;
    private Node nextNode;

    public Node(int payload)
    {
        this.payload = payload;
        this.nextNode = null;
    }

    public void addEnd(int payload)
    {
        if(this.nextNode == null)
        {
            this.nextNode = new Node(payload);
        }
        else
        {
            this.nextNode.addEnd(payload);
        }
    }
    public void display()
    {
        System.out.print(this.payload + " -> ");
        if(this.nextNode != null)
        {
            this.nextNode.display();
        }
    }

    public int getPayload()
    {
        return this.payload;
    }

    public Node getNextNode()
    {
        return this.nextNode;
    }

    public void setNextNode(Node n)
    {
        this.nextNode = n;
    }
}