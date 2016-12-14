package com.uconn.mengying.dnd;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.io.File;

public class Fragment_Saves extends Fragment {

    View view;
    Player currentPlayer;
    Button newSheet;
    Button save;
    ListView saves;
    ArrayAdapter<File> saveList;

    //TODO: if choosing to implement saves through this fragment you'll have to add it to the MainActivity

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_saves, container, false);

        newSheet = (Button) view.findViewById(R.id.newSheet);
        save = (Button) view.findViewById(R.id.saveSheet);



        return view;
    }

    public static Fragment_Saves newInstance(Player player) {

        Bundle args = new Bundle();

        Fragment_Saves fragment = new Fragment_Saves();
        fragment.setArguments(args);
        fragment.setPlayer(player);

        return fragment;
    }

    public void setPlayer(Player player){
        currentPlayer = player;
    }



}
