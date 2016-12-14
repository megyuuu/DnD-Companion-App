package com.uconn.mengying.dnd;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainActivity extends AppCompatActivity {

    Player currentPlayer = new Player();
    ListView saves;
    ArrayAdapter<File> saveList;


    //TODO: 1. incorporate Saving/Loading using either the settings menu, or the provided Fragment_Saves
    //TODO: 2.  properly integrate Leon's Dice Roller
    //TODO: 3. add more Labels to xml files. currently a lot of textboxes only have a "hint" for a description
    //TODO:    I would like these to have proper labels instead.
    //TODO:


    /**
     * The {@link PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    //private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        //client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /* These are the method calls for onClick functions in the settings menu.
        if (id == R.id.action_save) {
            savePlayer();
        }
        else if (id == R.id.action_load) {
            loadPlayer();
        }
        else if (id == R.id.action_new){
            newPlayer();
        }
        */

        return super.onOptionsItemSelected(item);
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
//    public Action getIndexApiAction() {
//        Thing object = new Thing.Builder()
//                .setName("Main Page") // TODO: Define a title for the content shown.
//                // TODO: Make sure this auto-generated URL is correct.
//                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
//                .build();
//        return new Action.Builder(Action.TYPE_VIEW)
//                .setObject(object)
//                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
//                .build();
//    }

//    @Override
//    public void onStart() {
//        super.onStart();
//
//        // ATTENTION: This was auto-generated to implement the App Indexing API.
//        // See https://g.co/AppIndexing/AndroidStudio for more information.
//        client.connect();
//        AppIndex.AppIndexApi.start(client, getIndexApiAction());
//    }
//
//    @Override
//    public void onStop() {
//        super.onStop();
//
//        // ATTENTION: This was auto-generated to implement the App Indexing API.
//        // See https://g.co/AppIndexing/AndroidStudio for more information.
//        AppIndex.AppIndexApi.end(client, getIndexApiAction());
//        client.disconnect();
//    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            //TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            // textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        //TODO: add Leon's DiceActivity as a fragment in the method below.
        //TODO: also, if save/load is done through fragment. add fragment and adjust the
        //TODO: number of overall fragments.

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            if(position == 0){
                return currentPlayer.getMainFragment();
            }
            else if(position == 1){
                return currentPlayer.getSkillsFragment();
            }
            else if(position == 2){
                return currentPlayer.getEquipmentFragment();
            }
            else if(position == 3){
                return currentPlayer.getSpellsFragment();
            }
            else if(position == 4) {
                return currentPlayer.getMiscFragment();
            }
            else if(position == 5){
                return currentPlayer.getDiceFragment();
            }
            else
                return PlaceholderFragment.newInstance(position + 1);

        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 6;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "SECTION 1";
                case 1:
                    return "SECTION 2";
                case 2:
                    return "SECTION 3";
                case 3:
                    return "meh";
                case 4:
                    return "nah";
            }
            return null;
        }
    }

    public void onCheckBoxClicked(View view){
        currentPlayer.getMainFragment().updateSkills();
    }

    public void newPlayer(){
        currentPlayer = new Player();
    }

    //TODO: this is code for saving and loading characters (Courtesy of Austin) It's not fully implemented as of yet

    //had View view as parameter
    public void savePlayer(){
        Log.v("QQ", "Saving player, name: " + currentPlayer.getMainFragment().getName());
        //FileOutputStream fos = getFilesDir().openFileOutput(currentPlayer.getPlayer_name(), Context.MODE_PRIVATE);


        //TODO Save *every field* of the player
        //may be able to just use the fragments themselves

        //currentPlayer.
        FileOutputStream fos;
        try {
            String fileName;
            if(currentPlayer.getMainFragment().getName().equals("")){
                fileName = "Default";}
            else    {fileName = currentPlayer.getMainFragment().getName();}
            fos = openFileOutput(fileName, Context.MODE_PRIVATE);
            //os.write(currentPlayer);
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(currentPlayer);

            os.close();
            fos.close();
        }
        catch(IOException e){
            //Something went wrong. What? What should we do?
            e.printStackTrace();

            //TODO add failure behavior(save player)
        }
        //unsure why this is here
        //setFields();
    }


    //had View view as parameter
    public void loadPlayer(){
        //select player from our list
        //TODO This is deprecated.
        int selected = saves.getSelectedItemPosition();
        Log.v("QQ", "Selected item = " + selected);
        String filename = saveList.getItem(selected).getName();
        //System.out.println(selected + " chosen, name " + filename);
        Log.v("QQ", selected + " chosen, name " + filename);



        //load player from storage
        FileInputStream fis;
        Player loaded = new Player();  //Initialize the player so that the code doesn't break if loading fails
        try{
            fis = openFileInput(filename);
            ObjectInputStream is = new ObjectInputStream(fis);
            loaded = (Player) is.readObject();

            is.close();
            fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            //TODO Add failure behavior: File Not Found(load player)
        } catch (IOException e) {
            e.printStackTrace();
            //TODO Add failure behavior (load player)
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            //TODO Add failure behavior (load player)
            //Note: Why would the class not be found?
        }

        //initialize player
        //Step 1: Save currently active player
        //savePlayer();
        currentPlayer = loaded;

        //reset fields
        // setFields();

    }



}
