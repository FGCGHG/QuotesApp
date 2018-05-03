package com.thinkinnovation.munguriek.quotesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class QuotesActivity extends AppCompatActivity {

    String[] nameArray = {
            "Kevin Kruse",
            "Napoleon Hill",
            "Albert Einstein",
            "Robert Frost",
            "Florence Nightingale",
            "Wayne Gretzky",
            "Amelia Earhart",
            "Babe Ruth",
            "W. Clement Stone",
            "Kevin Kruse",
            "John Lennon",
            "Earl Nightingale",
            "Charles Swindoll",
            "Buddha",
            "Socrates",
            "Woody Allen"
    };
    String[] detailsArray = {
            "Life is about making an impact, not making an income.",
            "Whatever the mind of man can conceive and believe, it can achieve",
            "Strive not to be a success, but rather to be of value.",
            "Two roads diverged in a wood, and I—I took the one less traveled by, And that has made all the difference",
            "I attribute my success to this: I never gave or took any excuse. ",
            "You miss 100% of the shots you don’t take.",
            "The most difficult thing is the decision to act, the rest is merely tenacity",
            "Every strike brings me closer to the next home run",
            "Definiteness of purpose is the starting point of all achievement.",
            "Life isn't about getting and having, it's about giving and being. ",
            "Life is what happens to you while you’re busy making other plans.",
            "We become what we think about.",
            "Life is 10% what happens to me and 90% of how I react to it.",
            "The mind is everything. What you think you become.",
            "An unexamined life is not worth living",
            "Eighty percent of success is showing up"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);

        Button settingsBtn = findViewById(R.id.settings);
        settingsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        QuotesAdapter quotesAdapter = new QuotesAdapter(this, nameArray, detailsArray);

        ListView listView = findViewById(R.id.listViewID);
        listView.setAdapter(quotesAdapter);
    }
}
