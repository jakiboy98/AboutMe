package com.example.jwil9706.aboutme;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;
import android.content.Intent;

public class AboutMe extends Activity
{

    private Button jacobButton;
    private Button wrestlingButton;
    private Button cookingButton;
    private Button pokemonButton;
    private Button dndButton;
    private Button fullmetalButton;
    private TextView textBox;
    private GridLayout grid;
    //initalizes all of the buttons.


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        jacobButton = (Button) findViewById(R.id.jacobButton);
        wrestlingButton = (Button) findViewById(R.id.wrestlingButton);
        cookingButton = (Button) findViewById(R.id.cookingButton);
        pokemonButton = (Button) findViewById(R.id.pokemonButton);
        dndButton = (Button) findViewById(R.id.dndButton);
        fullmetalButton = (Button) findViewById(R.id.fullmetalButton);
        grid = (GridLayout) findViewById(R.id.grid);
        setupListeners();
        //Gives the buttons id's.
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_about_me, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setupListeners()
    {
        //Makes the buttons do something.
        jacobButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                Intent myIntent = new Intent(buttonView.getContext(), jacobActivity.class);
                startActivityForResult(myIntent, 0);

            }
        });

        wrestlingButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                Intent myIntent = new Intent(buttonView.getContext(), wrestlingActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });


        cookingButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                Intent myIntent = new Intent(buttonView.getContext(), cookingActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });

        pokemonButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                Intent myIntent = new Intent(buttonView.getContext(), pokemonActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });


        dndButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                Intent myIntent = new Intent(buttonView.getContext(), dndActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });


        fullmetalButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                Intent myIntent = new Intent(buttonView.getContext(), fullmetalActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }}




