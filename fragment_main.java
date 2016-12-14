package com.uconn.mengying.dnd;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

//Todo: make AC calculable and convert from EditText to TextView

public class fragment_main extends Fragment {

    View view;
    Player currentPlayer;

    //need textwatchers
    EditText proficiency;
    EditText score_Strength;
    EditText score_Dexterity;
    EditText score_Constitution;
    EditText score_Intelligence;
    EditText score_Wisdom;
    EditText score_Charisma;


    //are updated
    TextView armorClass;
    TextView mod_Strength;
    TextView mod_Dexterity;
    TextView mod_Constitution;
    TextView mod_Intelligence;
    TextView mod_Wisdom;
    TextView mod_Charisma;

    //not used for updates
    EditText name;
    EditText classandLevel;
    EditText health;
    EditText hitDice;
    EditText initiative;
    EditText speed;
    EditText xp;
    EditText save_Strength;
    EditText save_Dexterity;
    EditText save_Constitution;
    EditText save_Intelligence;
    EditText save_Wisdom;
    EditText save_Charisma;

    //Labels are unincluded as of now. They shouldn't be necessary




    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_home, container, false);

        proficiency = (EditText) view.findViewById(R.id.Proficiency);
        proficiency.addTextChangedListener(statWatcher);
        score_Strength = (EditText) view.findViewById(R.id.Score_Strength);
        score_Strength.addTextChangedListener(statWatcher);
        score_Dexterity = (EditText) view.findViewById(R.id.Score_Dexterity);
        score_Dexterity.addTextChangedListener(statWatcher);
        score_Constitution = (EditText) view.findViewById(R.id.Score_Constitution);
        score_Constitution.addTextChangedListener(statWatcher);
        score_Intelligence = (EditText) view.findViewById(R.id.Score_Intelligence);
        score_Intelligence.addTextChangedListener(statWatcher);
        score_Wisdom = (EditText) view.findViewById(R.id.Score_Wisdom);
        score_Wisdom.addTextChangedListener(statWatcher);
        score_Charisma = (EditText) view.findViewById(R.id.Score_Charisma);
        score_Charisma.addTextChangedListener(statWatcher);

        name = (EditText) view.findViewById(R.id.Name);
        classandLevel = (EditText) view.findViewById(R.id.ClassandLevel);
        health = (EditText) view.findViewById(R.id.Health);
        hitDice = (EditText) view.findViewById(R.id.HitDice);
        initiative = (EditText) view.findViewById(R.id.Initiative);
        speed = (EditText) view.findViewById(R.id.Speed);
        xp = (EditText) view.findViewById(R.id.experience);
        save_Strength = (EditText) view.findViewById(R.id.Save_Strength);
        save_Dexterity = (EditText) view.findViewById(R.id.Save_Dexterity);
        save_Constitution = (EditText) view.findViewById(R.id.Save_Constitution);
        save_Intelligence = (EditText) view.findViewById(R.id.Save_Intelligence);
        save_Wisdom = (EditText) view.findViewById(R.id.Save_Wisdom);
        save_Charisma = (EditText) view.findViewById(R.id.Save_Constitution);

        armorClass = (TextView) view.findViewById(R.id.ArmorClass);
        mod_Strength = (TextView) view.findViewById(R.id.Modifier_Strength);
        mod_Dexterity = (TextView) view.findViewById(R.id.Modifier_Dexterity);
        mod_Constitution = (TextView) view.findViewById(R.id.Modifier_Constitution);
        mod_Intelligence = (TextView) view.findViewById(R.id.Modifier_Intelligence);
        mod_Wisdom = (TextView) view.findViewById(R.id.Modifier_Wisdom);
        mod_Charisma = (TextView) view.findViewById(R.id.Modifier_Charisma);

        return view;
    }

    public static fragment_main newInstance(Player player) {

        Bundle args = new Bundle();

        fragment_main fragment = new fragment_main();
        fragment.setArguments(args);
        fragment.setPlayer(player);


        return fragment;
    }



    public void setPlayer(Player player){
        currentPlayer = player;
    }

    TextWatcher statWatcher = new TextWatcher() {
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void afterTextChanged(Editable s) {

            updateStats();
            updateSkills();

        }
    };


    public void updateStats(){
        if(!proficiency.getText().toString().equals("")){
            currentPlayer.setProficiency(Integer.parseInt(proficiency.getText().toString()));}
        if(!score_Charisma.getText().toString().equals("")){
            currentPlayer.setScore_Charisma(Integer.parseInt(score_Charisma.getText().toString()));}
        if(!score_Constitution.getText().toString().equals("")){
            currentPlayer.setScore_Constitution(Integer.parseInt(score_Constitution.getText().toString()));}
        if(!score_Dexterity.getText().toString().equals("")){
            currentPlayer.setScore_Dexterity(Integer.parseInt(score_Dexterity.getText().toString()));}
        if(!score_Intelligence.getText().toString().equals("")){
            currentPlayer.setScore_Intelligence(Integer.parseInt(score_Intelligence.getText().toString()));}
        if(!score_Strength.getText().toString().equals("")){
            currentPlayer.setScore_Strength(Integer.parseInt(score_Strength.getText().toString()));}
        if(!score_Wisdom.getText().toString().equals("")){
            currentPlayer.setScore_Wisdom(Integer.parseInt(score_Wisdom.getText().toString()));}
    }

    public void updateSkills(){
        boolean checked;
        //Acrobatics
        checked = currentPlayer.getSkillsFragment().getAcrobaticsCheck().isChecked();
        if(checked) {currentPlayer.setAcrobaticsMod(currentPlayer.getMod_Dexterity() + currentPlayer.getProficiency());}
        else {currentPlayer.setAcrobaticsMod(currentPlayer.getMod_Dexterity());}
        //Animal Handling
        checked = currentPlayer.getSkillsFragment().getAnimalhandlingCheck().isChecked();
        if(checked) {currentPlayer.setAnimalhandlingMod(currentPlayer.getMod_Wisdom() + currentPlayer.getProficiency());}
        else {currentPlayer.setAnimalhandlingMod(currentPlayer.getMod_Wisdom());}
        //Arcana
        checked = currentPlayer.getSkillsFragment().getArcanaCheck().isChecked();
        if(checked) {currentPlayer.setArcanaMod(currentPlayer.getMod_Intelligence() + currentPlayer.getProficiency());}
        else {currentPlayer.setArcanaMod(currentPlayer.getMod_Intelligence());}
        //Athletics
        checked = currentPlayer.getSkillsFragment().getAthleticsCheck().isChecked();
        if(checked) {currentPlayer.setAthleticsMod(currentPlayer.getMod_Strength() + currentPlayer.getProficiency());}
        else {currentPlayer.setAthleticsMod(currentPlayer.getMod_Strength());}
        //Deception
        checked = currentPlayer.getSkillsFragment().getDeceptionCheck().isChecked();
        if(checked) {currentPlayer.setDeceptionMod(currentPlayer.getMod_Charisma() + currentPlayer.getProficiency());}
        else {currentPlayer.setDeceptionMod(currentPlayer.getMod_Charisma());}
        //History
        checked = currentPlayer.getSkillsFragment().getHistoryCheck().isChecked();
        if(checked) {currentPlayer.setHistoryMod(currentPlayer.getMod_Intelligence() + currentPlayer.getProficiency());}
        else {currentPlayer.setHistoryMod(currentPlayer.getMod_Intelligence());}
        //Insight
        checked = currentPlayer.getSkillsFragment().getInsightCheck().isChecked();
        if(checked) {currentPlayer.setInsightMod(currentPlayer.getMod_Wisdom() + currentPlayer.getProficiency());}
        else {currentPlayer.setInsightMod(currentPlayer.getMod_Wisdom());}
        //Intimidation
        checked = currentPlayer.getSkillsFragment().getIntimidationCheck().isChecked();
        if(checked) {currentPlayer.setIntimidationMod(currentPlayer.getMod_Charisma() + currentPlayer.getProficiency());}
        else {currentPlayer.setIntimidationMod(currentPlayer.getMod_Charisma());}
        //Investigation
        checked = currentPlayer.getSkillsFragment().getInvestigationCheck().isChecked();
        if(checked) {currentPlayer.setInvestigationMod(currentPlayer.getMod_Intelligence() + currentPlayer.getProficiency());}
        else {currentPlayer.setInvestigationMod(currentPlayer.getMod_Intelligence());}
        //Medicine
        checked = currentPlayer.getSkillsFragment().getMedicineCheck().isChecked();
        if(checked) {currentPlayer.setMedicineMod(currentPlayer.getMod_Wisdom() + currentPlayer.getProficiency());}
        else {currentPlayer.setMedicineMod(currentPlayer.getMod_Wisdom());}
        //Nature
        checked = currentPlayer.getSkillsFragment().getNatureCheck().isChecked();
        if(checked) {currentPlayer.setNatureMod(currentPlayer.getMod_Intelligence() + currentPlayer.getProficiency());}
        else {currentPlayer.setNatureMod(currentPlayer.getMod_Intelligence());}
        //Perception
        checked = currentPlayer.getSkillsFragment().getPerceptionCheck().isChecked();
        if(checked) {currentPlayer.setPerceptionMod(currentPlayer.getMod_Wisdom() + currentPlayer.getProficiency());}
        else {currentPlayer.setPerceptionMod(currentPlayer.getMod_Wisdom());}
        //Performance
        checked = currentPlayer.getSkillsFragment().getPerformanceCheck().isChecked();
        if(checked) {currentPlayer.setPerformanceMod(currentPlayer.getMod_Charisma() + currentPlayer.getProficiency());}
        else {currentPlayer.setPerformanceMod(currentPlayer.getMod_Charisma());}
        //Persuasion
        checked = currentPlayer.getSkillsFragment().getPersuasionCheck().isChecked();
        if(checked) {currentPlayer.setPersuasionMod(currentPlayer.getMod_Charisma() + currentPlayer.getProficiency());}
        else {currentPlayer.setPersuasionMod(currentPlayer.getMod_Charisma());}
        //Religion
        checked = currentPlayer.getSkillsFragment().getReligionCheck().isChecked();
        if(checked) {currentPlayer.setReligionMod(currentPlayer.getMod_Intelligence() + currentPlayer.getProficiency());}
        else {currentPlayer.setReligionMod(currentPlayer.getMod_Intelligence());}
        //Sleight of Hand
        checked = currentPlayer.getSkillsFragment().getSleightofhandCheck().isChecked();
        if(checked) {currentPlayer.setSleightofhandMod(currentPlayer.getMod_Dexterity() + currentPlayer.getProficiency());}
        else {currentPlayer.setSleightofhandMod(currentPlayer.getMod_Dexterity());}
        //Stealth
        checked = currentPlayer.getSkillsFragment().getStealthCheck().isChecked();
        if(checked) {currentPlayer.setStealthMod(currentPlayer.getMod_Dexterity() + currentPlayer.getProficiency());}
        else {currentPlayer.setStealthMod(currentPlayer.getMod_Dexterity());}
        //Survival
        checked = currentPlayer.getSkillsFragment().getSurvivalCheck().isChecked();
        if(checked) {currentPlayer.setSurvivalMod(currentPlayer.getMod_Wisdom() + currentPlayer.getProficiency());}
        else {currentPlayer.setSurvivalMod(currentPlayer.getMod_Wisdom());}
    }


    public void setMod_Strength(String s) {
        mod_Strength.setText(s);
    }

    public void setMod_Dexterity(String s) {
        mod_Dexterity.setText(s);
    }

    public void setMod_Constitution(String s) {
        mod_Constitution.setText(s);
    }

    public void setMod_Intelligence(String s) {
        mod_Intelligence.setText(s);
    }

    public void setMod_Wisdom(String s) {
        mod_Wisdom.setText(s);
    }

    public void setMod_Charisma(String s) {
        mod_Charisma.setText(s);
    }

    public void setArmorClass(String s) {
        armorClass.setText(s);
    }

    public String getName() { return name.getText().toString();}

}
