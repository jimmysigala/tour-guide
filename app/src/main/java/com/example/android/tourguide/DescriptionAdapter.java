package com.example.android.tourguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

/**
 * Created by Jimmy on 12/15/2016.
 */

public class DescriptionAdapter extends ArrayAdapter<Description> {

    private int mResourceId;

    public DescriptionAdapter(Activity context, ArrayList<Description> descriptions, int colorResourceId) {

        super(context, 0, descriptions);
        mResourceId = colorResourceId;
    }

    /**
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the object located at this position in the list
        Description description = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView description1 = (TextView) listItemView.findViewById(R.id.des1);
        description1.setText(description.getmDescription());

        TextView description2 = (TextView) listItemView.findViewById(R.id.des2);
        description2.setText(description.getmDescription2());

        // Find the ImageView in the list_item.xml layout with the ID version_name
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (description.hasImage()) {
            imageView.setImageResource(description.getImageResourceId());

            // display imageView
            imageView.setVisibility(View.VISIBLE);
        } else {
            // hide imageview
            imageView.setVisibility(View.GONE);
        }

        // Set the color for the list item
        View textContainer = (View) listItemView.findViewById(R.id.text_container);
        // Find the color that the resource id maps to.
        int color = ContextCompat.getColor(getContext(), mResourceId);
        // Set the background color for the text container
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout to be shown in the ListView
        return listItemView;
    }
}
