package com.example.workoutadviserapp;

import java.util.ArrayList;
import java.util.List;

public class Workoutsuggestions {

    List<String> getworkouts(String workoutTypes){
        List<String> workout=new ArrayList<String>();

        if(workoutTypes.equals("Neck")){
            workout.add("Neck-1");
            workout.add("Neck-2");
        }

        else if(workoutTypes.equals("Shoulder")){
            workout.add("Shoulder-1");
            workout.add("Shoulder-2");
        }
        else if(workoutTypes.equals("Chest")){
            workout.add("Chest-1");
            workout.add("Chest-2");
        }
        else if(workoutTypes.equals("Biceps")){
            workout.add("Biceps-1");
            workout.add("Biceps-2");
        }
        else if(workoutTypes.equals("Triceps")){
            workout.add("Triceps-1");
            workout.add("Triceps-2");
        }
        else if(workoutTypes.equals("Belly")){
            workout.add("Belly-1");
            workout.add("Belly-2");
        }

        else if(workoutTypes.equals("Abs")){
            workout.add("Abs-1");
            workout.add("Abs-2");
        }
        else if(workoutTypes.equals("Hips")){
            workout.add("Hips-1");
            workout.add("Hips-2");
        }

        else if(workoutTypes.equals("Legs")){
            workout.add("Legs-1");
            workout.add("Legs-2");
        }
        else if(workoutTypes.equals("Foots")){
            workout.add("Foots-1");
            workout.add("Foots-2");
        }

        return workout;

    }
}
