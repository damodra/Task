package com.example.task;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityActivity extends AppCompatActivity {
    EditText editText1,editText2;
    Button button1,button2,button3;
    Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);



        editText1=findViewById(R.id.emp_id);
        editText2=findViewById(R.id.emp_name);
        button1=findViewById(R.id.emp_dialog);
        button2=findViewById(R.id.emp_fragment);
        button3=findViewById(R.id.emp_adapter);
        dialog = new Dialog(ActivityActivity.this);



// set Fragmentclass Arguments

    final   HomeFragment home=new HomeFragment();

       // fragobj.setArguments(bundle);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String id=editText1.getText().toString();
                String name=editText2.getText().toString();

                android.app.AlertDialog.Builder alertBuilder = new android.app.AlertDialog.Builder(ActivityActivity.this);
                alertBuilder.setCancelable(true);
                alertBuilder.setTitle("Dialog Box");
                alertBuilder.setMessage(id+"\n"+name);
                alertBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                alertBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                AlertDialog alert = alertBuilder.create();
                alert.show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(ActivityActivity.this,ActivityFragmentActivity.class);
                Bundle b1=new Bundle();
                b1.putString("id",editText1.getText().toString());
                b1.putString("name",editText2.getText().toString());
                home.setArguments(b1);
                startActivity(i);

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
