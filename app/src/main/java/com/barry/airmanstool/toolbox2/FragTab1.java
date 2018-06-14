package com.barry.airmanstool.toolbox2;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragTab1 extends Fragment{

    /*
    Not used for anything right now. Original plan was to implement firebase here and show items in cardviews.
     */

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tab1, container, false);
    }
}
