package g.sns_test;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UniversityAdapter extends RecyclerView.Adapter<g.sns_test.UniversityAdapter.MyViewHolder> {


    final static String TAG = "University";
    private Activity activity;
    private ArrayList<UniversityData> arrayList;

//
//    public UniversityAdapter (Activity activity, ArrayList<UniversityData> arrayList) {
//
//    }

    public UniversityAdapter(ArrayList<UniversityData> arrayList) {

        this.activity = activity;
        this.arrayList = arrayList;

    }



    @Override
    public UniversityAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d(TAG, "UniversityAdapter 호출");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        MyViewHolder ViewHolder = new MyViewHolder(view);

        return ViewHolder;

    }

    @Override
    public void onBindViewHolder(UniversityAdapter.MyViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder 호출");

        UniversityData universitydata = arrayList.get(position);

        holder.universitylist.setText(universitydata.getText());
        holder.universitylist2.setImageResource(universitydata.getImage());
    }


    @Override
    public int getItemCount() {
        Log.d(TAG, "getItemCount 호출");
        return arrayList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView universitylist;
        ImageView universitylist2;

        public MyViewHolder(View view) {
            super(view);
            Log.d(TAG, "myviewholder 호출");
            universitylist = view.findViewById(R.id.tv_list);
            universitylist2 = view.findViewById(R.id.uv_picture);

            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            Intent intent = new Intent(v.getContext(), UniversityTextActivity.class);
            v.getContext().startActivity(intent);


        }
    }

}
