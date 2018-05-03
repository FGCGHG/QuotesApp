package com.thinkinnovation.munguriek.quotesapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class QuotesAdapter extends ArrayAdapter {
    //to reference the activity
    private final Activity context;



    private String[] nameArray;

    private String[] detailsArray;

    public QuotesAdapter(Activity context, String[] nameParam, String[] infoParam){
        super(context, R.layout.listview_row, nameParam);
        this.context = context;
        this.nameArray = nameParam;
        this.detailsArray = infoParam;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.listview_row, null, true);

        TextView nameTextView = rowView.findViewById(R.id.nameTextViewID);
        TextView detailTextView = rowView.findViewById(R.id.infoTextViewID);

        nameTextView.setText(nameArray[position]);
        detailTextView.setText(detailsArray[position]);

        Animation animation = AnimationUtils.loadAnimation(context, R.anim.slide_left);
        rowView.startAnimation(animation);

        return rowView;
    }
}
