package com.uconn.mengying.dnd;

/**
 * Created by Tristan on 11/25/2016.
 */

import java.io.Serializable;
import java.util.ArrayList;

public class Player implements Serializable {

    // Adding all of the variables by fragment
    fragment_main mainFragment;
    Fragment_skills skillsFragment;
    Fragment_equipment equipmentFragment;
    Fragment_Spells spellsFragment;
    Fragment_Miscellaneous miscFragment;
    DiceActivity diceFragment;



    //TODO: I think most of these values are unnecessary. The only things needed for saving are the
    //TODO:fragments as they store their own values. any methods using these could be implemented
    //TODO: using just the fragments variables.
    //From: Fragment_Main
    /////////////////////////
    //values which determine others
    int proficiency;
    int score_Strength;
    int score_Dexterity;
    int score_Constitution;
    int score_Intelligence;
    int score_Wisdom;
    int score_Charisma;

    //values set by others
    int armorClass;
    int mod_Strength;
    int mod_Dexterity;
    int mod_Constitution;
    int mod_Intelligence;
    int mod_Wisdom;
    int mod_Charisma;

    //values input by user
    String name;
    String classandLevel;
    String health;
    String hitDice;
    String initiative;
    String speed;
    String xp;
    String save_Strength;
    String save_Dexterity;
    String save_Constitution;
    String save_Intelligence;
    String save_Wisdom;
    String save_Charisma;
    ///////////////

    //From:Fragment_Skills
    ////////////////////////
    int athleticsMod;
    int acrobaticsMod;
    int sleightofhandMod;
    int stealthMod;
    int arcanaMod;
    int historyMod;
    int investigationMod;
    int natureMod;
    int religionMod;
    int animalhandlingMod;
    int insightMod;
    int medicineMod;
    int perceptionMod;
    int survivalMod;
    int deceptionMod;
    int intimidationMod;
    int performanceMod;
    int persuasionMod;
    /////////////////////////



    public Player(){
        mainFragment = fragment_main.newInstance(this);
        skillsFragment = Fragment_skills.newInstance(this);
        equipmentFragment = Fragment_equipment.newInstance(this);
        spellsFragment = Fragment_Spells.newInstance(this);
        miscFragment = Fragment_Miscellaneous.newInstance(this);
        diceFragment = DiceActivity.newInstance(this);
        initialize();
    }


    private void initialize(){
        proficiency = 0;
        score_Strength = 10;
        score_Dexterity = 10;
        score_Constitution = 10;
        score_Intelligence = 10;
        score_Wisdom = 10;
        score_Charisma = 10;
    }





    ////////////////////////////////////////////////////////////////////////

    //  ALL the Getters and Setters so far

    public fragment_main getMainFragment(){
        return mainFragment;
    }

    public Fragment_skills getSkillsFragment(){
        return skillsFragment;
    }

    public Fragment_equipment getEquipmentFragment() { return equipmentFragment;}

    public Fragment_Spells getSpellsFragment() { return spellsFragment;}

    public Fragment_Miscellaneous getMiscFragment() {return miscFragment;}

    public DiceActivity getDiceFragment() { return diceFragment;}


    public void setProficiency(int proficiency) {
        this.proficiency = proficiency;
    }

    public void setScore_Strength(int score_Strength) {
        this.score_Strength = score_Strength;
        this.mod_Strength = (int)Math.floor(score_Strength/2)-5;
        mainFragment.setMod_Strength(Integer.toString(mod_Strength));
    }

    public void setScore_Dexterity(int score_Dexterity) {
        this.score_Dexterity = score_Dexterity;
        this.mod_Dexterity = (int)Math.floor(score_Dexterity/2)-5;
        mainFragment.setMod_Dexterity(Integer.toString(mod_Dexterity));
    }

    public void setScore_Constitution(int score_Constitution) {
        this.score_Constitution = score_Constitution;
        this.mod_Constitution = (int)Math.floor(score_Constitution/2)-5;
        mainFragment.setMod_Constitution(Integer.toString(mod_Constitution));
    }

    public void setScore_Charisma(int score_Charisma) {
        this.score_Charisma = score_Charisma;
        this.mod_Charisma = (int)Math.floor(score_Charisma/2)-5;
        mainFragment.setMod_Charisma(Integer.toString(mod_Charisma));
    }

