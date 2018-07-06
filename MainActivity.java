package com.huang.hello.homework1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //以下作業原文
    public class Human {
        private String name;

        public final static int FIRE_BOW = 1;
        public final static int ICE_BOW = 2;


        public Human() {

        }

        public void attack() {
            System.out.println("First Attack!");
        }
    }
    //以上作業原文

    //子類別Humter繼承Human父類別
    public class Hunter extends Human {
        //第一個constructor,有一個整數型態的引數
        public Hunter(int DEFAULT_BLADE) {

        }
        //第二個constructor,有一個字串型態的引數
        public Hunter(String FIRE_BLADE){

        }
        // 第三個constructor,有一個字元型態的引數
        public Hunter(char ICE_BLADE){

        }
        public void attack() {
            System.out.println("First Attack!");
        }
    }
    //子類別Warrior繼承Human父類別
    public class Warrior extends Human {
        //第一個constructor,有一個整數型態的引數
        public Warrior(int DEFAULT_BOW) {

        }
        //第二個constructor,有一個字串型態的引數
        public Warrior(String FIRE_BOW){

        }
        // 第三個constructor,有一個字元型態的引數
        public Warrior(char ICE_BOW){

        }
        public void attack() {
            System.out.println("First Attack!");
        }
    }
    //子類別Mage繼承Human父類別
    public class Mage extends Human {
        //第一個constructor,有一個整數型態的引數
        public Mage(int DEFAULT_STAFF) {

        }
        //第二個constructor,有一個字串型態的引數
        public Mage(String FIRE_STAFF){

        }
        // 第三個constructor,有一個字元型態的引數
        public Mage(char ICE_STAFF){

        }
        public void attack() {
            System.out.println("First Attack!");
        }
    }

}
