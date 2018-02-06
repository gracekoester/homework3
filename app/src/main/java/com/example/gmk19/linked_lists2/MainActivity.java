package com.example.gmk19.linked_lists2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button front;
    private Button end;
    private ScrollView scrollview;
    public Text inputNum;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinkedList ll = new LinkedList();
        ll.addFront(2);
        ll.addFront(5);
        ll.addFront(7);
        ll.addEnd(9);
        ll.display();

        this.front = (Button)this.findViewById(R.id.front);
        this.end = (Button)this.findViewById(R.id.end);
        this.scrollview = (ScrollView)this.findViewById(R.id.scrollview);
        this.inputNum = (Text)this.findViewById(R.id.inputNum);


    }

    public void onButtonPressed(View v)
    {
        if(v == this.front)
        {
            ll.addFront(inputNum);
            String enterNum = this.inputNum.getText().toString();
            ScrollView scrollView = new ScrollView(this);
            this.scrollview.addView(scrollView, 0);
            scrollView(this.inputNum.getText().toString());
        }
        else
        {
            ll.addFront(inputNum);
            String enterNum = this.inputNum.getText().toString();
            ScrollView scrollView = new ScrollView(this);
            this.scrollview.addView(scrollView, 0);
            scrollView(this.inputNum.getText().toString());
        }
    }
}
