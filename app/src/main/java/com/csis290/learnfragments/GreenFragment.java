package com.csis290.learnfragments;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class GreenFragment extends Fragment {
    private TextView tvGreen;
    private String message;


    public GreenFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        message = getArguments().getString("key");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_green, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tvGreen = (TextView) view.findViewById(R.id.green_fragment_declaration);
        tvGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvGreen.setText(message);
            }
        });
    }
}
