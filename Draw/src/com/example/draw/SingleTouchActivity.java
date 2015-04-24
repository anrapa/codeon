package com.example.draw;


import android.app.Activity;
import android.os.Bundle;

public class SingleTouchActivity extends Activity {
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(new SingleTouchEventView(this, null));
  }
} 