package com.test.licenseplatescanner;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
//Firebase
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    EditText usernameText, passwordText;
    Button loginButton;
    private String username,password;

    //Firebase
    private String userID;
    private FirebaseAuth mAuth;
    private FirebaseDatabase mDatabase;
    private DatabaseReference mGetReference;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private FirebaseUser FirebaseUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameText = findViewById(R.id.usernameText);
        passwordText = findViewById(R.id.passwordText);
        loginButton = findViewById(R.id.loginButton);

        //Firebase
        mDatabase = FirebaseDatabase.getInstance();
        mGetReference = mDatabase.getReference();

        loginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                /*username = usernameText.getText().toString();
                password = passwordText.getText().toString();
                if(username.isEmpty()){
                    usernameText.setError("Please enter your username");
                    usernameText.requestFocus();
                }else if(password.isEmpty()){
                    passwordText.setError("Please enter your password");
                    passwordText.requestFocus();
                }else if(username.isEmpty() && password.isEmpty()){
                    Toast.makeText(MainActivity.this,"Fields are empty!",Toast.LENGTH_SHORT).show();
                }else if(!username.isEmpty() && !password.isEmpty()){
                    mGetReference.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                            Boolean bool = false;
                            for(DataSnapshot ds : dataSnapshot.getChildren()){
                                Maintainers maintainer = ds.getValue(Maintainers.class);
                                if(maintainer.getUsername().equals(username) && maintainer.getPassword().equals(password)){
                                    bool = true;
                                    break;
                                }
                            }if(bool){
                                */Intent intent = new Intent(MainActivity.this,camera.class);
                                startActivity(intent);/*
                            }else{
                                Toast.makeText(MainActivity.this,"Invalid Username or Password",Toast.LENGTH_SHORT).show();
                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {

                        }
                    });
                }*/
            }
        });
    }
}
