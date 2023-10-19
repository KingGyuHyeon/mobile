package com.example.mission04_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    ImageView headView, legView, armView, pinView, crownView, headbandView, dressView;
    ImageButton pin1Choose, pin2Choose, crown1Choose, crown2Choose, head1Choose, head2Choose, dress1Choose, dress2Choose, leg1Choose, leg2Choose, headband1Choose, headband2Choose;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        headView = (ImageView) findViewById(R.id.headView);
        legView = (ImageView) findViewById(R.id.legView);
        armView = (ImageView) findViewById(R.id.armView);
        pinView = (ImageView) findViewById(R.id.pinView);
        crownView = (ImageView) findViewById(R.id.crownView);
        headbandView = (ImageView) findViewById(R.id.headbandView);
        dressView = (ImageView) findViewById(R.id.dressView);
        pin1Choose = (ImageButton) findViewById(R.id.pin1Choose);
        pin2Choose = (ImageButton) findViewById(R.id.pin2Choose);
        crown1Choose = (ImageButton) findViewById(R.id.crown1Choose);
        crown2Choose = (ImageButton) findViewById(R.id.crown2Choose);
        head1Choose = (ImageButton) findViewById(R.id.head1Choose);
        head2Choose = (ImageButton) findViewById(R.id.head2Choose);
        dress1Choose = (ImageButton) findViewById(R.id.dress1Choose);
        dress2Choose = (ImageButton) findViewById(R.id.dress2Choose);
        leg1Choose = (ImageButton) findViewById(R.id.leg1Choose);
        leg2Choose = (ImageButton) findViewById(R.id.leg2Choose);
        headband1Choose = (ImageButton) findViewById(R.id.headband1Choose);
        headband2Choose = (ImageButton) findViewById(R.id.headband2Choose);
        button1 = (Button) findViewById(R.id.button1);


        pin1Choose.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                pinView.setVisibility(View.VISIBLE);
                pinView.setImageResource(R.drawable.pin1);
            }
        });
        pin2Choose.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                pinView.setVisibility(View.VISIBLE);
                pinView.setImageResource(R.drawable.pin2);
            }
        });
        crown1Choose.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                crownView.setVisibility(View.VISIBLE);
                crownView.setImageResource(R.drawable.crown1);
            }
        });
        crown2Choose.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                crownView.setVisibility(View.VISIBLE);
                crownView.setImageResource(R.drawable.crown2);
            }
        });
        headband1Choose.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                headbandView.setVisibility(View.VISIBLE);
                headbandView.setImageResource(R.drawable.headband1);
            }
        });
        headband2Choose.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                headbandView.setVisibility(View.VISIBLE);
                headbandView.setImageResource(R.drawable.headband2);
            }
        });
        dress1Choose.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                dressView.setVisibility(View.VISIBLE);
                dressView.setImageResource(R.drawable.dress1);
            }
        });
        dress2Choose.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                dressView.setVisibility(View.VISIBLE);
                dressView.setImageResource(R.drawable.dress2);
            }
        });
        head1Choose.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                headView.setImageResource(R.drawable.head1);
            }
        });
        head2Choose.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                headView.setImageResource(R.drawable.head2);
            }
        });
        leg1Choose.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                legView.setImageResource(R.drawable.leg1);
            }
        });
        leg2Choose.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                legView.setImageResource(R.drawable.leg2);
            }
        });

        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                headView.setImageResource(R.drawable.head0);
                legView.setImageResource(R.drawable.leg1);
                armView.setImageResource(R.drawable.arm);
                pinView.setVisibility(View.INVISIBLE);
                crownView.setVisibility(View.INVISIBLE);
                headbandView.setVisibility(View.INVISIBLE);
                dressView.setVisibility(View.INVISIBLE);
            }
        });
    }
}
