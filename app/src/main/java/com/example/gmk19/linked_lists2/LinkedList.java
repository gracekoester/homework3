package com.example.gmk19.linked_lists2;

import android.content.Context;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by gmk19 on 2/6/2018.
 */

public class LinkedList
{
    private Node userIndex;
    private Node head;
    private ViewGroup linkedListContainer;
    private Context theContext;

    public LinkedList(ViewGroup linkedListContainer, Context theContext)
    {
        this.head = null;
        this.linkedListContainer = linkedListContainer;
        this.theContext = theContext;
        this.userIndex = userIndex;
    }

    public int removeFront() throws Exception
    {
        //removes the front of the linked list, and updates the interface
        //and ultimately returns the int payload of the node that was removed.
        if(this.head != null)
        {
            Node node2Remove = this.head;
            this.head = this.head.getNextNode();
            node2Remove.setNextNode(null);
            this.linkedListContainer.removeViewAt(0); // removes the view at 0
            return node2Remove.getPayload();
        }
        else
        {
            Toast.makeText(this.theContext, "List is Empty", Toast.LENGTH_SHORT).show();
            throw new Exception("Empty List");
        }
    }

    public int removeEnd() throws Exception
    {

        if(this.head != null)
        {
            //traverse the list to find the node right before the last node
            Node node2Remove = this.head;
            while(node2Remove.getNextNode() != null)
            {
                node2Remove = node2Remove.getNextNode();
            }

            if(node2Remove == this.head)
            {
                //we have a one list
                this.head = null;
            }
            else
            {
                Node prevNode = this.head;
                while(prevNode.getNextNode() != node2Remove)
                {
                    prevNode = prevNode.getNextNode();
                }
                //prevNode points to the node right before node2Remove
                prevNode.setNextNode(null);

            }
            this.linkedListContainer.removeViewAt(this.linkedListContainer.getChildCount()-1);
            return node2Remove.getPayload();
        }
        else
        {
            //we have an empty list
            Toast.makeText(this.theContext,"Empty List", Toast.LENGTH_SHORT).show();
            throw new Exception("Empty List");
        }
    }

    public int removeAtIndex(int temp)
    {
        Node node2remove = this.head;
        int count = 0;
        while(node2remove.getNextNode() != temp);
        {
            node2remove = node2remove.getNextNode();
            count = count + 1;

        }
        if(node2remove == temp)
        {
            this.linkedListContainer.removeViewAt(this.linkedListContainer.indexOfChild()-1);
        }

    }

    public void addAtIndex(int temp)
    {
        Node nextNode = head;
        int index = temp;
        int count = 0;
        while(count != temp)
        {
            count = count + 1;
        }
        if(nextNode == index)
        {
            this.nextNode == inputIndex;
        }


    }

    public void addFront(int payload)
    {
        Node n = new Node(payload);

        //add to front of list
        if(this.head == null)
        {
            this.head = n;
        }
        else
        {
            //not dealing with the empty list
            n.setNextNode(this.head);
            this.head = n;
        }

        //update the interface
        TextView tv = new TextView(this.theContext);
        tv.setText("" + payload);
        tv.setGravity(Gravity.CENTER);
        this.linkedListContainer.addView(tv,0);
    }

    public void addEnd(int payload)
    {
        if(this.head == null)
        {
            this.addFront(payload);
        }
        else
        {
            this.head.addEnd(payload);
            /*
            Node n = new Node(payload);
            Node currNode = this.head;
            while(currNode.getNextNode() != null)
            {
                currNode = currNode.getNextNode();
            }
            //currnode is sitting at the last node
            currNode.setNextNode(n);
            */

            //update the interface
            TextView tv = new TextView(this.theContext);
            tv.setText("" + payload);
            tv.setGravity(Gravity.CENTER);
            this.linkedListContainer.addView(tv);
        }
    }

    public void display()
    {
        if(this.head == null)
        {
            System.out.println("Empty List");
        }
        else
        {
            //do stuff here
            this.head.display();
            System.out.println("");
            /*
            String answer = "";
            Node currNode = this.head;
            while(currNode != null)
            {
                answer = answer + currNode.getPayload() + " -> ";
                currNode = currNode.getNextNode();
            }
            System.out.println(answer);
            */

        }
    }
}