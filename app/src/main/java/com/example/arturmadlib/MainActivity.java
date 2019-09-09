package com.example.arturmadlib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendInfo(View v){

        Intent intent = new Intent(this,infoActivity.class);

        EditText myName = (EditText) findViewById(R.id.name);
        EditText myNumber = (EditText) findViewById(R.id.number);
        EditText myCountry = (EditText) findViewById(R.id.country);
        EditText myNoun = (EditText) findViewById(R.id.noun);
        EditText myRoom = (EditText) findViewById(R.id.room);
        EditText myAdj = (EditText) findViewById(R.id.adj);
        EditText myNoun2 = (EditText) findViewById(R.id.noun2);
        EditText myAnimal = (EditText) findViewById(R.id.animal);
        EditText myBp = (EditText) findViewById(R.id.bodyPart);
        EditText myVerb = (EditText) findViewById(R.id.verb);
        EditText myDate = (EditText) findViewById(R.id.date);

        String nameStr = myName.getText().toString();
        String numberStr = myNumber.getText().toString();
        String countryStr = myCountry.getText().toString();
        String nounStr = myNoun.getText().toString();
        String roomStr = myRoom.getText().toString();
        String adjStr = myAdj.getText().toString();
        String noun2Str = myNoun2.getText().toString();
        String animalStr = myAnimal.getText().toString();
        String bpStr = myBp.getText().toString();
        String verbStr = myVerb.getText().toString();
        String dateStr = myDate.getText().toString();


        if(nameStr.equalsIgnoreCase("")||numberStr.equalsIgnoreCase("")||countryStr.equalsIgnoreCase("")||nounStr.equalsIgnoreCase("")||roomStr.equalsIgnoreCase("")||adjStr.equalsIgnoreCase("")||noun2Str.equalsIgnoreCase("")||animalStr.equalsIgnoreCase("")||bpStr.equalsIgnoreCase("")||dateStr.equalsIgnoreCase("")||verbStr.equalsIgnoreCase("")){
            Toast.makeText(getApplicationContext(),"Fill in all fields properly",Toast.LENGTH_SHORT).show();
        }

        else {

            intent.putExtra(infoActivity.MY_NAME, nameStr);
            intent.putExtra(infoActivity.MY_NUMBER, numberStr);
            intent.putExtra(infoActivity.MY_COUNTRY, countryStr);
            intent.putExtra(infoActivity.MY_NOUN, nounStr);
            intent.putExtra(infoActivity.MY_NOUN2, noun2Str);
            intent.putExtra(infoActivity.MY_ROOM, roomStr);
            intent.putExtra(infoActivity.MY_ADJ, adjStr);
            intent.putExtra(infoActivity.MY_ANIMAL, animalStr);
            intent.putExtra(infoActivity.MY_BP, bpStr);
            intent.putExtra(infoActivity.MY_VERB, verbStr);
            intent.putExtra(infoActivity.MY_DATE, dateStr);

            startActivity(intent);

        }

    }


}
