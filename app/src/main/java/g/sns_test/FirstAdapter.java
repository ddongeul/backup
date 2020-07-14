package g.sns_test;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;

public class FirstAdapter extends RecyclerView.Adapter<g.sns_test.FirstAdapter.MyViewHolder> {

    final static String TAG = "FirstAdapter";

    private ArrayList<String> nTextViews;
    private ArrayList<String> nImageViews;
    private Context nContext;


    public FirstAdapter(Context context, ArrayList<String> texts, ArrayList<String> images) {

        nContext = context;
        nTextViews = texts;
        nImageViews = images;

    }

    @Override
    public FirstAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d(TAG, "FirstActivityAdapter 호출");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        MyViewHolder ViewHolder = new MyViewHolder(view);

        return ViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder 1 호출");

        Glide.with(nContext)
                .asBitmap()
                .load(nImageViews.get(position))
                .into(holder.nImageView);

        holder.nTextView.setText(nTextViews.get(position));
        holder.parentLayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClickListener 1 호출");
                final Intent intent;

                switch (holder.getAdapterPosition()){
                    case 0:
                        intent =  new Intent(nContext, UniversityCrewActivity.class);

                        String cr_name = "동아리명 : Mr.Mister" ;
                        String cr_location="장소";
                        String cr_introduce="소개";
                        String cr_work="활동";

                        intent.putExtra("cr_name",cr_name);
                        intent.putExtra("cr_location",cr_location);
                        intent.putExtra("cr_introduce",cr_introduce);
                        intent.putExtra("cr_work",cr_work);

//                        String cr_name5 = "동아리명 : 슈퍼스타" ;
//                        String cr_location5="장소";
//                        String cr_introduce5="소개";
//                        String cr_work5="활동";
//
//                        intent.putExtra("cr_name5",cr_name5);
//                        intent.putExtra("cr_location5",cr_location5);
//                        intent.putExtra("cr_introduce5",cr_introduce5);
//                        intent.putExtra("cr_work5",cr_work5);
                        break;

                    case 1:
                        intent =  new Intent(nContext, UniversityCrewActivity.class);

                        String cr_name1 = "동아리명 : 슈퍼스타";
                        String cr_location1="장소";
                        String cr_work1="활동";
                        String cr_introduce1="소개";

                        intent.putExtra("cr_name",cr_name1);
                        intent.putExtra("cr_location",cr_location1);
                        intent.putExtra("cr_introduce",cr_introduce1);
                        intent.putExtra("cr_work",cr_work1);
                        break;

                    case 2:
                    intent =  new Intent(nContext, UniversityCrewActivity.class);
                    String cr_name2 = "동아리명 : perfect";
                    String cr_location2="장소";
                    String cr_introduce2="소개";
                    String cr_work2="활동";

                    intent.putExtra("cr_name",cr_name2);
                    intent.putExtra("cr_location",cr_location2);
                    intent.putExtra("cr_introduce",cr_introduce2);
                    intent.putExtra("cr_work",cr_work2);
                    break;

                    case 3:
                    intent =  new Intent(nContext, UniversityCrewActivity.class);
                    String cr_name3 = "동아리명 : perfect";
                    String cr_location3="장소";
                    String cr_introduce3="소개";
                    String cr_work3="활동";

                    intent.putExtra("cr_name",cr_name3);
                    intent.putExtra("cr_location",cr_location3);
                    intent.putExtra("cr_introduce",cr_introduce3);
                    intent.putExtra("cr_work",cr_work3);
                    break;

                    case 4:
                    intent =  new Intent(nContext, UniversityCrewActivity.class);
                    String cr_name4 = "동아리명 : perfect";
                    String cr_location4="장소";
                    String cr_introduce4="소개";
                    String cr_work4="활동";

                    intent.putExtra("cr_name",cr_name4);
                    intent.putExtra("cr_location",cr_location4);
                    intent.putExtra("cr_introduce",cr_introduce4);
                    intent.putExtra("cr_work",cr_work4);
                    break;

                    default:
                        intent =  new Intent(nContext, UniversityCrewActivity.class);
                        String cr_name5 = "동아리명 : perfect";
                        String cr_location5="장소";
                        String cr_introduce5="소개";
                        String cr_work5="활동";

                        intent.putExtra("cr_name",cr_name5);
                        intent.putExtra("cr_location",cr_location5);
                        intent.putExtra("cr_introduce",cr_introduce5);
                        intent.putExtra("cr_work",cr_work5);
                        break;


                }

                intent.putExtra("image_names",nTextViews.get(position));
                intent.putExtra("image_urls",nImageViews.get(position));

                nContext.startActivity(intent.addFlags(FLAG_ACTIVITY_NEW_TASK));
            }
        });

//        holder.parentLayout.setOnLongClickListener(new View.OnLongClickListener(){
//            @Override
//            public boolean onLongClick(View v) {
//
//                remove(holder.getAdapterPosition());
//
//                return true;
//            }
//        });
    }

    @Override
    public int getItemCount() {
        Log.d(TAG, "getItemCount 호출");
        return nTextViews.size();
    }

//    public void remove(int position){
//        try{
//            nTextViews.remove(position);
//            nImageViews.remove(position);
//            notifyItemRemoved(position);
//        }catch(IndexOutOfBoundsException ex){
//            ex.printStackTrace();
//        }
//    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView nTextView;
        ImageView nImageView;
        CardView parentLayout;

        public MyViewHolder(View view) {
            super(view);
            Log.d(TAG, "myviewholder 호출");
            nTextView = view.findViewById(R.id.tv_list);
            nImageView = view.findViewById(R.id.uv_picture);
            parentLayout = view.findViewById(R.id.parentLayout);
            nContext = view.getContext();
        }

    }

}