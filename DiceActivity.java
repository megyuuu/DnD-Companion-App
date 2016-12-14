package com.uconn.mengying.dnd;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.Random;



public class DiceActivity extends Fragment implements Serializable {
    Player currentPlayer;
    View view;
    Random r;

    int rolledNumber1;
    int rolledNumber2;
    int rolledNumber3;
    int rolledNumber4;
    int rolledNumber5;
    int rolledNumber6;
    int rolledNumber7;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.activity_dice, container, false);
        Button b_roll1=(Button)view.findViewById(R.id.button1);
        final TextView tv_1=(TextView)view.findViewById(R.id.textView1);
        b_roll1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r=new Random();
                rolledNumber1=r.nextInt(4)+1;
                String myString=String.valueOf(rolledNumber1);
                tv_1.setText(myString);
            }
        });
        Button b_roll2=(Button)view.findViewById(R.id.button2);
        final TextView tv_2=(TextView)view.findViewById(R.id.textView2);
        b_roll2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r=new Random();
                rolledNumber2=r.nextInt(6)+1;
                String myString=String.valueOf(rolledNumber2);
                tv_2.setText(myString);
            }
        });
        Button b_roll3=(Button)view.findViewById(R.id.button3);
        final TextView tv_3=(TextView)view.findViewById(R.id.textView3);
        b_roll3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r=new Random();
                rolledNumber3=r.nextInt(8)+1;
                String myString=String.valueOf(rolledNumber3);
                tv_3.setText(myString);
            }
        });
        Button b_roll4=(Button)view.findViewById(R.id.button4);
        final TextView tv_4=(TextView)view.findViewById(R.id.textView4);
        b_roll4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r=new Random();
                rolledNumber4=r.nextInt(10)+1;
                String myString=String.valueOf(rolledNumber4);
                tv_4.setText(myString);
            }
        });
        Button b_roll5=(Button)view.findViewById(R.id.button5);
        final TextView tv_5=(TextView)view.findViewById(R.id.textView5);
        b_roll5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r=new Random();
                rolledNumber5=r.nextInt(100)+1;
                String myString=String.valueOf(rolledNumber5);
                tv_5.setText(myString);
            }
        });
        Button b_roll6=(Button)view.findViewById(R.id.button6);
        final TextView tv_6=(TextView)view.findViewById(R.id.textView6);
        b_roll6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r=new Random();
                rolledNumber6=r.nextInt(12)+1;
                String myString=String.valueOf(rolledNumber6);
                tv_6.setText(myString);
            }
        });
        Button b_roll7=(Button)view.findViewById(R.id.button7);
        final TextView tv_7=(TextView)view.findViewById(R.id.textView7);
        b_roll7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r=new Random();
                rolledNumber7=r.nextInt(20)+1;
                String myString=String.valueOf(rolledNumber7);
                tv_7.setText(myString);
            }
        });



        return view;
    }
    public static DiceActivity newInstance(Player player) {

        Bundle args = new Bundle();

        DiceActivity fragment = new DiceActivity();
        fragment.setArguments(args);
        fragment.setPlayer(player);


        return fragment;
    }

    private void setPlayer(Player player) {
        currentPlayer=player;
    }
}
