package com.huang.hello.homework1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public class Human{
        private String name;
        public final static  int FIRE_BOW=1;
        public final static  int ICE_BOW=2;

        public  Human(){

        }

        public  void attack(){
            System.out.println("First Attack!");
        }
    }
}