    public void setScore_Wisdom(int score_Wisdom) {
        this.score_Wisdom = score_Wisdom;
        this.mod_Wisdom = (int)Math.floor(score_Wisdom/2)-5;
        mainFragment.setMod_Wisdom(Integer.toString(mod_Wisdom));
    }

    public void setScore_Intelligence(int score_Intelligence) {
        this.score_Intelligence = score_Intelligence;
        this.mod_Intelligence = (int)Math.floor(score_Intelligence/2)-5;
        mainFragment.setMod_Intelligence(Integer.toString(mod_Intelligence));
    }

    public void setAthleticsMod(int athleticsMod) {
        this.athleticsMod = athleticsMod;
        skillsFragment.setAthleticsMod(Integer.toString(athleticsMod));
    }

    public void setAcrobaticsMod(int acrobaticsMod) {
        this.acrobaticsMod = acrobaticsMod;
        skillsFragment.setAcrobaticsMod(Integer.toString(acrobaticsMod));
    }

    public void setSleightofhandMod(int sleightofhandMod) {
        this.sleightofhandMod = sleightofhandMod;
        skillsFragment.setSleightofhandMod(Integer.toString(sleightofhandMod));
    }

    public void setStealthMod(int stealthMod) {
        this.stealthMod = stealthMod;
        skillsFragment.setStealthMod(Integer.toString(stealthMod));
    }

    public void setArcanaMod(int arcanaMod) {
        this.arcanaMod = arcanaMod;
        skillsFragment.setArcanaMod(Integer.toString(arcanaMod));
    }

    public void setHistoryMod(int historyMod) {
        this.historyMod = historyMod;
        skillsFragment.setHistoryMod(Integer.toString(historyMod));
    }

    public void setInvestigationMod(int investigationMod) {
        this.investigationMod = investigationMod;
        skillsFragment.setInvestigationMod(Integer.toString(investigationMod));
    }

    public void setNatureMod(int natureMod) {
        this.natureMod = natureMod;
        skillsFragment.setNatureMod(Integer.toString(natureMod));
    }

    public void setReligionMod(int religionMod) {
        this.religionMod = religionMod;
        skillsFragment.setReligionMod(Integer.toString(religionMod));
    }

    public void setAnimalhandlingMod(int animalhandlingMod) {
        this.animalhandlingMod = animalhandlingMod;
        skillsFragment.setAnimalhandlingMod(Integer.toString(animalhandlingMod));
    }

    public void setInsightMod(int insightMod) {
        this.insightMod = insightMod;
        skillsFragment.setInsightMod(Integer.toString(insightMod));
    }

    public void setMedicineMod(int medicineMod) {
        this.medicineMod = medicineMod;
        skillsFragment.setMedicineMod(Integer.toString(medicineMod));
    }

    public void setPerceptionMod(int perceptionMod) {
        this.perceptionMod = perceptionMod;
        skillsFragment.setPerceptionMod(Integer.toString(perceptionMod));
    }

    public void setSurvivalMod(int survivalMod) {
        this.survivalMod = survivalMod;
        skillsFragment.setSurvivalMod(Integer.toString(survivalMod));
    }

    public void setDeceptionMod(int deceptionMod) {
        this.deceptionMod = deceptionMod;
        skillsFragment.setDeceptionMod(Integer.toString(deceptionMod));
    }

    public void setIntimidationMod(int intimidationMod) {
        this.intimidationMod = intimidationMod;
        skillsFragment.setIntimidationMod(Integer.toString(intimidationMod));
    }

    public void setPerformanceMod(int performanceMod) {
        this.performanceMod = performanceMod;
        skillsFragment.setPerformanceMod(Integer.toString(performanceMod));
    }

    public void setPersuasionMod(int persuasionMod) {
        this.persuasionMod = persuasionMod;
        skillsFragment.setPersuasionMod(Integer.toString(persuasionMod));
    }

    public int getProficiency(){
        return proficiency;
    }

    public int getMod_Strength() {
        return mod_Strength;
    }

    public int getMod_Dexterity() {
        return mod_Dexterity;
    }

    public int getMod_Constitution() {
        return mod_Constitution;
    }

    public int getMod_Intelligence() {
        return mod_Intelligence;
    }

    public int getMod_Wisdom() {
        return mod_Wisdom;
    }

    public int getMod_Charisma() {
        return mod_Charisma;
    }
}
