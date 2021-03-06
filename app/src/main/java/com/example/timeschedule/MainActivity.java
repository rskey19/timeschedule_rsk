package com.example.timeschedule;


import android.app.AlarmManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;
import java.util.TimeZone;


public class MainActivity extends AppCompatActivity  {
public  String title = null;
public  String memo = null;

private TextView mon;
private TextView mon1;
private TextView mon2;
private TextView mon3;
private TextView mon4;
private TextView mon5;

private TextView tues;
private TextView tues1;
private TextView tues2;
private TextView tues3;
private TextView tues4;
private TextView tues5;

private TextView wend;
private TextView wend1;
private TextView wend2;
private TextView wend3;
private TextView wend4;
private TextView wend5;

private TextView thurs;
private TextView thurs1;
private TextView thurs2;
private TextView thurs3;
private TextView thurs4;
private TextView thurs5;

private TextView fri;
private TextView fri1;
private TextView fri2;
private TextView fri3;
private TextView fri4;
private TextView fri5;




private static final int REQUEST_DATA =4;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    TextView textview1 = findViewById(R.id.text1);
    TextView textview2 = findViewById(R.id.text2);
    TextView textview3 = findViewById(R.id.text3);
    TextView textview4 = findViewById(R.id.text4);
    TextView textview5 = findViewById(R.id.text5);
    TextView textview6 = findViewById(R.id.text6);
    TextView textview7 = findViewById(R.id.text7);
    TextView textview8 = findViewById(R.id.text8);
    TextView textview9 = findViewById(R.id.text9);
    TextView textview10 = findViewById(R.id.text10);

    TextView textview11 = findViewById(R.id.text11);
    TextView textview12= findViewById(R.id.text12);
    TextView textview13= findViewById(R.id.text13);
    TextView textview14 = findViewById(R.id.text14);
    TextView textview15= findViewById(R.id.text15);
    TextView textview16= findViewById(R.id.text16);
    TextView textview17= findViewById(R.id.text17);
    TextView textview18= findViewById(R.id.text18);
    TextView textview19= findViewById(R.id.text19);
    TextView textview20= findViewById(R.id.text20);

    TextView textview21 = findViewById(R.id.text21);
    TextView textview22 = findViewById(R.id.text22);
    TextView textview23 = findViewById(R.id.text23);
    TextView textview24 = findViewById(R.id.text24);
    TextView textview25 = findViewById(R.id.text25);






    View.OnClickListener listener = v -> {
        Intent intent = new Intent(MainActivity.this,SubActivity.class);
        if (v.getId() == R.id.text1) {
            startActivityForResult(intent, 1);
        } else if (v.getId() == R.id.text2) {
            startActivityForResult(intent, 2);
        } else if (v.getId() == R.id.text3) {
            startActivityForResult(intent, 3);
        } else if (v.getId() == R.id.text4) {
            startActivityForResult(intent, 4);
        } else if (v.getId() == R.id.text5) {
            startActivityForResult(intent, 5);

        } else if (v.getId() == R.id.text6) {
            startActivityForResult(intent, 6);
        } else if (v.getId() == R.id.text7) {
            startActivityForResult(intent, 7);
        } else if (v.getId() == R.id.text8) {
            startActivityForResult(intent, 8);
        } else if (v.getId() == R.id.text9) {
            startActivityForResult(intent, 9);
        } else if (v.getId() == R.id.text10) {
            startActivityForResult(intent, 10);

        } else if (v.getId() == R.id.text11) {
            startActivityForResult(intent, 11);
        } else if (v.getId() == R.id.text12) {
            startActivityForResult(intent, 12);
        } else if (v.getId() == R.id.text13) {
            startActivityForResult(intent, 13);
        } else if (v.getId() == R.id.text14) {
            startActivityForResult(intent, 14);
        } else if (v.getId() == R.id.text15) {
            startActivityForResult(intent, 15);

        } else if (v.getId() == R.id.text16) {
            startActivityForResult(intent, 16);
        } else if (v.getId() == R.id.text17) {
            startActivityForResult(intent, 17);
        } else if (v.getId() == R.id.text18) {
            startActivityForResult(intent, 18);
        } else if (v.getId() == R.id.text19) {
            startActivityForResult(intent, 19);
        } else if (v.getId() == R.id.text20) {
            startActivityForResult(intent, 20);

        } else if (v.getId() == R.id.text21) {
            startActivityForResult(intent, 21);
        } else if (v.getId() == R.id.text22) {
            startActivityForResult(intent, 22);
        } else if (v.getId() == R.id.text23) {
            startActivityForResult(intent, 23);
        } else if (v.getId() == R.id.text24) {
            startActivityForResult(intent, 24);
        } else if (v.getId() == R.id.text25) {
            startActivityForResult(intent, 25);
        }
    };



