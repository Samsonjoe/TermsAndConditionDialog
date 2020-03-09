package com.wiz.termsandconditiondialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox terms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        terms=findViewById(R.id.checkboxTermsAndCondition);

        TextView termsNconditions = findViewById(R.id.termsNconditions);
        termsNconditions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Terms & Conditions")
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                   terms.setChecked(true);
                                }
                            })
                            .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    Toast.makeText(MainActivity.this, "KINDLY ACCEPT TERMS AND CONDITIONS", Toast.LENGTH_SHORT).show();
                                    terms.setChecked(false);
                                }
                            })
                            .setMessage("I hereby authorize Minet Kenya Insurance Brokers who are my/or my employers medical scheme administrators to enrol me into the Minet Chronic Disease Management Program. With this enrolment I fully understand as follows:\n" +
                                    "\n" +
                                    "1. The doctors and clinical team will periodically contact me on email or telephone for an update and to offer any assistance I may need during the course of my treatment.\n" +
                                    "2. The doctors/hospitals that I am or will be attending to me will provide Minet Kenya with detailed medical information and other relevant information as and when need may arise.\n" +
                                    "3. My condition may be subject to disease management interventions and protocols as well as periodic review of my medical records from attending doctors.\n" +
                                    "4. I may discontinue my enrolment from this program if I cease to be an employee of the company.\n" +
                                    "5. I will be supported through health coaching and other tools in order to make better health choices.")
                            .show();

            }
        });


    }


    public void onCheckBoxClick(View view) {

        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkboxTermsAndCondition:
                if (checked) {
                    // Do your coding
                    Toast.makeText(this, "ACCEPTED", Toast.LENGTH_SHORT).show();
                }
                else {
                    // Do your coding
                    Toast.makeText(this, "KINDLY ACCEPT TERMS AND CONDITIONS", Toast.LENGTH_SHORT).show();
                }
                break;
            // Perform your logic
        }
    }
}
