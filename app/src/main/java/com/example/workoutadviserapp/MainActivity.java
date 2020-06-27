package com.example.workoutadviserapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView listTextView;
    Spinner spinner;
    Button button;
    private Workoutsuggestions workoutsuggestions=new Workoutsuggestions();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listTextView=findViewById(R.id.listtextID);
        spinner=findViewById(R.id.workoutspinner);
        button=findViewById(R.id.selectbutton);


    }

    public void onClickFindWorkouts(View view){
        String workouts=String.valueOf(spinner.getSelectedItem());
       // listTextView.setText(workouts);

        List<String> workoutlist=workoutsuggestions.getworkouts(workouts);

        StringBuilder workoutformatted=new StringBuilder();
        for(String work:workoutlist){
            workoutformatted.append(work).append('\n');
        }
        listTextView.setText(workoutformatted);
    }


}
