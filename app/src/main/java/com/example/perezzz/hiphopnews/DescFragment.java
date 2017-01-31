package com.example.perezzz.hiphopnews;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DescFragment extends Fragment {

    int currentPosition;

    public DescFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_desc, container, false);
        // Inflate the layout for this fragment
        return view;


    }

    @Override
    public void onStart() {
        super.onStart();
        // During startup, check if there are arguments passed to the fragment.
        // onStart is a good place to do this because the layout has already been
        // applied to the fragment at this point so we can safely call the method
        // below that sets the article text.
        Bundle args = getArguments();
        if (args != null) {
            // Set article based on argument passed in
            currentPosition = args.getInt("position");
            TextView article = (TextView) getActivity().findViewById(R.id.desc);
            ImageView img = (ImageView) getActivity().findViewById(R.id.Cover);
            Button btn = (Button) getActivity().findViewById(R.id.Song);
            article.setText(NewsData.Description[currentPosition]);
            img.setImageResource(NewsData.Covers[currentPosition]);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(NewsData.url[currentPosition]));
                    startActivity(browserIntent);
                }
            });

        }
    }
}






