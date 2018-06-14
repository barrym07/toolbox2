package com.barry.airmanstool.toolbox2;

/*
The plan for this tab is to use an ExpandableListView or some similar way to hold the information. I would like to click the question and it reveals the answer.
I've thought about having the question reveal the answer in an alert dialog box, but I haven't put the code in for it yet.
I've also played with a regular list view and with the answer hidden and it becomes visible when you click the question.
 */

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragTab4 extends Fragment {

    private Context context;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
    //  return inflater.inflate(R.layout.fragment_tab4, container, false);
       View v = inflater.inflate(R.layout.fragment_tab4, container, false);

    //    LinearLayout linearLayout = v.findViewById(R.id.lin_expand);

//        //instant questions
       TextView quest1 = v.findViewById(R.id.quest1);
        quest1.setOnClickListener(new v.OnClickListener(){
            @Override

         public void onClick(View v){}
              Intent intent = new Intent()
                                   });

//        TextView quest2 = v.findViewById(R.id.quest2);
//        quest2.setOnClickListener((View.OnClickListener) this);
//
//        TextView quest3 = v.findViewById(R.id.quest3);
//        quest3.setOnClickListener((View.OnClickListener) this);
//
       return v;
    }
//
//    public void onClick(View v){
//        switch (v.getId()){
//            case R.id.quest1:
//                TextView answer1 = v.findViewById(R.id.answer1);
//                if ((answer1.setVisibility(View.GONE))){
//                    answer1.setVisibility(View.VISIBLE);
//                } else answer1.setVisibility(View.GONE);
//
//
//
//            break;
//        }
//    }

//    public void openAlert(View view){
//        Toast.makeText(context, "You've have clicked the text!!!", Toast.LENGTH_LONG).show();
//
//
//
//    }



}