    textview1.setOnClickListener(listener);
    textview2.setOnClickListener(listener);
    textview3.setOnClickListener(listener);
    textview4.setOnClickListener(listener);
    textview5.setOnClickListener(listener);
    textview6.setOnClickListener(listener);
    textview7.setOnClickListener(listener);
    textview8.setOnClickListener(listener);
    textview9.setOnClickListener(listener);
    textview10.setOnClickListener(listener);

    textview11.setOnClickListener(listener);
    textview12.setOnClickListener(listener);
    textview13.setOnClickListener(listener);
    textview14.setOnClickListener(listener);
    textview15.setOnClickListener(listener);
    textview16.setOnClickListener(listener);
    textview17.setOnClickListener(listener);
    textview18.setOnClickListener(listener);
    textview19.setOnClickListener(listener);
    textview20.setOnClickListener(listener);

    textview21.setOnClickListener(listener);
    textview22.setOnClickListener(listener);
    textview23.setOnClickListener(listener);
    textview24.setOnClickListener(listener);
    textview25.setOnClickListener(listener);











    findViewById(R.id.toSub1Button).setOnClickListener(v -> {
        Intent intent1 = new Intent(MainActivity.this, Notifier.class);

        //その日のデータを取得
        //月曜日のデータ取得
        mon = findViewById(R.id.textView40);
        String Mon = mon.getText().toString();
        mon1 = findViewById(R.id.text1);
        String text1 = mon1.getText().toString();
        mon2 = findViewById(R.id.text6);
        String text2 = mon2.getText().toString();
        mon3 = findViewById(R.id.text11);
        String text3 = mon3.getText().toString();
        mon4 = findViewById(R.id.text16);
        String text4 = mon4.getText().toString();
        mon5 = findViewById(R.id.text21);
        String text5 = mon5.getText().toString();
        //火曜日
        tues = findViewById(R.id.textView41);
        String Tues = tues.getText().toString();
        tues1 = findViewById(R.id.text2);
        String text6 = tues1.getText().toString();
        tues2 = findViewById(R.id.text7);
        String text7 = tues2.getText().toString();
        tues3 = findViewById(R.id.text12);
        String text8 = tues3.getText().toString();
        tues4 = findViewById(R.id.text17);
        String text9 = tues4.getText().toString();
        tues5 = findViewById(R.id.text22);
        String text10 = tues5.getText().toString();
        //水曜日
        wend = findViewById(R.id.textView42);
        String Wend = wend.getText().toString();
        wend1 = findViewById(R.id.text3);
        String text11 = wend1.getText().toString();
        wend2 = findViewById(R.id.text8);
        String text12 = wend2.getText().toString();
        wend3 = findViewById(R.id.text13);
        String text13 = wend3.getText().toString();
        wend4 = findViewById(R.id.text18);
        String text14 = wend4.getText().toString();
        wend5 = findViewById(R.id.text23);
        String text15 = wend5.getText().toString();
        //木曜日
        thurs = findViewById(R.id.textView43);
        String Thurs = thurs.getText().toString();
        thurs1 = findViewById(R.id.text4);
        String text16 = thurs1.getText().toString();
        thurs2 = findViewById(R.id.text9);
        String text17 = thurs2.getText().toString();
        thurs3 = findViewById(R.id.text14);
        String text18 = thurs3.getText().toString();
        thurs4 = findViewById(R.id.text19);
        String text19 = thurs4.getText().toString();
        thurs5 = findViewById(R.id.text24);
        String text20 = thurs5.getText().toString();
        //金曜日
        fri = findViewById(R.id.textView44);
        String Fri = fri.getText().toString();
        fri1 = findViewById(R.id.text5);
        String text21 = fri1.getText().toString();
        fri2 = findViewById(R.id.text10);
        String text22 = fri2.getText().toString();
        fri3 = findViewById(R.id.text15);
        String text23 = fri3.getText().toString();
        fri4 = findViewById(R.id.text20);
        String text24 = fri4.getText().toString();
        fri5 = findViewById(R.id.text25);
        String text25 = thurs5.getText().toString();


        //曜日を取得する
        Calendar calender = Calendar.getInstance();
        NotificationActivity Non = new NotificationActivity();
        switch (calender.get(Calendar.DAY_OF_WEEK)) {
            case 2:
                title = "時間割: " + Mon + "曜日";
                memo = text1 + " | " + text2 + " | " + text3 + " | " + text4 + " | " + text5;
                break;
            case 3:
                title = "時間割: " + Tues + "曜日";
                memo = text6 + " | " + text7 + " | " + text8 + " | " + text9 + " | " + text10;
                break;
            case 4:
                title = "時間割: " + Wend + "曜日";
                memo = text11 + " | " + text12 + " | " + text13 + " | " + text14 + " | " + text15;
                break;
            case 5:
                title = "時間割: " + Thurs + "曜日";
                memo = text16 + " | " + text17 + " | " + text18 + " | " + text19 + " | " + text20;
                break;
            case 6:
                title = "時間割: " + Fri + "曜日";
                memo = text21 + " | " + text22 + " | " + text23 + " | " + text24 + " | " + text25;
                break;

             }
      //      Intent intent2 = new Intent(MainActivity.this, NotificationActivity.class);
        intent1.putExtra("tiName",title);
        intent1.putExtra("meName", memo);

        startActivity(intent1);
    });
    }

        @Override
