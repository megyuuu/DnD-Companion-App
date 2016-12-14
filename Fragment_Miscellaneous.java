package com.uconn.mengying.dnd;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


public class Fragment_Miscellaneous extends Fragment {

    View view;
    Player currentPlayer;

    EditText race;
    EditText background;
    EditText alignment;
    EditText features;
    EditText armorProficiencies;
    EditText weaponProficiencies;
    EditText toolProficiencies;
    EditText equipment;
    EditText platinum;
    EditText gold;
    EditText silver;
    EditText copper;
    EditText traits;
    EditText ideals;
    EditText bonds;
    EditText flaws;
    EditText notes;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_miscellaneous, container, false);

        race = (EditText) view.findViewById(R.id.Race);
        background = (EditText) view.findViewById(R.id.Background);
        alignment = (EditText) view.findViewById(R.id.Alignment);
        features = (EditText) view.findViewById(R.id.Features);
        armorProficiencies = (EditText) view.findViewById(R.id.armorProficiencies);
        weaponProficiencies = (EditText) view.findViewById(R.id.weaponProficiencies);
        toolProficiencies = (EditText) view.findViewById(R.id.toolProficiencies);
        equipment = (EditText) view.findViewById(R.id.bag);
        platinum = (EditText) view.findViewById(R.id.platinumAmount);
        gold = (EditText) view.findViewById(R.id.goldAmount);
        silver = (EditText) view.findViewById(R.id.silverAmount);
        copper = (EditText) view.findViewById(R.id.copperAmount);
        traits = (EditText) view.findViewById(R.id.personalityTraits);
        ideals = (EditText) view.findViewById(R.id.Ideals);
        bonds = (EditText) view.findViewById(R.id.Bonds);
        flaws = (EditText) view.findViewById(R.id.Flaws);
        notes = (EditText) view.findViewById(R.id.Notes);

        return view;
    }

    public static Fragment_Miscellaneous newInstance(Player player) {

        Bundle args = new Bundle();

        Fragment_Miscellaneous fragment = new Fragment_Miscellaneous();
        fragment.setArguments(args);
        fragment.setPlayer(player);

        return fragment;
    }

    public void setPlayer(Player player){
        currentPlayer = player;
    }
}
