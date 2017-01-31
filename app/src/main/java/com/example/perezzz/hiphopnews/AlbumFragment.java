package com.example.perezzz.hiphopnews;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * A simple {@link Fragment} subclass.
 */
public class AlbumFragment extends ListFragment {

    public static final String ARG_SECTION_NUMBER = "section_number";
   /* public AlbumFragment() {
        // Required empty public constructor
    }*/

    private ListView listView;


    /*@Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }*/


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(inflater.getContext(), android.R.layout.simple_list_item_1, NewsData.Albums);

        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }







    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        if (getActivity().findViewById(R.id.container) != null){
            // Create fragment and give it an argument specifying the article it should show
            DescFragment newFragment = new DescFragment();
            Bundle args = new Bundle();
            args.putInt("position", position);
            newFragment.setArguments(args);
            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            // Replace whatever is in the fragment_container view with this fragment,
            // and add the transaction to the back stack so the user can navigate back
            transaction.replace(R.id.container, newFragment);
            transaction.addToBackStack(null);
            // Commit the transaction
            transaction.commit();

        }
        else{
            TextView article = (TextView) getActivity().findViewById(R.id.desc);
            article.setText(NewsData.Description[position]);

        }
    }







   /* @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int num = getArguments().getInt(ARG_SECTION_NUMBER);
        // GlobalList is a class that holds global variables, arrays etc
        // getMenuCategories returns global arraylist which is initialized in GlobalList class
        albuns = NewsData.Albuns;
        mAdapter = new CustomArrayAdapter(getActivity(), android.R.id.list, albuns);
        listView.setAdapter(mAdapter);
    }*/


}