public void onActivityResult(int requestCode, int resultCode, Intent data){
    TextView textview1 = findViewById(R.id.text1);
    TextView textview2 = findViewById(R.id.text2);
    TextView textview3 = findViewById(R.id.text3);
    TextView textview4 = findViewById(R.id.text4);
    TextView textview5 = findViewById(R.id.text5);
    TextView textview6 = findViewById(R.id.text6);
    TextView textview7 = findViewById(R.id.text7);
    TextView textview8 = findViewById(R.id.text8);
    TextView textview9 = findViewById(R.id.text9);
    TextView textview10 = findViewById(R.id.text10);

    TextView textview11 = findViewById(R.id.text11);
    TextView textview12= findViewById(R.id.text12);
    TextView textview13= findViewById(R.id.text13);
    TextView textview14 = findViewById(R.id.text14);
    TextView textview15= findViewById(R.id.text15);
    TextView textview16= findViewById(R.id.text16);
    TextView textview17= findViewById(R.id.text17);
    TextView textview18= findViewById(R.id.text18);
    TextView textview19= findViewById(R.id.text19);
    TextView textview20= findViewById(R.id.text20);

    TextView textview21 = findViewById(R.id.text21);
    TextView textview22 = findViewById(R.id.text22);
    TextView textview23 = findViewById(R.id.text23);
    TextView textview24 = findViewById(R.id.text24);
    TextView textview25 = findViewById(R.id.text25);

    String edit_1 = data.getStringExtra("edit1");
    String edit_2 = data.getStringExtra("edit2");
    String edit_3 = data.getStringExtra("edit3");

    String str = data.getStringExtra("edit1")+ "\n" +
            data.getStringExtra("edit2")+ "\n" +
            data.getStringExtra("edit3");
            switch(requestCode) {


                case(1):
                    if(resultCode == RESULT_OK){

                        textview1.setText(str) ;
                    }else if(resultCode == RESULT_CANCELED){
                        //キャンセルボタンを押して戻ってきたときの処理
                    }else{
                        //その他
                    }
                    break;


                case(2):
                    if(resultCode == RESULT_OK){
                        textview2.setText(str);

                    }else if(resultCode == RESULT_CANCELED){
                        //キャンセルボタンを押して戻ってきたときの処理
                    }else{
                        //その他
                    }
                    break;


                case(3):
                    if(resultCode == RESULT_OK){
                        textview3.setText(str);

                    }else if(resultCode == RESULT_CANCELED){
                        //キャンセルボタンを押して戻ってきたときの処理
                    }else{
                        //その他
                    }
                    break;


                case(4):
                    if(resultCode == RESULT_OK){
                        textview4.setText(str);

                    }else if(resultCode == RESULT_CANCELED){
                        //キャンセルボタンを押して戻ってきたときの処理
                    }else{
                        //その他
                    }
                    break;


                case(5):
                    if(resultCode == RESULT_OK){
                        textview5.setText(str);

                    }else if(resultCode == RESULT_CANCELED){
                        //キャンセルボタンを押して戻ってきたときの処理
                    }else{
                        //その他
                    }
                    break;



                case(6):
                    if(resultCode == RESULT_OK){
                        textview6.setText(str);

                    }else if(resultCode == RESULT_CANCELED){
                        //キャンセルボタンを押して戻ってきたときの処理
                    }else{
                        //その他
                    }
                    break;


                case(7):
                    if(resultCode == RESULT_OK){
                        textview7.setText(str);

                    }else if(resultCode == RESULT_CANCELED){
                        //キャンセルボタンを押して戻ってきたときの処理
                    }else{
                        //その他
                    }
                    break;


                case(8):
                    if(resultCode == RESULT_OK){
                        textview8.setText(str);

                    }else if(resultCode == RESULT_CANCELED){
                        //キャンセルボタンを押して戻ってきたときの処理
                    }else{
                        //その他
                    }
                    break;

                case(9):
                    if(resultCode == RESULT_OK){
                        textview9.setText(str);

                    }else if(resultCode == RESULT_CANCELED){
                        //キャンセルボタンを押して戻ってきたときの処理
                    }else{
                        //その他
                    }
                    break;

                case(10):
                    if(resultCode == RESULT_OK){
                        textview10.setText(str);

                    }else if(resultCode == RESULT_CANCELED){
                        //キャンセルボタンを押して戻ってきたときの処理
                    }else{
                        //その他
                    }
                    break;

                case(11):
                    if(resultCode == RESULT_OK){
                        textview11.setText(str);

                    }else if(resultCode == RESULT_CANCELED){
                        //キャンセルボタンを押して戻ってきたときの処理
                    }else{
                        //その他
                    }
                    break;

                case(12):
                    if(resultCode == RESULT_OK){
                        textview12.setText(str);

                    }else if(resultCode == RESULT_CANCELED){
                        //キャンセルボタンを押して戻ってきたときの処理
                    }else{
                        //その他
                    }
                    break;

                case(13):
                    if(resultCode == RESULT_OK){
                        textview13.setText(str);

                    }else if(resultCode == RESULT_CANCELED){
                        //キャンセルボタンを押して戻ってきたときの処理
                    }else{
                        //その他
                    }
                    break;

                case(14):
                    if(resultCode == RESULT_OK){
                        textview14.setText(str);

                    }else if(resultCode == RESULT_CANCELED){
                        //キャンセルボタンを押して戻ってきたときの処理
                    }else{
                        //その他
                    }
                    break;

                case(15):
                    if(resultCode == RESULT_OK){
                        textview15.setText(str);

                    }else if(resultCode == RESULT_CANCELED){
                        //キャンセルボタンを押して戻ってきたときの処理
                    }else{
                        //その他
                    }
                    break;

                case(16):
                    if(resultCode == RESULT_OK){
                        textview16.setText(str);

                    }else if(resultCode == RESULT_CANCELED){
                        //キャンセルボタンを押して戻ってきたときの処理
                    }else{
                        //その他
                    }
                    break;


                case(17):
                    if(resultCode == RESULT_OK){
                        textview17.setText(str);

                    }else if(resultCode == RESULT_CANCELED){
                        //キャンセルボタンを押して戻ってきたときの処理
                    }else{
                        //その他
                    }
                    break;

                case(18):
                    if(resultCode == RESULT_OK){
                        textview18.setText(str);

                    }else if(resultCode == RESULT_CANCELED){
                        //キャンセルボタンを押して戻ってきたときの処理
                    }else{
                        //その他
                    }
                    break;


                case(19):
                    if(resultCode == RESULT_OK){
                        textview19.setText(str);

                    }else if(resultCode == RESULT_CANCELED){
                        //キャンセルボタンを押して戻ってきたときの処理
                    }else{
                        //その他
                    }
                    break;



                case(20):
                    if(resultCode == RESULT_OK){
                        textview20.setText(str);

                    }else if(resultCode == RESULT_CANCELED){
                        //キャンセルボタンを押して戻ってきたときの処理
                    }else{
                        //その他
                    }
                    break;

                case(21):
                    if(resultCode == RESULT_OK){
                        textview21.setText(str);

                    }else if(resultCode == RESULT_CANCELED){
                        //キャンセルボタンを押して戻ってきたときの処理
                    }else{
                        //その他
                    }
                    break;

                case(22):
                    if(resultCode == RESULT_OK){
                        textview22.setText(str);

                    }else if(resultCode == RESULT_CANCELED){
                        //キャンセルボタンを押して戻ってきたときの処理
                    }else{
                        //その他
                    }
                    break;

                case(23):
                    if(resultCode == RESULT_OK){
                        textview23.setText(str);

                    }else if(resultCode == RESULT_CANCELED){
                        //キャンセルボタンを押して戻ってきたときの処理
                    }else{
                        //その他
                    }
                    break;

                case(24):
                    if(resultCode == RESULT_OK){
                        textview24.setText(str);

                    }else if(resultCode == RESULT_CANCELED){
                        //キャンセルボタンを押して戻ってきたときの処理
                    }else{
                        //その他
                    }
                    break;

                case(25):
                    if(resultCode == RESULT_OK){
                        textview25.setText(str);

                    }else if(resultCode == RESULT_CANCELED){
                //キャンセルボタンを押して戻ってきたときの処理
            }else{
                //その他
            }
            break;
        default:
            break;
    }
}
}
