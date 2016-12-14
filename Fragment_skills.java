package com.uconn.mengying.dnd;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

public class Fragment_skills extends Fragment {

    View view;
    Player currentPlayer;

    //proficiency checks
    CheckBox athleticsCheck;
    CheckBox acrobaticsCheck;
    CheckBox sleightofhandCheck;
    CheckBox stealthCheck;
    CheckBox arcanaCheck;
    CheckBox historyCheck;
    CheckBox investigationCheck;
    CheckBox natureCheck;
    CheckBox religionCheck;
    CheckBox animalhandlingCheck;
    CheckBox insightCheck;
    CheckBox medicineCheck;
    CheckBox perceptionCheck;
    CheckBox survivalCheck;
    CheckBox deceptionCheck;
    CheckBox intimidationCheck;
    CheckBox performanceCheck;
    CheckBox persuasionCheck;

    //skill modifiers
    TextView athleticsMod;
    TextView acrobaticsMod;
    TextView sleightofhandMod;
    TextView stealthMod;
    TextView arcanaMod;
    TextView historyMod;
    TextView investigationMod;
    TextView natureMod;
    TextView religionMod;
    TextView animalhandlingMod;
    TextView insightMod;
    TextView medicineMod;
    TextView perceptionMod;
    TextView survivalMod;
    TextView deceptionMod;
    TextView intimidationMod;
    TextView performanceMod;
    TextView persuasionMod;



    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_skills, container, false);

        athleticsCheck = (CheckBox) view.findViewById(R.id.proficiency_Athletics);
        acrobaticsCheck = (CheckBox) view.findViewById(R.id.proficiency_Acrobatics);
        sleightofhandCheck = (CheckBox) view.findViewById(R.id.proficiency_SleightofHand);
        stealthCheck = (CheckBox) view.findViewById(R.id.proficiency_Stealth);
        arcanaCheck = (CheckBox) view.findViewById(R.id.proficiency_Arcana);
        historyCheck = (CheckBox) view.findViewById(R.id.proficiency_History);
        investigationCheck = (CheckBox) view.findViewById(R.id.proficiency_Investigation);
        natureCheck = (CheckBox) view.findViewById(R.id.proficiency_Nature);
        religionCheck = (CheckBox) view.findViewById(R.id.proficiency_Religion);
        animalhandlingCheck = (CheckBox) view.findViewById(R.id.proficiency_AnimalHandling);
        insightCheck = (CheckBox) view.findViewById(R.id.proficiency_Insight);
        medicineCheck = (CheckBox) view.findViewById(R.id.proficiency_Medicine);
        perceptionCheck = (CheckBox) view.findViewById(R.id.proficiency_Perception);
        survivalCheck = (CheckBox) view.findViewById(R.id.proficiency_Survival);
        deceptionCheck = (CheckBox) view.findViewById(R.id.proficiency_Deception);
        intimidationCheck = (CheckBox) view.findViewById(R.id.proficiency_Intimidation);
        performanceCheck = (CheckBox) view.findViewById(R.id.proficiency_Performance);
        persuasionCheck = (CheckBox) view.findViewById(R.id.proficiency_Persuasion);


        athleticsMod = (TextView) view.findViewById(R.id.modifier_Athletics);
        acrobaticsMod = (TextView) view.findViewById(R.id.modifier_Acrobatics);
        sleightofhandMod = (TextView) view.findViewById(R.id.modifier_SleightofHand);
        stealthMod = (TextView) view.findViewById(R.id.modifier_Stealth);
        arcanaMod = (TextView) view.findViewById(R.id.modifier_Arcana);
        historyMod = (TextView) view.findViewById(R.id.modifier_History);
        investigationMod = (TextView) view.findViewById(R.id.modifier_Investigation);
        natureMod = (TextView) view.findViewById(R.id.modifier_Nature);
        religionMod = (TextView) view.findViewById(R.id.modifier_Religion);
        animalhandlingMod = (TextView) view.findViewById(R.id.modifier_AnimalHandling);
        insightMod = (TextView) view.findViewById(R.id.modifier_Insight);
        medicineMod = (TextView) view.findViewById(R.id.modifier_Medicine);
        perceptionMod = (TextView) view.findViewById(R.id.modifier_Perception);
        survivalMod = (TextView) view.findViewById(R.id.modifier_Survival);
        deceptionMod = (TextView) view.findViewById(R.id.modifier_Deception);
        intimidationMod = (TextView) view.findViewById(R.id.modifier_Intimidation);
        performanceMod = (TextView) view.findViewById(R.id.modifier_Performance);
        persuasionMod = (TextView) view.findViewById(R.id.modifier_Persuasion);

        return view;
    }




    public static Fragment_skills newInstance(Player player) {

        Bundle args = new Bundle();

        Fragment_skills fragment = new Fragment_skills();
        fragment.setArguments(args);
        fragment.setPlayer(player);


        return fragment;
    }

    public void setPlayer(Player player){
        currentPlayer = player;
    }


    //UpdateCheckBox methods
    //may be possible to fit into one method. unsure how

    public CheckBox getAthleticsCheck() {
        return athleticsCheck;
    }

    public CheckBox getAcrobaticsCheck() {
        return acrobaticsCheck;
    }

    public CheckBox getSleightofhandCheck() {
        return sleightofhandCheck;
    }

    public CheckBox getStealthCheck() {
        return stealthCheck;
    }


    public CheckBox getArcanaCheck() {
        return arcanaCheck;
    }

    public CheckBox getHistoryCheck() {
        return historyCheck;
    }

    public CheckBox getInvestigationCheck() {
        return investigationCheck;
    }

    public CheckBox getNatureCheck() {
        return natureCheck;
    }

    public CheckBox getReligionCheck() {
        return religionCheck;
    }

    public CheckBox getAnimalhandlingCheck() {
        return animalhandlingCheck;
    }

    public CheckBox getInsightCheck() {
        return insightCheck;
    }

    public CheckBox getMedicineCheck() {
        return medicineCheck;
    }

    public CheckBox getPerceptionCheck() {
        return perceptionCheck;
    }

    public CheckBox getSurvivalCheck() {
        return survivalCheck;
    }

    public CheckBox getDeceptionCheck() {
        return deceptionCheck;
    }

    public CheckBox getIntimidationCheck() {
        return intimidationCheck;
    }

    public CheckBox getPerformanceCheck() {
        return performanceCheck;
    }

    public CheckBox getPersuasionCheck() {
        return persuasionCheck;
    }

    public TextView getAthleticsMod() {
        return athleticsMod;
    }

    public void setAthleticsMod(String s) {
        athleticsMod.setText(s);
    }

    public TextView getAcrobaticsMod() {
        return acrobaticsMod;
    }

    public void setAcrobaticsMod(String s) {acrobaticsMod.setText(s);}

    public TextView getSleightofhandMod() {
        return sleightofhandMod;
    }

    public void setSleightofhandMod(String s) {sleightofhandMod.setText(s);}

    public TextView getStealthMod() {
        return stealthMod;
    }

    public void setStealthMod(String s) {
        stealthMod.setText(s);
    }

    public TextView getArcanaMod() {
        return arcanaMod;
    }

    public void setArcanaMod(String s) {arcanaMod.setText(s);}

    public TextView getHistoryMod() {
        return historyMod;
    }

    public void setHistoryMod(String s) {
        historyMod.setText(s);
    }

    public TextView getInvestigationMod() {
        return investigationMod;
    }

    public void setInvestigationMod(String s) {investigationMod.setText(s);}

    public TextView getNatureMod() {
        return natureMod;
    }

    public void setNatureMod(String s) {natureMod.setText(s);}

    public TextView getReligionMod() {
        return religionMod;
    }

    public void setReligionMod(String s) {
        religionMod.setText(s);
    }

    public TextView getAnimalhandlingMod() {
        return animalhandlingMod;
    }

    public void setAnimalhandlingMod(String s) {animalhandlingMod.setText(s);}

    public TextView getInsightMod() {
        return insightMod;
    }

    public void setInsightMod(String s){insightMod.setText(s);}

    public TextView getMedicineMod() {
        return medicineMod;
    }

    public void setMedicineMod(String s) {medicineMod.setText(s);}

    public TextView getPerceptionMod() {
        return perceptionMod;
    }

    public void setPerceptionMod(String s) {
        perceptionMod.setText(s);
    }

    public TextView getSurvivalMod() {
        return survivalMod;
    }

    public void setSurvivalMod(String s) {
        survivalMod.setText(s);
    }

    public TextView getDeceptionMod() {
        return deceptionMod;
    }

    public void setDeceptionMod(String s) {
        deceptionMod.setText(s);
    }

    public TextView getIntimidationMod() {
        return intimidationMod;
    }

    public void setIntimidationMod(String s) {intimidationMod.setText(s);}

    public TextView getPerformanceMod() {
        return performanceMod;
    }

    public void setPerformanceMod(String s) {
        performanceMod.setText(s);
    }

    public TextView getPersuasionMod() {
        return persuasionMod;
    }

    public void setPersuasionMod(String s) {
        persuasionMod.setText(s);
    }
}
