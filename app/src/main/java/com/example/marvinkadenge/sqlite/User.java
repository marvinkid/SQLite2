package com.example.marvinkadenge.sqlite;

/**
 * Created by Marvin Kadenge on 01/11/2017.
 */

public class User {
    //private variables
    int _user_Id;



    String _First_Name;
    String _Middle_Name;
    String _last_Name;
    String _Phone_Number;

    //Empty User
    public User(){

    }

    //constructor
    public User(int _user_Id,String _First_Name, String _Middle_Name, String _last_Name, String _Phone_Number ) {
        this._user_Id = _user_Id;
        this._First_Name = _First_Name;
        this._Middle_Name = _Middle_Name;
        this._last_Name = _last_Name;
        this._Phone_Number = _Phone_Number;
    }
    public User(String _First_Name, String _Middle_Name, String _last_Name, String _Phone_Number ) {
        this._First_Name = _First_Name;
        this._Middle_Name = _Middle_Name;
        this._last_Name = _last_Name;
        this._Phone_Number = _Phone_Number;
    }




    //getting UserId
    public int getuser_Id(){
        return this._user_Id;
    }
    //setting userid
    public  void  setuserId(int _user_Id){
        this._user_Id=_user_Id;
    }

    //getting fname
    public String get_First_Name(){
        return this._First_Name;
    }

    public String get_Mname() {
        return this._Middle_Name;
    }
    public String get_last_Name() {
        return this._last_Name;
    }
    public String get_Phone_Number() {
        return this._Phone_Number;
    }



    //setting fname
    public  void  setFirstName(String _First_Name){
        this._First_Name = _First_Name;
    }

    //getting mname
//setting Mname
    public  void setMiddleName(String _Middle_Name){

        this._Middle_Name = _Middle_Name;
    }
    //getting lname
    //setting lname
    public  void setLastName(String _last_Name){
        this._last_Name = _last_Name;
    }
    //getting phone number
    //setting Mname
    public  void setPhoneNumber(String _Phone_Number){
        this._Phone_Number = _Phone_Number;
    }
}
