package com.example.viewsdemo;

import android.app.Application;
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

private final String ftag="First Fragment";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(ftag,"Fragment's onCreate called");
        Toast.makeText(getActivity().getApplicationContext(), "Fragment's onCreate Called", Toast.LENGTH_SHORT).show();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i(ftag,"Fragment's onCreateView called");
        Toast.makeText(getActivity().getApplicationContext(), "Fragment's onCreateView Called", Toast.LENGTH_SHORT).show();

        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i(ftag,"Fragment's onAttach called");
        Toast.makeText(getActivity().getApplicationContext(), "Fragment's onAttach Called", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(ftag,"Fragment's ondestroy called");
        Toast.makeText(getActivity().getApplicationContext(), "Fragment's destroy Called", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(ftag,"Fragment's detach called");
        Toast.makeText(getActivity().getApplicationContext(), "Fragment's detach Called", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(ftag,"Fragment's start called");
        Toast.makeText(getActivity().getApplicationContext(), "Fragment's start Called", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(ftag,"Fragment's resume called");
        Toast.makeText(getActivity().getApplicationContext(), "Fragment's resume Called", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(ftag,"Fragment's stop called");
        Toast.makeText(getActivity().getApplicationContext(), "Fragment's stop Called", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(ftag,"Fragment's pause called");
        Toast.makeText(getActivity().getApplicationContext(), "Fragment's pause Called", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(ftag,"Fragment's ondestroyView called");
        Toast.makeText(getActivity().getApplicationContext(), "Fragment's ondestroyView Called", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i(ftag,"Fragment's onactivitycreated called");
        Toast.makeText(getActivity().getApplicationContext(), "Fragment's onactivitycreated Called", Toast.LENGTH_SHORT).show();
    }
}
