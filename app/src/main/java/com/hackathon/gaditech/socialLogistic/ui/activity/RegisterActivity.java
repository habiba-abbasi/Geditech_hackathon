package com.hackathon.gaditech.socialLogistic.ui.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.hackathon.gaditech.socialLogistic.R;
import com.hackathon.gaditech.socialLogistic.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {

    ActivityRegisterBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_register);
        binding.btRegister.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

//                EditText vi=((EditText)findViewById(R.id.etRegisterUsername));
//                String Username=vi.getText().toString();
//                Log.v("Name", "Name: "+Username);
//                String Cnic=binding.etRegisterCNIC.getText().toString();
//                String Password= binding.etRegisterPassword.getText().toString();
//                User currentUser=new User (Username,Cnic,Password);
//                String Credits=String.valueOf(currentUser.creditsOfNewUser());
//
//                Intent intent = new Intent(getApplicationContext(),WalletActivity.class);
//                intent.putExtra("USER",Username);
//                intent.putExtra("NIC",Cnic);
//                intent.putExtra("PASSWORD", Password);
//                intent.putExtra("CREDITS",Credits);
//                startActivity(intent);
            }

        });

        binding.backBt.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
               /* Intent intent=new Intent(getApplicationContext(),CategoryActivity.class);
                startActivity(intent);*/
                onBackPressed();

            }

        });
    }
}
