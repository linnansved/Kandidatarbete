package com.example.sarahane.tt_original;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageMetadata;
import com.google.firebase.storage.StorageReference;


public class MainActivity extends AppCompatActivity {

    //Creating path for storage and Database by markusskogsmo
    private StorageReference mStorageRef;
    private DatabaseReference mDatabase;

    //Testing function with database by markusskogsmo
    private Button mDbButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating path for storage and Database by markusskogsmo
        mStorageRef = FirebaseStorage.getInstance().getReference();
        mDatabase = FirebaseDatabase.getInstance().getReference();

        //Testing function with database by markusskogsmo, FUNKAR EJ PGA INGEN KOLL PÅ ROOT
        mDbButton = (Button) findViewById(R.id.login_button);
            @Override
            public void onClick(View v){
            mDatabase.child("Name").setValue("Hej")
    }



    }
}
