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
public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<Description> descriptions = new ArrayList<>();

        descriptions.add(new Description(getActivity().getString(R.string.museum_irvine), getActivity().getString(R.string.museum_irvine_sub), R.drawable.irvine_museum));
        descriptions.add(new Description(getActivity().getString(R.string.museum_pretend_city), getActivity().getString(R.string.museum_pretend_city_sub), R.drawable.pretend_city));

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
