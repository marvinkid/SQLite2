package com.example.marvinkadenge.sqlite;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

/**
 * Created by Marvin Kadenge on 01/11/2017.
 */

public class AndroidSQLiteTutorialActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db = new DatabaseHandler(this);

        /**
         *  CRUD Operations
         * */
// Inserting Contacts
        Log.d("Insert: ", "Inserting ..");
        db.addContact(new Contacts("Mercy", "09090909"));
        db.addContact(new Contacts("John","123456"));
        db.addContact(new Contacts("Tina", "654321"));
        db.addContact(new Contacts("Andrew","07070505"));

        //Reading all contacts

        Log.d("Reading: ","Reading all contacts..");
        List<Contacts> contacts = db.getAllContacts();

        for (Contacts cn : contacts) {
            String log = "Id: "+cn.getID()+" ,Name: " + cn.getName() + ",phone: " + cn.getPhoneNumber();
            Log.d("Name: ", log);
        }

        //Inserting Users
        Log.d("Insert: ", "Inserting..");
        db.addUser(new User("James","Lee","Wayne","+254721582482"));
        db.addUser(new User("Dermacus","Boogie","Cousins","+254720000567"));

        //Reading all users
        Log.d("Reading: ", "Reading all Users..");
        List<User> users = db.getAllUsers();

        for (User cn : users) {
            String log = "Id: "+cn.getuser_Id()+" ,_First_name: " + cn.get_First_Name() + ", _middle_name: " +cn.get_Mname() + " ,_last_name: " +cn.get_last_Name() +",_phone_number: "+cn.get_Phone_Number();
        }

    }

}

