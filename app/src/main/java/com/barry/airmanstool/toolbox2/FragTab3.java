package com.barry.airmanstool.toolbox2;

/*
 This fragment is supposed to be used for hosting the handbooks. I haven't decided how I want to implement it because I've been stuck on tab4.
 */

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragTab3 extends Fragment{

    //Button button364 = new Button();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tab3, container, false);
    }
}
