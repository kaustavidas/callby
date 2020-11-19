package com.example.callby;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnOne;
    Button btnTwo;
    Button btnThree;
    Button btnFour;
    Button btnFive;
    Button btnSix;
    Button btnSeven;
    Button btnEight;
    Button btnNine;
    Button btnZero;
    Button btnHashTag;
    Button btnStar;
    Button btnDial;
    Button btnOnDelete;

    EditText input;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        btnOne = findViewById(R.id.buttonOne);
        btnTwo = findViewById(R.id.buttonTwo);
        btnThree = findViewById(R.id.buttonThree);
        btnFour = findViewById(R.id.buttonFour);
        btnFive = findViewById(R.id.buttonFive);
        btnSix = findViewById(R.id.buttonSix);
        btnSeven = findViewById(R.id.buttonSeven);
        btnEight = findViewById(R.id.buttonEight);
        btnNine = findViewById(R.id.buttonNine);
        btnZero = findViewById(R.id.buttonZero);
        btnStar = findViewById(R.id.buttonStar);
        btnHashTag = findViewById(R.id.buttonHashTag);
        btnDial = findViewById(R.id.buttonDial);
        btnOnDelete = findViewById(R.id.buttonDelete);

        input = findViewById(R.id.editTextTextPersonName);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
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

    public void one(View v){
        onButtonClick(btnOne, input, "1");
    }

    public void two(View v){
        onButtonClick(btnTwo, input, "2");
    }

    public void three(View v){
        onButtonClick(btnThree, input, "3");
    }

    public void four(View v){
        onButtonClick(btnFour, input, "4");
    }

    public void five(View v){
        onButtonClick(btnFive, input, "5");
    }

    public void six(View v){
        onButtonClick(btnSix, input, "6");
    }

    public void seven(View v){
        onButtonClick(btnSeven, input, "7");
    }

    public void eight(View v){
        onButtonClick(btnEight, input, "8");
    }

    public void nine(View v){
        onButtonClick(btnNine, input, "9");
    }

    public void zero(View v){
        onButtonClick(btnZero, input, "0");
    }

    public void star(View v){
        onButtonClick(btnStar, input, "*");
    }

    public void hashTag(View v){
        onButtonClick(btnHashTag, input, "#");
    }

    public void onDelete(View v){
        input.setText("");
    }

    public void call(View v){
        if(input.getText().length() <= 3) {
            Toast.makeText(this, "Please Enter A Valid Phone Number", Toast.LENGTH_SHORT).show();
        } else {

        }
    }

    public void onButtonClick(Button button, EditText inputNumber, String number){
        String cache = input.getText().toString();
        inputNumber.setText(cache + number);

    }

}
