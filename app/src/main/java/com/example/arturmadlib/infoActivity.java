package com.example.arturmadlib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class infoActivity extends AppCompatActivity {

    public static final String MY_NAME = "[name]";
    public static final String MY_NUMBER = "[number]";
    public static final String MY_COUNTRY = "[country]";
    public static final String MY_ADJ = "[adjective]";
    public static final String MY_NOUN = "[noun1]";
    public static final String MY_NOUN2 = "[noun2]";
    public static final String MY_BP = "[body part]";
    public static final String MY_ROOM = "[room]";
    public static final String MY_ANIMAL = "[animal]";
    public static final String MY_VERB = "[verb]";
    public static final String MY_DATE = "[date]";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Intent intent = getIntent();
        String myName = intent.getStringExtra(MY_NAME);
        String myNumber = intent.getStringExtra(MY_NUMBER);
        String myDate = intent.getStringExtra(MY_DATE);
        String myCountry = intent.getStringExtra(MY_COUNTRY);
        String myAdj = intent.getStringExtra(MY_ADJ);
        String myBp = intent.getStringExtra(MY_BP);
        String myNun = intent.getStringExtra(MY_NOUN);
        String myNoun2 = intent.getStringExtra(MY_NOUN2);
        String myRoom = intent.getStringExtra(MY_ROOM);
        String myAnimal = intent.getStringExtra(MY_ANIMAL);
        String myVerb = intent.getStringExtra(MY_VERB);

        String strToDisplay = myName + " is really " + myAdj + " because all he does is " + myVerb + " all day. ";
        strToDisplay += "Even though " + myName + " literally has 0 friends, but his favorite holiday is here, " + myDate + "! ";
        strToDisplay += "Last year, he got a " + myNun + " as his only present from his parents. ";
        strToDisplay += "In the morning, " + myName + " got out of his bed and went to the " + myRoom + " to open his present. ";
        strToDisplay += "There was no present though, but behind the " + myNoun2 + " in the kitchen, there was a small " + myBp +  " sticking out of a box. " ;
        strToDisplay += myName + " ran over to the box and saw a " + myCountry + " " + myAnimal + " in the box. ";
        strToDisplay += myName + " named his new pet 'Friend' and this " + myAnimal + " would end up being " + myName + "'s friend for the next " + myNumber + " years.";
                TextView str = (TextView) findViewById(R.id.info);
        str.setText(strToDisplay);
    }

    public void shareInfo(View v){

        TextView display = (TextView) findViewById(R.id.info);

        String displayStr = display.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, displayStr);
        String chooserTitle = "Choose a cool app to send this story to!";
        //String chooserTitle = getString(R.string.chooser);
        Intent chosenIntent = Intent.createChooser(intent,chooserTitle);
        startActivity(chosenIntent);

    }

    public void goBack(View v){

        Intent intent = new Intent(this,MainActivity.class);

        startActivity(intent);

    }

}
