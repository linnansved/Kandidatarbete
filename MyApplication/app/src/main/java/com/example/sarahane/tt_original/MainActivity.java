package com.example.sarahane.tt_original;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageMetadata;
import com.google.firebase.storage.StorageReference;


public class MainActivity extends AppCompatActivity {

    private StorageReference mStorageRef;

    //Testing function with database by markusskogsmo
    private EditText mUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating path for storage by markusskogsmo
        mStorageRef = FirebaseStorage.getInstance().getReference();

        //Testing function with database by markusskogsmo
        mUserName = (EditText) findViewById(R.id.username);

    }
}
