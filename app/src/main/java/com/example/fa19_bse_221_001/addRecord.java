package com.example.fa19_bse_221_001;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class addRecord extends Fragment {
//    EditText name,age,address;

    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_add_record, container, false);
//
//        name=view.findViewById(R.id.name);
//        age=view.findViewById(R.id.age);
//        address=view.findViewById(R.id.address);
//        saveBtn=view.findViewById(R.id.save);

        EditText email= view.findViewById(R.id.email);
        Button saveBtn = view.findViewById(R.id.save);
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = email.getText().toString();
                Bundle result = new Bundle();
                result.putString("df1",text);
                getParentFragmentManager().setFragmentResult("dataForm1",result);
                email.setText("");
            }
        });



        return view;
    }


}