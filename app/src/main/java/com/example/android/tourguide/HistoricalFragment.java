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
public class HistoricalFragment extends Fragment {

    public HistoricalFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<Description> descriptions = new ArrayList<>();

        descriptions.add(new Description(getActivity().getString(R.string.historic_ranch),getActivity().getString(R.string.historic_ranch_sub), R.drawable.mike_ward_park));
        descriptions.add(new Description(getActivity().getString(R.string.historic_watson), getActivity().getString(R.string.historic_watson_sub), R.drawable.watson_bridge));
        descriptions.add(new Description(getActivity().getString(R.string.historic_hall), getActivity().getString(R.string.historic_hall_sub), R.drawable.scgneuderman_hall));
        descriptions.add(new Description(getActivity().getString(R.string.historic_northwood), getActivity().getString(R.string.historic_northwood_sub), R.drawable.northwood_gratitude));

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
