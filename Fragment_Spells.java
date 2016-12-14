package com.uconn.mengying.dnd;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class Fragment_Spells extends Fragment {

    View view;
    Player currentPlayer;
    EditText casterLevel;
    EditText spellMod;
    TextView spellDC;

    //TODO: just like the equipment list, I'd like all of these to be listView as well. This works
    //TODO: for now though.
    EditText spellList0;
    EditText spellList1;
    EditText spellList2;
    EditText spellList3;
    EditText spellList4;
    EditText spellList5;
    EditText spellList6;
    EditText spellList7;
    EditText spellList8;
    EditText spellList9;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_spells, container, false);

        casterLevel = (EditText) view.findViewById(R.id.casterLevel);
        spellMod = (EditText) view.findViewById(R.id.spellMod);
        spellDC = (TextView) view.findViewById(R.id.spellDC);
        spellDC.setText("10");
        spellList0 = (EditText) view.findViewById(R.id.lvl0Spells);
        spellList1 = (EditText) view.findViewById(R.id.lvl1spells);
        spellList2 = (EditText) view.findViewById(R.id.lvl2spells);
        spellList3 = (EditText) view.findViewById(R.id.lvl3spells);
        spellList4 = (EditText) view.findViewById(R.id.lvl4spells);
        spellList5 = (EditText) view.findViewById(R.id.lvl5spells);
        spellList6 = (EditText) view.findViewById(R.id.lvl6spells);
        spellList7 = (EditText) view.findViewById(R.id.lvl7spells);
        spellList8 = (EditText) view.findViewById(R.id.lvl8spells);
        spellList9 = (EditText) view.findViewById(R.id.lvl9spells);

        return view;
    }

    public static Fragment_Spells newInstance(Player player) {

        Bundle args = new Bundle();

        Fragment_Spells fragment = new Fragment_Spells();
        fragment.setArguments(args);
        fragment.setPlayer(player);

        return fragment;
    }

    public void setPlayer(Player player){
        currentPlayer = player;
    }

    //TODO: update/calculate spellDC when stats updated

    public void setSpellDC(int i){
        spellDC.setText(Integer.toString(i));
    }

}
