package com.example.ansam.simpleadapterwithgview;

import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.SimpleCursorAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    String princess[]={"Rapunzel","Cinderella","Pacahontas","Snow White","Jasmine","Aurora","Ariel","Bella","Mulan"};
    int images[]={R.drawable.rapunzel,R.drawable.cinderella,R.drawable.pacahontas,R.drawable.snow,
    R.drawable.jasmine,R.drawable.aurora,R.drawable.ariel,R.drawable.bella,R.drawable.mulan};
    String from[]={"image","txt"};
    int to[]={R.id.image,R.id.princess};
    SimpleAdapter adapter;
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=(GridView)findViewById(R.id.gridView);
        List<HashMap<String,String>> list=new ArrayList<HashMap<String, String>>();
         for(int i=0;i<9;i++){
             HashMap<String,String> hm=new HashMap<String, String>();
             hm.put("txt",princess[i]);
             hm.put("image",Integer.toString(images[i]));
             list.add(hm);
         }
        adapter=new SimpleAdapter(getBaseContext(),list,R.layout.grid_layout,from,to);
        gridView.setNumColumns(3);
        gridView.setAdapter(adapter);

    }
}
