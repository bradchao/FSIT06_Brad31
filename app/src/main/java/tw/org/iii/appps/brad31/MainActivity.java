package tw.org.iii.appps.brad31;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private MyAdapter adapter;
    private LinkedList<Member> members = new LinkedList<>();
    private int[] imgs = {R.drawable.ball0, R.drawable.ball1,
            R.drawable.ball2,R.drawable.ball3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createMembers();
        listView = findViewById(R.id.listView);
        initListView();
    }

    private void createMembers(){
        for (int i=0; i<20; i++){
            Member member = new Member("Name" + i,
                    (int)(Math.random()*4));
            members.add(member);
        }
    }


    private void initListView (){
        adapter = new MyAdapter();
        listView.setAdapter(adapter);
    }

    private class MyAdapter extends BaseAdapter {
        private LayoutInflater inflater;

        public MyAdapter(){
            inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            //inflater = getLayoutInflater();
        }
        @Override
        public int getCount() {
            return members.size();
        }

        @Override
        public Object getItem(int i) {
            return members.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View itemView = inflater.inflate(R.layout.item,viewGroup,false );

            TextView title = itemView.findViewById(R.id.item_title);
            ImageView img = itemView.findViewById(R.id.item_img);
            Button test1 = itemView.findViewById(R.id.item_test1);
            Button test2 = itemView.findViewById(R.id.item_test2);

            return itemView;
        }
    }



}
