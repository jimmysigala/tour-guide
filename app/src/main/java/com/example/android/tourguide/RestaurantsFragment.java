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
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<Description> descriptions = new ArrayList<>();

        descriptions.add(new Description(getActivity().getString(R.string.eat_fish_grill), getActivity().getString(R.string.eat_fish_grill_sub), R.drawable.california_fish_grill ));
        descriptions.add(new Description(getActivity().getString(R.string.eat_north_italia), getActivity().getString(R.string.eat_north_italia_sub),  R.drawable.north_italia));
        descriptions.add(new Description(getActivity().getString(R.string.eat_crazy), getActivity().getString(R.string.eat_crazy_sub), R.drawable.crazy_rockn_sushi));
        descriptions.add(new Description(getActivity().getString(R.string.eat_diplomate), getActivity().getString(R.string.eat_diplomate_sub), R.drawable.le_diplomate));
        descriptions.add(new Description(getActivity().getString(R.string.eat_stacks), getActivity().getString(R.string.eat_stacks_sub), R.drawable.stacks));
        descriptions.add(new Description(getActivity().getString(R.string.eat_bruxie), getActivity().getString(R.string.eat_bruxie_sub), R.drawable.bruxie));

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
