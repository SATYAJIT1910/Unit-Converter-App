
package com.satyajitGhosh.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
/**
 * @author Satyajit Ghosh
 * @since 31-10-2021
 * */

public class MainActivity extends AppCompatActivity {

// This code init the variables
    private Button SubmitBtn;
    private EditText textBox;
    private TextView myTextView;
    /////



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // This codes used to connect the GUI with Java backend
        SubmitBtn=findViewById(R.id.SubmitButton);
        textBox=findViewById(R.id.inputField);
        myTextView=findViewById(R.id.resultView);
        ////

        SubmitBtn.setOnClickListener(new View.OnClickListener() { // This code is used to listen onclick event . It is an interface.
            @Override
            public void onClick(View v) {  // The code written inside will execute on the button click.
                try{ // This is for exception handling in case user provide a unsuitable input to the program , then to avoid program crash this is required .
                String s=textBox.getText().toString(); // It takes the user provided input as string
                int kilo=Integer.parseInt(s);  // It converts the string to integer

                double pounds=kilo*2.205; // It converts the kilo to pound

                    DecimalFormat df = new DecimalFormat("#.##"); // This is to format the value at output 2-decimal point precision only

                myTextView.setText("The Pound Value is "+df.format(pounds)); // After calculation this code shows the value to text View
                }catch (Exception e){
                    myTextView.setText("Cannot calculate this . Error"); // This will be visible on place of result if the calculation cannot be done for reason like overflow.
                }



            }
        });


    }
}