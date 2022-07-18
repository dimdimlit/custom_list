package com.example.mymorningcustomlistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    //Instantiate our list view
    var mlist:ListView ?= null
    var users:ArrayList<User> ?= null
    var adapter:CustomAdapter ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mlist = findViewById(R.id.mListUsers)
        users = ArrayList()
        adapter = CustomAdapter(this,users!!)
        //Start creating users
        var user1 = User(R.mipmap.imageone,"King Wanyama","0755214697")
        var user2 = User(R.mipmap.imagetwo,"Simon Michalis","0744158795")
        var user3 = User(R.mipmap.imagethree,"Fred Stevens","0714598756")
        var user4 = User(R.mipmap.imagefour,"Sara Malik","0741789652")
        var user5 = User(R.mipmap.imageone,"Quine Wagara","0746552197")
        var user6 = User(R.mipmap.imagetwo,"Mary Ann","0756987436")
        var user7 = User(R.mipmap.imagethree,"Miriam Adobe","0714238294")
        var user8 = User(R.mipmap.imagefour,"Vincent Mara","0778631967")
        var user9 = User(R.mipmap.imagetwo,"Monica Gallager","0779363315")

        //Add the created users to the arraylist users
        users!!.add(user1)
        users!!.add(user2)
        users!!.add(user3)
        users!!.add(user4)
        users!!.add(user5)
        users!!.add(user6)
        users!!.add(user7)
        users!!.add(user8)
        users!!.add(user9)

        //Assign our custom adapter to the listview
        mlist!!.adapter = adapter!!
    }
}