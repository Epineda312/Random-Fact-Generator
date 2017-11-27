package com.example.syrup.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    //Declare our View variables
    private TextView factTextView;
    private Button showFactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        /* *** GOAL: Assign the Views from the layout file to the corresponding variables *** */

        // old versions of android require type casting: showFactButton factTextView =(TextView)findViewById(R.id.factTextView);
        factTextView = findViewById(R.id.factTextView);
        // old versions of android require type casting: showFactButton = (Button)findViewById(R.id.showFactButton)
        showFactButton = findViewById(R.id.showFactButton);

        /* *** GOAL: Set button to iterate through random facts with every click *** */

        //Set on click Listener
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               //Create array to hold facts(strings)
                //Load Array with facts
                String[] facts = {
                  /*0*/      "Ants stretch when they wake up in the morning.",
                  /*1*/      "Ostriches can run faster than horses.",
                  /*2*/      "Olympic gold medals are actually made mostly of silver.",
                  /*3*/      "You are born with 300 bones; by the time you are an adult you will have 206.",
                  /*4*/      "It takes about 8 minutes for light from the Sun to reach Earth.",
                  /*5*/      "Some bamboo plants can grow almost a meter in just one day.",
                  /*6*/      "The state of Florida is bigger than England.",
                  /*7*/      "Some penguins can leap 2-3 meters out of the water.",
                  /*8*/      "On average, it takes 66 days to form a new habit.",
                  /*9*/      "Mammoths still walked the earth when the Great Pyramid was being built.",
                  /*10*/     "Monkeys open bananas from the bottom"
                     };

                //The button was clicked, so update the fact TextView with a new fact
                //Randomly select a fact
                Random randomGenerator = new Random();

                /* Instead of hardcoding a range of numbers it is set to the String arrays length.
                   ex. int randomNumber = ...nextInt( n: 10); is now ....nextInt(facts.length);
                   *
                   using the property array means the right # of elements will always be passed in
                   + protection from errors. (i.e delete an element, call upon non existing element, = crash)
                 */
                int randomNumber = randomGenerator.nextInt(facts.length);
                String fact = facts[randomNumber];

                //Update the screen with our new fact
                factTextView.setText(fact);
            }
        };
        showFactButton.setOnClickListener(listener);
    }
}
