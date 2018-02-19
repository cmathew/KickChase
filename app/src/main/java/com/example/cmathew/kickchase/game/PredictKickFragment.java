package com.example.cmathew.kickchase.game;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.cmathew.kickchase.R;

public class PredictKickFragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";

    private String mParam1;

    public PredictKickFragment() {
        // Required empty public constructor
    }

    public static PredictKickFragment newInstance(String param1) {
        PredictKickFragment fragment = new PredictKickFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_predict_kick, container, false);

        Button kickFirst = rootView.findViewById(R.id.prepare_kick_first);
        Button kickThird = rootView.findViewById(R.id.prepare_kick_third);
        Button kickAway = rootView.findViewById(R.id.prepare_kick_away);

        return rootView;
    }
}
