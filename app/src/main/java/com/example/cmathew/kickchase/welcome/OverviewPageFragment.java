package com.example.cmathew.kickchase.welcome;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cmathew.kickchase.R;

public class OverviewPageFragment extends Fragment {
    private static final String ARG_SLIDE = "overview_slide";

    public OverviewPageFragment() {
        // Required empty public constructor
    }

    public static OverviewPageFragment newInstance(OverviewSlide slide) {
        OverviewPageFragment fragment = new OverviewPageFragment();
        Bundle args = new Bundle();
        args.putParcelable(ARG_SLIDE, slide);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_welcome_page, container, false);
        TextView headerText = (TextView) rootView.findViewById(R.id.overview_header);
        TextView messageText = (TextView) rootView.findViewById(R.id.overview_message);
        ImageView slideImage = (ImageView) rootView.findViewById(R.id.overview_image);

        OverviewSlide slide = getArguments().getParcelable(ARG_SLIDE);
        headerText.setText(slide.getHeader());
        messageText.setText(slide.getMessage());
        slideImage.setImageResource(slide.getImage());

        return rootView;
    }
}
