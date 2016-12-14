package com.uconn.mengying.dnd;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class Fragment_equipment extends Fragment {

    View view;
    Player currentPlayer;
    EditText armorName;
    EditText acBonus;
    CheckBox shield;
    CheckBox stealthDisadvantage;
    RadioButton armorLight;
    RadioButton armorMedium;
    RadioButton armorHeavy;

    //TODO: I would like to change this multiline textbox out with a listView, but ran into issues
    //TODO: This isn't a top priority fix however.
    EditText equipment;



    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_equipment, container, false);

        acBonus = (EditText) view.findViewById(R.id.ACBonus);
        //acBonus.addTextChangedListener(textWatcher);
        armorName = (EditText) view.findViewById(R.id.armorName);
        equipment = (EditText) view.findViewById(R.id.equipment);
        shield = (CheckBox) view.findViewById(R.id.checkShield);
        stealthDisadvantage = (CheckBox) view.findViewById(R.id.StealthDisadvantage);

        armorLight = (RadioButton) view.findViewById(R.id.radioButton_LightArmor);
        armorMedium = (RadioButton) view.findViewById(R.id.radioButton_MediumArmor);
        armorHeavy = (RadioButton) view.findViewById(R.id.radioButton_HeavyArmor);

        return view;
    }

    public static Fragment_equipment newInstance(Player player) {

        Bundle args = new Bundle();

        Fragment_equipment fragment = new Fragment_equipment();
        fragment.setArguments(args);
        fragment.setPlayer(player);


        return fragment;
    }

    public void setPlayer(Player player){
        currentPlayer = player;
    }

    TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };


}
