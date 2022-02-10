package com.example.finallproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MessageMainActivity extends AppCompatActivity {
    ListView listViewTopic;
    ArrayList<String> listofTopics = new ArrayList<String>();
    ArrayAdapter arrayAdapter;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference dbr = database.getReference("Topics");
    private FirebaseAuth mAuth;
    String UserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_main);

        listViewTopic = (ListView) findViewById(R.id.listviewMSG);
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listofTopics);
        listViewTopic.setAdapter(arrayAdapter);
        UserName = getUserName();
        dbr.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Set<String> set = new HashSet<String>();
                Iterator i = snapshot.getChildren().iterator();

                while(i.hasNext())
                {
                    set.add(((DataSnapshot)i.next()).getKey());
                }
                arrayAdapter.clear();
                arrayAdapter.addAll(set);
                arrayAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        listViewTopic.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(),TopicActivity.class);
                i.putExtra("Selected_Topic", ((TextView)view).getText().toString());
                i.putExtra("User_Name", UserName);
                startActivity(i);
            }
        });

    }
    public String getUserName()
    {
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        String name = user.getDisplayName();
        return name;
    }
}