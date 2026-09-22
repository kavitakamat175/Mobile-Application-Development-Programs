package com.example.flcdemo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class FirstFragment extends Fragment {
private final String fTAG="First Fragment";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(fTAG,"Fragment's onCreate method called");
        Toast.makeText(getActivity().getApplicationContext(), "Fragment's onCreate called", Toast.LENGTH_LONG).show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.i(fTAG,"Fragment's onCreateView method called");
        Toast.makeText(getActivity().getApplicationContext(), "Fragment's onCreateView called", Toast.LENGTH_LONG).show();
        return inflater.inflate(R.layout.fragment_first, container, false);

    }

    @Override
    public void onAttach(@NonNull Activity activity) {
        super.onAttach(activity);
        Log.i(fTAG,"Fragment's onAttach method called");
        Toast.makeText(getActivity().getApplicationContext(), "Fragment's onAttach called", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i(fTAG,"Fragment's onActivityCreated method called");
        Toast.makeText(getActivity().getApplicationContext(), "Fragment's onActivityCreated called", Toast.LENGTH_LONG).show();

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(fTAG,"Fragment's onStart method called");
        Toast.makeText(getActivity().getApplicationContext(), "Fragment's onStart called", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(fTAG,"Fragment's onStop method called");
        Toast.makeText(getActivity().getApplicationContext(), "Fragment's onStop called", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(fTAG,"Fragment's onDestroyView method called");
        Toast.makeText(getActivity().getApplicationContext(), "Fragment's onDestroyView called", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(fTAG,"Fragment's onPause method called");
        Toast.makeText(getActivity().getApplicationContext(), "Fragment's onPause called", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(fTAG,"Fragment's onResume method called");
        Toast.makeText(getActivity().getApplicationContext(), "Fragment's onResume called", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(fTAG,"Fragment's onDetach method called");
        Toast.makeText(getActivity().getApplicationContext(), "Fragment's onDetach called", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(fTAG,"Fragment's onDestroy method called");
        Toast.makeText(getActivity().getApplicationContext(), "Fragment's onDestroy called", Toast.LENGTH_LONG).show();
    }

}