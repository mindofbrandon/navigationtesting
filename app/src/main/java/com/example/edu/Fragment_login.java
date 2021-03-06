package com.example.edu;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_login#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_login extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment_login() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_Login.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_login newInstance(String param1, String param2) {
        Fragment_login fragment = new Fragment_login();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    // implement navigation
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        NavController navController = Navigation.findNavController(view);


        //region user clicks sign up
        Button signUpButton = view.findViewById(R.id.signUpButton);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                EditText email = view.findViewById(R.id.emailData);
                EditText password = view.findViewById(R.id.passwordData);

                User user = new User(email.getText().toString(), password.getText().toString());

                NavDirections action = Fragment_loginDirections.actionFragmentLoginToFragmentSignup();

                navController.navigate(action); // send object from frag1 to frag2

                //NavDirections action = Fragment_SignUpDirections.actionFragmentOneToFragmentTwo(user); // if "user" shows error, rebuild project

                //navController.navigate(action); // send object from frag1 to frag2

            }
        });
        //endregion

        //region user clicks login
        Button loginButton = view.findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                EditText email = view.findViewById(R.id.emailData);
                EditText password = view.findViewById(R.id.passwordData);

                User user = new User(email.getText().toString(), password.getText().toString());

                NavDirections action = Fragment_loginDirections.actionFragmentLoginToFragmentHome();

                navController.navigate(action); // send object from frag1 to frag2

                //NavDirections action = Fragment_SignUpDirections.actionFragmentOneToFragmentTwo(user); // if "user" shows error, rebuild project

                //navController.navigate(action); // send object from frag1 to frag2

            }
        });

        //endregion
    }



}