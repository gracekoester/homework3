package com.example.gmk19.linked_lists2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText newNumberET;
    private EditText inputIndex;
    //private Button addFrontButton;
    //private Button addEndButton;
    private ViewGroup linkedListContainer;
    private LinkedList ll;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.newNumberET = (EditText)this.findViewById(R.id.newNumberET);
        this.inputIndex = (EditText)this.findViewById(R.id.inputIndex);
        //this.addFrontButton = (Button)this.findViewById(R.id.addFrontButton);
        //this.addEndButton = (Button)this.findViewById(R.id.addEndButton);
        this.linkedListContainer = (ViewGroup)this.findViewById(R.id.linkedListContainer);

        this.ll = new LinkedList(this.linkedListContainer, this);
        this.ll.display();
    }



    public void addFrontButtonClicked(View v)
    {
        String temp = this.newNumberET.getText().toString();
        this.newNumberET.setText("");
        this.ll.addFront(Integer.parseInt(temp));
        //this.ll.display();
    }

    public void addEndButtonClicked(View v)
    {
        String temp = this.newNumberET.getText().toString();
        this.newNumberET.setText("");
        this.ll.addEnd(Integer.parseInt(temp));
        //this.ll.display();
    }

    public void addAtIndexButtonClicked(View v)
    {
        String temp = this.inputIndex.getText().toString();
        this.ll.addAtIndex(Integer.parseInt(temp));
    }

    public void removeAtIndexButtonClicked(View v)
    {
        String temp = this.inputIndex.getText().toString();
        this.ll.removeAtIndex(Integer.parseInt(temp));
    }

    public void removeFrontButtonClicked(View v)
    {
        try
        {
            int value = this.ll.removeFront();
            //do stuff with that element
            this.ll.display();
        }
        catch(Exception e)
        {
            System.err.println("Empty List");
        }
    }

    public void removeEndButtonClicked(View v)
    {
        try
        {
            int value = this.ll.removeEnd();
            this.ll.display();
        }
        catch(Exception e){}

    }
}