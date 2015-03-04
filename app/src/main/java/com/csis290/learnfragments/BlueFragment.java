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
public class BlueFragment extends Fragment {

    private TextView tvBlue;
    private String message;

    public BlueFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        message = getArguments().getString("key");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blue, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tvBlue = (TextView) view.findViewById((R.id.blue_fragment_declaration));
        tvBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvBlue.setText(message);
                tvBlue.setBackgroundResource(R.color.secondary_text_default_material_dark);

            }
        });
    }
}
