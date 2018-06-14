package com.barry.airmanstool.toolbox2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class FragTab2 extends Fragment implements View.OnClickListener{

    private Context context;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
      //  return inflater.inflate(R.layout.fragment_tab2, container, false);

        View v = inflater.inflate(R.layout.fragment_tab2, container, false);
        //button item needs to be called for each button in switch case
        Button b1 = v.findViewById(R.id.button2903view);
        b1.setOnClickListener(this);

        Button b2 = v.findViewById(R.id.buttonShepSUp);
        b2.setOnClickListener(this);

        Button b3 = v.findViewById(R.id.button2905);
        b3.setOnClickListener(this);


        return v;
    }


    @Override
    public void onClick(View v) {
        //switch case used for buttons on screen. I want to possibly present this differently on the screen. This code was used to verify it works.

        switch (v.getId()) {
            case R.id.button2903view:
                Log.e("button clicked", "successful operation"); // used to ensure my code worked
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://static.e-publishing.af.mil/production/1/af_a1/publication/afi36-2903/afi36-2903.pdf")));

                break;

            case R.id.buttonShepSUp:
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://static.e-publishing.af.mil/production/1/sheppardafb/publication/afi36-2903_aetcsup_sheppardafbsup/afi36-2903_aetcsup_sheppardafbsup.pdf")));

                break;

            case R.id.button2905:
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://static.e-publishing.af.mil/production/1/af_a1/publication/afi36-2905/afi36-2905.pdf")));

                break;
        }
    }
}
