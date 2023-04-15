package com.example.fab;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
public class MainActivity extends AppCompatActivity {
        FloatingActionButton mAddAlarmFab, mAddPersonFab;
        ExtendedFloatingActionButton mAddFab;
        TextView addAlarmActionText, addPersonActionText;
        Boolean isAllFabsVisible;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            mAddFab = findViewById(R.id.add_fab);
            mAddAlarmFab = findViewById(R.id.add_alarm_fab);
            mAddPersonFab = findViewById(R.id.add_person_fab);
            addAlarmActionText =
                    findViewById(R.id.add_alarm_action_text);
            addPersonActionText =
                    findViewById(R.id.add_person_action_text);
            mAddAlarmFab.setVisibility(View.GONE);
            mAddPersonFab.setVisibility(View.GONE);
            addAlarmActionText.setVisibility(View.GONE);
            addPersonActionText.setVisibility(View.GONE);
            isAllFabsVisible = false;
            mAddFab.shrink();
            mAddFab.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (!isAllFabsVisible) {

                                mAddAlarmFab.show();
                                mAddPersonFab.show();
                                addAlarmActionText
                                        .setVisibility(View.VISIBLE);
                                addPersonActionText
                                        .setVisibility(View.VISIBLE);

                                mAddFab.extend();

                                isAllFabsVisible = true;
                            } else {

                                mAddAlarmFab.hide();
                                mAddPersonFab.hide();
                                addAlarmActionText
                                        .setVisibility(View.GONE);
                                addPersonActionText
                                        .setVisibility(View.GONE);

                                mAddFab.shrink();

                                isAllFabsVisible = false;
                            }
                        }
                    });
            mAddPersonFab.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Toast.makeText
                                    (MainActivity
                                                    .this, "image added",
                                            Toast.LENGTH_SHORT).show();
                        }
                    });
            mAddAlarmFab.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Toast.makeText

                                    (MainActivity
                                                    .this, "image captured",
                                            Toast.LENGTH_SHORT).show();
                        }
                    });
        }
    }
