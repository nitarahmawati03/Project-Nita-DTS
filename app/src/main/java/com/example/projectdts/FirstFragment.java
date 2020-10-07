package com.example.projectdts;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.projectdts.Adapter.ContactAdapter;
import com.example.projectdts.Model.Contact;

import java.util.ArrayList;
import java.util.List;


public class FirstFragment extends Fragment{

    View mView;
    public RecyclerView rv;
    public ContactAdapter contactAdapter;
    public RecyclerView.LayoutManager layoutManager;
    public List<Contact> listContact = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_first,container,false);

        rv = mView.findViewById(R.id.rvContact);

        daftarContact();
        contactAdapter = new ContactAdapter(listContact);
//        contactAdapter.setListener((ContactAdapter.OnContactClickListener) getActivity());

        layoutManager = new LinearLayoutManager(getActivity());
        rv.setAdapter(contactAdapter);
        rv.setLayoutManager(layoutManager);


        return mView;
    }


    private void daftarContact(){
        listContact.add(new Contact("Oseng Tempe",
                "1",
                "https://www.masakapahariini.com/wp-content/uploads/2018/04/resep_oseng_tempe_MAHI-780x440.jpg"));

        listContact.add(new Contact("Sop Ayam",
                "2",
                "https://akcdn.detik.net.id/community/media/visual/2019/08/27/c8d5c78d-8e8f-4df8-a846-789c1fd9abf3_43.jpeg?w=700&q=90"));

        listContact.add(new Contact("Bakso",
                "3",
                "https://cdns.klimg.com/merdeka.com/i/w/news/2019/12/11/1132603/670x335/5-cara-membuat-bakso-sapi-ayam-dan-ikan-ala-rumahan.jpg"));

        listContact.add(new Contact("Nasi Goreng",
                "4",
                "https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1515557737/asxtrr2ga1os4abfmuoe.jpg"));
    }
}