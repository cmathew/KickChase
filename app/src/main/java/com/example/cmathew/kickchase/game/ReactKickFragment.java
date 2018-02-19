package com.example.cmathew.kickchase.game;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.cmathew.kickchase.R;

public class ReactKickFragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";

    private String mParam1;

    public ReactKickFragment() {
        // Required empty public constructor
    }

    public static ReactKickFragment newInstance(String param1) {
        ReactKickFragment fragment = new ReactKickFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_react_kick, container, false);

        Button kickaway = rootView.findViewById(R.id.react_kick_away);
        Button kickThird = rootView.findViewById(R.id.react_kick_third);
        Button kickFirst = rootView.findViewById(R.id.react_kick_first);
        Button kickWeak = rootView.findViewById(R.id.react_kick_weak);
        Button kickHome = rootView.findViewById(R.id.react_kick_home);
        Button kickFly = rootView.findViewById(R.id.react_kick_fly);

        return rootView;
    }

}
