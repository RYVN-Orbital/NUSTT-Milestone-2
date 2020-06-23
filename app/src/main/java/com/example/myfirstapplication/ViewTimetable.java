package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.lang.Runnable;

public class ViewTimetable extends AppCompatActivity {
    public static Timetable confirmedTT;
    public TextView timetableTextView;
    public Button viewButton;
    //private Handler mainHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_timetable);
        viewButton = (Button) findViewById(R.id.viewButton);
        timetableTextView = (TextView) findViewById(R.id.timetableTextView);
    }
    //capture the textview and set the string as its text
    //TextView timetableTextView = (TextView) findViewById(R.id.timetableTextView);
    //get the intent that started this activity and extract the string
    //Intent intentToGetTimetable = getIntent();
    //String timetable = intentToGetTimetable.getStringExtra("message");
    //timetableTextView.setText(SetRequirement.confirmedTT.toString());
        /*
        String URL = "https://api.nusmods.com/v2/2019-2020/modules/CS1010S.json";
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        JsonObjectRequest objectRequest = new JsonObjectRequest(
                Request.Method.GET,
                URL,
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.e("Rest Response", response.toString());
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("Rest Response", error.toString());
                    }
                }
        );

        requestQueue.add(objectRequest);

         */

    //background thread of generating the timetable
    /*public void startThread(View view) {
        generateTimetableRunnable runnable = new generateTimetableRunnable();
        new Thread(runnable).start();
    }

    //background runnable of generating the timetable
    class generateTimetableRunnable implements Runnable {

        @Override
        public void run() {

     */


    public class JSONTask extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... urls) {
            try {
                NUSModsAPI.fetchLessonTimings("CS1010S");
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        //runs on the UI thread after doInBackground method
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            timetableTextView.setText(result);
        }
    }
}




   