package g.sns_test;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class UniversityFragment extends Fragment {


    private ArrayList<UniversityData> arrayList;
    private UniversityAdapter universityadapter;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutmanager;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        String TAG = "UniversityFragment";

        View view = inflater.inflate(R.layout.fragment_university, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        layoutmanager = new GridLayoutManager(getActivity(),3);
        recyclerView.setLayoutManager(layoutmanager);
        recyclerView.setHasFixedSize(true);

        arrayList = new ArrayList<>();
        arrayList.add(new UniversityData("Huemechanic",R.drawable.daejeon));
        arrayList.add(new UniversityData("피노키오",R.drawable.daejeon));
        arrayList.add(new UniversityData("퍼펙트",R.drawable.daejeon));
        arrayList.add(new UniversityData("통기타",R.drawable.daejeon));
        arrayList.add(new UniversityData("춤",R.drawable.daejeon));
        arrayList.add(new UniversityData("노래",R.drawable.daejeon));

        universityadapter = new UniversityAdapter(arrayList);

        recyclerView.setAdapter(universityadapter);

        return view;
    }
}
