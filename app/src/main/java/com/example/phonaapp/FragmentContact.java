package com.example.phonaapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {
    View v;
    private RecyclerView myrecyclerView;
    private List<Contact>lsContact;
    public FragmentContact() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v= inflater.inflate(R.layout.contact_fragment,container,false);
myrecyclerView=v.findViewById(R.id.contact_recycler);
RecyclerViewAdapter recyclerAdapter=new RecyclerViewAdapter(getContext(),lsContact);
myrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
myrecyclerView.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lsContact=new ArrayList<>();
        lsContact.add(new Contact("Aya Shreif",R.drawable.ba,"0112455255"));
        lsContact.add(new Contact("Aya hmed ",R.drawable.baby,"010245865335"));
        lsContact.add(new Contact("Ahmed Ali ",R.drawable.uservoyager,"01124565876"));
        lsContact.add(new Contact("Medo Salah",R.drawable.user,"0112455255"));
        lsContact.add(new Contact(" Reem Mosad ",R.drawable.ba,"010245865335"));
        lsContact.add(new Contact("Mosad Gad ",R.drawable.uservoyager,"01124565876"));
        lsContact.add(new Contact("Mona Mohamed",R.drawable.baby,"0112455255"));
        lsContact.add(new Contact("Rana Mosad",R.drawable.ba,"010245865335"));
        lsContact.add(new Contact("Fatma Mohamed ",R.drawable.banota,"01124565876"));
        lsContact.add(new Contact("Aya Shreif",R.drawable.ba,"0112455255"));
        lsContact.add(new Contact("Aya hmed ",R.drawable.baby,"010245865335"));
        lsContact.add(new Contact("Ahmed Ali ",R.drawable.uservoyager,"01124565876"));
        lsContact.add(new Contact("Medo Salah",R.drawable.baby,"0112455255"));
        lsContact.add(new Contact(" Reem Mosad ",R.drawable.user,"010245865335"));
        lsContact.add(new Contact("Mosad Gad ",R.drawable.banota,"01124565876"));
        lsContact.add(new Contact("Mona Mohamed",R.drawable.baby,"0112455255"));
        lsContact.add(new Contact("Rana Mosad",R.drawable.ba,"010245865335"));
        lsContact.add(new Contact("Fatma Mohamed ",R.drawable.banota,"01124565876"));
        lsContact.add(new Contact("Aya Shreif",R.drawable.ba,"0112455255"));
        lsContact.add(new Contact("Aya hmed ",R.drawable.baby,"010245865335"));
        lsContact.add(new Contact("Ahmed Ali ",R.drawable.uservoyager,"01124565876"));
        lsContact.add(new Contact("Medo Salah",R.drawable.user,"0112455255"));
        lsContact.add(new Contact(" Reem Mosad ",R.drawable.ba,"010245865335"));
        lsContact.add(new Contact("Mosad Gad ",R.drawable.uservoyager,"01124565876"));
        lsContact.add(new Contact("Mona Mohamed",R.drawable.baby,"0112455255"));
        lsContact.add(new Contact("Rana Mosad",R.drawable.ba,"010245865335"));
        lsContact.add(new Contact("Fatma Mohamed ",R.drawable.banota,"01124565876"));
        lsContact.add(new Contact("Aya Shreif",R.drawable.ba,"0112455255"));
        lsContact.add(new Contact("Aya hmed ",R.drawable.baby,"010245865335"));
        lsContact.add(new Contact("Ahmed Ali ",R.drawable.uservoyager,"01124565876"));
        lsContact.add(new Contact("Medo Salah",R.drawable.baby,"0112455255"));
        lsContact.add(new Contact(" Reem Mosad ",R.drawable.user,"010245865335"));
        lsContact.add(new Contact("Mosad Gad ",R.drawable.banota,"01124565876"));
        lsContact.add(new Contact("Mona Mohamed",R.drawable.baby,"0112455255"));
        lsContact.add(new Contact("Rana Mosad",R.drawable.ba,"010245865335"));
        lsContact.add(new Contact("Fatma Mohamed ",R.drawable.banota,"01124565876"));




    }
}
