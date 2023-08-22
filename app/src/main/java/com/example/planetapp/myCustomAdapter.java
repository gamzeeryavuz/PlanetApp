package com.example.planetapp;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class myCustomAdapter extends ArrayAdapter<Planet> {


    // using Custom Layouts --> MyCustomAdapter
    // Using Custom Objects --> extends ArrayAdapter<Planet>

    private ArrayList<Planet>   planetsArrayList;
    Context context;


    public myCustomAdapter(ArrayList<Planet> planetsArrayList,Context context){
        super(context,R.layout.item_list_layout,planetsArrayList);
        this.planetsArrayList=planetsArrayList;
        this.context=context;


    }


    private static class myViewHolder{

        TextView planetName;
        TextView moonCount;
        ImageView planetImg;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // get the planet object for the current position

        Planet planets = getItem(position);


        //2- Inflate Layout
        myViewHolder myViewHolder;

        final View result;
        if (convertView == null) {

            myViewHolder = new myViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(
                    R.layout.item_list_layout,
                    parent,
                    false
            );
            //Finding Views

            myViewHolder.planetName = (TextView) convertView.findViewById(R.id.planet_name);
            myViewHolder.moonCount = (TextView) convertView.findViewById(R.id.moon_count);
            myViewHolder.planetImg = (ImageView) convertView.findViewById(R.id.imageView);


            result = convertView;

            convertView.setTag(myViewHolder);


        } else {
            // the view is recycled
            myViewHolder = (myViewHolder) convertView.getTag();
            result = convertView;

            myViewHolder.planetName.setText(planets.getPlanetName());
            myViewHolder.moonCount.setText(planets.getMoonCount());
            myViewHolder.planetImg.setImageResource(planets.getPlanetImage());
            return convertView;





        }
        return convertView;
    }
}
