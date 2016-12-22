package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<Description> descriptions = new ArrayList<>();

        descriptions.add(new Description(getActivity().getString(R.string.park_mike), getActivity().getString(R.string.park_mike_sub), R.drawable.mike_park));
        descriptions.add(new Description(getActivity().getString(R.string.park_bill), getActivity().getString(R.string.park_bill_sub), R.drawable.bill_barber_park));
        descriptions.add(new Description(getActivity().getString(R.string.park_shade), getActivity().getString(R.string.park_shade_sub), R.drawable.sweet_shade_park));
        descriptions.add(new Description(getActivity().getString(R.string.park_mason), getActivity().getString(R.string.park_mason_sub), R.drawable.mason_park));

        DescriptionAdapter adapter = new DescriptionAdapter(getActivity(), descriptions, R.color.category_colors);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Description des = descriptions.get(position);
            }
        });

        return rootView;
    }

}
