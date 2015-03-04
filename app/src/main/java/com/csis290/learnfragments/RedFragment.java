package com.csis290.learnfragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class RedFragment extends Fragment {

    private TextView tvRed;

    public RedFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_red, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tvRed = (TextView) view.findViewById(R.id.red_fragment_declaration);
        tvRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvRed.setText("You're inside the red fragment");
                tvRed.setBackgroundResource(R.color.secondary_text_default_material_dark);
            }
        });
    }
}
