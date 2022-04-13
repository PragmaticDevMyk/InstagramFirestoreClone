package com.ubunifu.appclone.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.ubunifu.appclone.OptionsActivity;
import com.ubunifu.appclone.R;

import de.hdodenhof.circleimageview.CircleImageView;


public class ProfileFragment extends Fragment {

    private ImageView options;
    private TextView username;
    private CircleImageView image_profile;
    private FirebaseFirestore mFirestore;
    private FirebaseAuth mAuth;
    String currentUserId;
    Context mContext;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_profile, container, false);

        mAuth = FirebaseAuth.getInstance();
        currentUserId = mAuth.getCurrentUser().getUid();
        mFirestore = FirebaseFirestore.getInstance();

        image_profile = view.findViewById(R.id.image_profile);
        username = view.findViewById(R.id.username);

        options = view.findViewById(R.id.options);
        options.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext() , OptionsActivity.class);
                startActivity(intent);
            }
        });

        getUserProfileData();
        return view;
    }

    private void getUserProfileData() {

//        DocumentReference documentReference = mFirestore.collection("Users").document(currentUserId);
//        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
//            @Override
//            public void onEvent(@Nullable DocumentSnapshot snapshot, @Nullable FirebaseFirestoreException error) {
//
//                if(snapshot.exists()) {
//
//                    Glide.with(mContext).load(snapshot.getString("profile_img_url")).placeholder(R.drawable.profile).into();
//
//                }
//            }
//        });

    }
}