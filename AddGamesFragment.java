package com.example.finallproject;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AddGamesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AddGamesFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    static Boolean game1 =false;
    static Boolean game2 =false;
    static Boolean game3 =false;
    static Boolean game4 =false;
    static Boolean game5 =false;
    static Boolean game6 =false;
    static Boolean game7 =false;
    static Boolean game8 =false;
    static Boolean game9 =false;
    static Boolean game10 =false;
    static Boolean game11 =false;
    static Boolean game12 =false;


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AddGamesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AddGamesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AddGamesFragment newInstance(String param1, String param2) {
        AddGamesFragment fragment = new AddGamesFragment();
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
        View view =  inflater.inflate(R.layout.fragment_add_games, container, false);
        MainActivity mainActivity = (MainActivity) getActivity();
        Person person = mainActivity.CreatePerson();

        ImageButton sims = view.findViewById(R.id.game1);
        sims.setImageResource(R.drawable.sims);

        ImageButton amongus = view.findViewById(R.id.game2);
        amongus.setImageResource(R.drawable.amongus);

        ImageButton fifa21 = view.findViewById(R.id.game3);
        fifa21.setImageResource(R.drawable.fifa21);

        ImageButton angrybirds = view.findViewById(R.id.game4);
        angrybirds.setImageResource(R.drawable.angrybirds);

        ImageButton fortnite = view.findViewById(R.id.game5);
        fortnite.setImageResource(R.drawable.fortnite);

        ImageButton fruitninja = view.findViewById(R.id.game6);
        fruitninja.setImageResource(R.drawable.fruitninja);

        ImageButton gta = view.findViewById(R.id.game7);
        gta.setImageResource(R.drawable.gta);

        ImageButton halo = view.findViewById(R.id.game8);
        halo.setImageResource(R.drawable.halo);

        ImageButton subwaysurfer = view.findViewById(R.id.game9);
        subwaysurfer.setImageResource(R.drawable.subwaysurfer);

        ImageButton templerun = view.findViewById(R.id.game10);
        templerun.setImageResource(R.drawable.templerun);

        ImageButton warzone = view.findViewById(R.id.game11);
        warzone.setImageResource(R.drawable.warzone);

        ImageButton worms = view.findViewById(R.id.game12);
        worms.setImageResource(R.drawable.worms);

        Button buttonDone = view.findViewById(R.id.ButtonDone);


        sims.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!game12)
                {
                    mainActivity.addGamestoPerson(person, "sims");
                    sims.setBackgroundResource((R.drawable.ripple_effect));
                    game12 = true;
                }
                else
                {
                    mainActivity.RemoveGamestoPerson(person, "sims");
                    sims.setBackground(null);
                    game12 = false;
                }
            }
        });

        amongus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!game1)
                {
                    mainActivity.addGamestoPerson(person, "amongus");
                    amongus.setBackgroundResource((R.drawable.ripple_effect));
                    game1 = true;
                }
                else
                {
                    mainActivity.RemoveGamestoPerson(person, "amongus");
                    amongus.setBackground(null);
                    game1 = false;
                }
            }
        });


        angrybirds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!game2)
                {
                    mainActivity.addGamestoPerson(person, "angrybirds");
                    angrybirds.setBackgroundResource((R.drawable.ripple_effect));
                    game2 = true;
                }
                else
                {
                    mainActivity.RemoveGamestoPerson(person, "angrybirds");
                    angrybirds.setBackground(null);
                    game2 = false;
                }
            }
        });

        fifa21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!game3) {
                    mainActivity.addGamestoPerson(person, "fifa21");
                    fifa21.setBackgroundResource((R.drawable.ripple_effect));
                    game3 =true;
                }
                else
                {
                    mainActivity.RemoveGamestoPerson(person, "fifa21");

                    fifa21.setBackground(null);
                    game3 =false;
                }
            }
        });

        fortnite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!game4) {
                    mainActivity.addGamestoPerson(person, "fortnite");
                    fortnite.setBackgroundResource((R.drawable.ripple_effect));
                    game4 =true;
                }
                else
                {
                    mainActivity.RemoveGamestoPerson(person, "fortnite");

                    fortnite.setBackground(null);
                    game4 = false;
                }
            }
        });

        gta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!game5) {
                    mainActivity.addGamestoPerson(person, "gta");
                    gta.setBackgroundResource((R.drawable.ripple_effect));
                    game5 =true;
                }
                else
                {
                    mainActivity.RemoveGamestoPerson(person, "gta");

                    gta.setBackground(null);
                    game5=false;

                }
            }
        });


        halo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!game6) {
                    mainActivity.addGamestoPerson(person, "halo");
                    halo.setBackgroundResource((R.drawable.ripple_effect));
                    game6 =true;
                }
                else
                {
                    mainActivity.RemoveGamestoPerson(person, "halo");

                    halo.setBackground(null);
                    game6=false;
                }
            }
        });

        subwaysurfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!game7) {
                    mainActivity.addGamestoPerson(person, "subwaysurfer");
                    subwaysurfer.setBackgroundResource((R.drawable.ripple_effect));
                    game7 =true;
                }
                else
                {
                    mainActivity.RemoveGamestoPerson(person, "subwaysurfer");

                    subwaysurfer.setBackground(null);
                    game7 = false;
                }
            }
        });

        templerun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!game8) {
                    mainActivity.addGamestoPerson(person, "templerun");
                    templerun.setBackgroundResource((R.drawable.ripple_effect));
                    game8 =true;
                }
                else
                {
                    mainActivity.RemoveGamestoPerson(person, "templerun");

                    templerun.setBackground(null);
                    game8=false;
                }
            }
        });

        warzone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!game9) {
                    mainActivity.addGamestoPerson(person, "warzone");
                    warzone.setBackgroundResource((R.drawable.ripple_effect));
                    game9 =true;
                }
                else
                {
                    mainActivity.RemoveGamestoPerson(person, "warzone");
                    warzone.setBackground(null);
                    game9=false;
                }
            }
        });

        worms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!game10) {
                    mainActivity.addGamestoPerson(person, "worms");
                    worms.setBackgroundResource((R.drawable.ripple_effect));
                    game10 =true;
                }
                else
                {
                    mainActivity.RemoveGamestoPerson(person, "worms");
                    worms.setBackground(null);
                    game10=false;
                }
            }
        });
        fruitninja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!game11) {
                    mainActivity.addGamestoPerson(person, "fruitninja");
                    fruitninja.setBackgroundResource((R.drawable.ripple_effect));
                    game11 =true;
                }
                else
                {
                    mainActivity.RemoveGamestoPerson(person, "fruitninja");
                    fruitninja.setBackground(null);
                    game11 =false;
                }
            }
        });


        buttonDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mainActivity.addData(person);
                moveToNewActivity();
            }
        });

        return view;
    }
    private void moveToNewActivity () {

        Intent i = new Intent(getActivity(), MainActivityView.class);
        startActivity(i);
        ((Activity) getActivity()).overridePendingTransition(0, 0);
    }

}
