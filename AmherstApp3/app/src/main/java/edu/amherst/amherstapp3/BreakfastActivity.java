package edu.amherst.amherstapp3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ExecutionException;

public class BreakfastActivity extends AppCompatActivity {

    private TextView menuTxt;

    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);

        listview = (ListView) this.findViewById(R.id.listview);



        //ArrayList<Menu> items = FileUtil.readFromFile(this);
        Calendar todayDate = Calendar.getInstance();
        Date nowDate = todayDate.getTime();
        //DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX");
        SimpleDateFormat form1 = new SimpleDateFormat("yyyy-MM-dd");
        String dateToday = form1.format(nowDate);
        //System.out.println(todayDate);
        //AsyncTask asdf = new MyAsyncTask().execute(todayDate);

        try {
            ArrayList<Menu> items = new MyAsyncTask().execute(dateToday).get();
            ArrayList<String> listItems = new ArrayList<String>();
            ArrayList<Menu>itemSet = new ArrayList<Menu>();
            for(int i = 0; i < items.size();i++){
                if(items.get(i).getType().equals("Breakfast")){
                    itemSet.add(items.get(i));
                    Menu mItem = items.get(i);
                    listItems.add(mItem.getItems());
                }
            }

            MenuArrayAdapter adapter = new MenuArrayAdapter (this,itemSet);
            listview.setAdapter(adapter);
        }

        catch(InterruptedException e){}
        catch(ExecutionException e1){}

            }
        }



