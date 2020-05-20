package g.sns_test;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.nfc.Tag;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyPageAdapter extends RecyclerView.Adapter<MyPageAdapter.MyViewHolder> {


    final static String TAG = "MyPageAdapter";
    private Activity activity;
    private ArrayList<MyPageData> arrayList;


    public MyPageAdapter(Activity activity, ArrayList<MyPageData> arrayList) {
        this.activity = activity;
        this.arrayList = arrayList;
    }


    @Override
    public MyPageAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder 호출");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        MyViewHolder ViewHolder = new MyViewHolder(view);

        return ViewHolder;

    }

    @Override
    public void onBindViewHolder(MyPageAdapter.MyViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder 호출");

        MyPageData mypagedata = arrayList.get(position);

        holder.mypagelist.setText(mypagedata.getText());

    }

    @Override
    public int getItemCount() {
        Log.d(TAG, "getItemCount 호출");
        return arrayList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView mypagelist;

        public MyViewHolder(View view) {
            super(view);
            Log.d(TAG, "myviewholder 호출");
            mypagelist = view.findViewById(R.id.tv_list);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            Intent intent = new Intent(v.getContext(), ModificationActivity.class);
            v.getContext().startActivity(intent);


        }
    }

}
