package com.example.and_assignment.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.and_assignment.R;

public class Result extends AppCompatActivity {
    private ResultViewModel viewModel;
   private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this).get(ResultViewModel.class);
        viewModel.init();
        checkIfSignedIn();

        setContentView(R.layout.activity_result);
        textView=findViewById(R.id.textView);
    }

    private void checkIfSignedIn() {
        viewModel.getCurrentUser().observe(this, user -> {
            if (user != null) {
                String message = "Welcome " + user.getDisplayName();

            } else
                startLoginActivity();
        });
    }

    private void startLoginActivity() {
        startActivity(new Intent(this, SigninActivity.class));
        finish();
    }

    public void signOut(View view) {viewModel.signOut();
    }

    public void back(View view) {
        startActivity(new Intent(this, MainActivity1.class));
    }

    public void web(View view) {
        String html="http://www.csair.com";
        textView.setAutoLinkMask(Linkify.ALL);
        textView.setText(html);

    }
}