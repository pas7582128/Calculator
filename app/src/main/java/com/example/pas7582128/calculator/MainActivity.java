package com.example.pas7582128.calculator;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;


public class MainActivity extends AppCompatActivity {

    private Button ButtonOne,ButtonTwo,ButtonThree,ButtonFour,ButtonFive,ButtonSix,ButtonSeven,ButtonEight,ButtonNine,ButtonZero,ButtonPoint,ButtonMul,ButtonDiv,ButtonAdd,ButtonSub,ButtonEqual;
    private ImageButton ButtonBackspace;
    private TextView Expr,Result;
    private final char ADDITION='+',SUBSTRACTION='-',MULTIPLICATION='*',DIVISON='/';
    private double val1=Double.NaN,val2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayExpr();

        ButtonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=Expr.getText().toString();
                if(str.length()==1 && str.charAt(0)=='0') {

                }
                else{
                    str=Expr.getText().toString()+"0";
                    Expr.setText(Expr.getText().toString() + "0");
                }

                Expression e1=new Expression(str);
                str=String.valueOf(e1.calculate());
                //if(!str.equals("NaN"))
                Result.setText(str);
            }
        });

        ButtonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=Expr.getText().toString();
                if(str.length()==1 && str.charAt(0)=='0') {
                    str="1";
                    Expr.setText("1");
                }
                else{
                    str=Expr.getText().toString()+"1";
                    Expr.setText(Expr.getText().toString() + "1");
                }
                Expression e1=new Expression(str);
                str=String.valueOf(e1.calculate());
                //if(!str.equals("NaN"))
                    Result.setText(str);
            }
        });

        ButtonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=Expr.getText().toString();
                if(str.length()==1 && str.charAt(0)=='0') {
                    str="2";
                    Expr.setText("2");
                }
                else{
                    str=Expr.getText().toString()+"2";
                    Expr.setText(Expr.getText().toString() + "2");
                }
                Expression e1=new Expression(str);
                str=String.valueOf(e1.calculate());
                //if(!str.equals("NaN"))
                    Result.setText(str);
            }
        });

        ButtonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=Expr.getText().toString();
                if(str.length()==1 && str.charAt(0)=='0') {
                    str="3";
                    Expr.setText("3");
                }
                else{
                    str=Expr.getText().toString()+"3";
                    Expr.setText(Expr.getText().toString() + "3");
                }
                Expression e1=new Expression(str);
                str=String.valueOf(e1.calculate());
                //if(!str.equals("NaN"))
                    Result.setText(str);
            }
        });

        ButtonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=Expr.getText().toString();
                if(str.length()==1 && str.charAt(0)=='0') {
                    str="4";
                    Expr.setText("4");
                }
                else{
                    str=Expr.getText().toString()+"4";
                    Expr.setText(Expr.getText().toString() + "4");
                }
                Expression e1=new Expression(str);
                str=String.valueOf(e1.calculate());
                //if(!str.equals("NaN"))
                    Result.setText(str);
            }
        });

        ButtonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=Expr.getText().toString();
                if(str.length()==1 && str.charAt(0)=='0') {
                    str="5";
                    Expr.setText("5");
                }
                else{
                    str=Expr.getText().toString()+"5";
                    Expr.setText(Expr.getText().toString() + "5");
                }
                Expression e1=new Expression(str);
                str=String.valueOf(e1.calculate());
                //if(!str.equals("NaN"))
                    Result.setText(str);
            }
        });

        ButtonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=Expr.getText().toString();
                if(str.length()==1 && str.charAt(0)=='0') {
                    str="6";
                    Expr.setText("6");
                }
                else{
                    str=Expr.getText().toString()+"6";
                    Expr.setText(Expr.getText().toString() + "6");
                }
                Expression e1=new Expression(str);
                str=String.valueOf(e1.calculate());
                //if(!str.equals("NaN"))
                    Result.setText(str);
            }
        });

        ButtonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=Expr.getText().toString();
                if(str.length()==1 && str.charAt(0)=='0') {
                    str="7";
                    Expr.setText("7");
                }
                else{
                    str=Expr.getText().toString()+"7";
                    Expr.setText(Expr.getText().toString() + "7");
                }
                Expression e1=new Expression(str);
                str=String.valueOf(e1.calculate());
                //if(!str.equals("NaN"))
                    Result.setText(str);
            }
        });

        ButtonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=Expr.getText().toString();
                if(str.length()==1 && str.charAt(0)=='0') {
                    str="8";
                    Expr.setText("8");
                }
                else{
                    str=Expr.getText().toString()+"8";
                    Expr.setText(Expr.getText().toString() + "8");
                }
                Expression e1=new Expression(str);
                str=String.valueOf(e1.calculate());
                //if(!str.equals("NaN"))
                    Result.setText(str);
            }
        });

        ButtonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=Expr.getText().toString();
                if(str.length()==1 && str.charAt(0)=='0') {
                    str="9";
                    Expr.setText("9");
                }
                else{
                    str=Expr.getText().toString()+"9";
                    Expr.setText(Expr.getText().toString() + "9");
                }
                Expression e1=new Expression(str);
                str=String.valueOf(e1.calculate());
                //if(!str.equals("NaN"))
                    Result.setText(str);
            }
        });

        ButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=Expr.getText().toString();
                if(str.length()==0){

                }
                else if((str.charAt(str.length()-1)=='+') || str.charAt(str.length()-1)=='-' || str.charAt(str.length()-1)=='*' || str.charAt(str.length()-1)=='/') {
                    Expr.setText(str.substring(0,str.length()-1)+"+");
                }
                else{
                    Expr.setText(Expr.getText().toString() + "+");
                }

                Expression e1=new Expression(str);
                str=String.valueOf(e1.calculate());
                //if(!str.equals("NaN"))
                Result.setText(str);
                //Expr.setText(Expr.getText().toString()+"+");
            }
        });

        ButtonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=Expr.getText().toString();
                if(str.length()==0){

                }
                else if((str.charAt(str.length()-1)=='+') || str.charAt(str.length()-1)=='-' || str.charAt(str.length()-1)=='*' || str.charAt(str.length()-1)=='/') {
                    Expr.setText(str.substring(0,str.length()-1)+"-");
                }
                else{
                    Expr.setText(Expr.getText().toString() + "-");
                }

                Expression e1=new Expression(str);
                str=String.valueOf(e1.calculate());
                //if(!str.equals("NaN"))
                Result.setText(str);
                //Expr.setText(Expr.getText().toString()+"-");
            }
        });

        ButtonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=Expr.getText().toString();
                if(str.length()==0){

                }
                else if((str.charAt(str.length()-1)=='+') || str.charAt(str.length()-1)=='-' || str.charAt(str.length()-1)=='*' || str.charAt(str.length()-1)=='/') {
                    Expr.setText(str.substring(0,str.length()-1)+"*");
                }
                else{
                    Expr.setText(Expr.getText().toString() + "*");
                }

                Expression e1=new Expression(str);
                str=String.valueOf(e1.calculate());
                //if(!str.equals("NaN"))
                Result.setText(str);
                //Expr.setText(Expr.getText().toString()+"*");
            }
        });

        ButtonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=Expr.getText().toString();
                if(str.length()==0){

                }
                else if((str.charAt(str.length()-1)=='+') || str.charAt(str.length()-1)=='-' || str.charAt(str.length()-1)=='*' || str.charAt(str.length()-1)=='/') {
                    Expr.setText(str.substring(0,str.length()-1)+"/");
                }
                else{
                    Expr.setText(Expr.getText().toString() + "/");
                }

                Expression e1=new Expression(str);
                str=String.valueOf(e1.calculate());
                //if(!str.equals("NaN"))
                Result.setText(str);
                //Expr.setText(Expr.getText().toString()+"/");
            }
        });

        ButtonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=Expr.getText().toString();
                int tmp_flag=0;
                int len=str.length();
                for(int i=len-1;i>=0;i--){
                    if(str.charAt(i)=='.'){
                        tmp_flag=1;
                        break;
                    }
                    else if(str.charAt(i)=='+' || str.charAt(i)=='-' || str.charAt(i)=='*' || str.charAt(i)=='/'){
                        break;
                    }
                }
                if(tmp_flag!=1)
                    Expr.setText(Expr.getText().toString()+".");

                Expression e1=new Expression(str);
                str=String.valueOf(e1.calculate());
                //if(!str.equals("NaN"))
                Result.setText(str);
            }
        });


        ButtonBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=Expr.getText().toString();
                if(str.length()>=1)
                Expr.setText(str.substring(0,str.length()-1));
                if(str.length()>=1) {
                    Expression e1 = new Expression(str.substring(0, str.length() - 1));
                    str = String.valueOf(e1.calculate());
                    //if (!str.equals("NaN"))
                        Result.setText(str);
                }
            }
        });

        ButtonBackspace.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Expr.setText("");
                String str=Expr.getText().toString();
                Expression e1=new Expression(str);
                str=String.valueOf(e1.calculate());
                //if(!str.equals("NaN"))
                    Result.setText(str);
                return false;
            }
        });

        ButtonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=Expr.getText().toString();
                Expression e1=new Expression(str);
                str=String.valueOf(e1.calculate());
                if(!str.equals("NaN"))

                    Expr.setText(str);
                Result.setText("");
//                        try {
//                            str=engine.eval(str).toString();
//                        } catch (ScriptException e) {
//                            e.printStackTrace();
//                        }

                //Log.d("FFF","str"+str+"\n");
                //Expr.setText(str);
                //Expr.setText("");

            }
        });




    }
    private void displayExpr(){
        ButtonZero=(Button)findViewById(R.id.button0);
        ButtonOne=(Button)findViewById(R.id.button1);
        ButtonTwo=(Button)findViewById(R.id.button2);
        ButtonThree=(Button)findViewById(R.id.button3);
        ButtonFour=(Button)findViewById(R.id.button4);
        ButtonFive=(Button)findViewById(R.id.button5);
        ButtonSix=(Button)findViewById(R.id.button6);
        ButtonSeven=(Button)findViewById(R.id.button7);
        ButtonEight=(Button)findViewById(R.id.button8);
        ButtonNine=(Button)findViewById(R.id.button9);
        ButtonPoint=(Button)findViewById(R.id.button_pt);
        ButtonEqual=(Button)findViewById(R.id.button_equal);
        ButtonAdd=(Button)findViewById(R.id.button_plus);
        ButtonSub=(Button)findViewById(R.id.button_minus);
        ButtonMul=(Button)findViewById(R.id.button_mult);
        ButtonDiv=(Button)findViewById(R.id.button_div);
        ButtonBackspace=(ImageButton) findViewById(R.id.button_backspace);
        Expr=(TextView)findViewById(R.id.textView_expression);
        Result=(TextView)findViewById(R.id.textView_result);
    }
}
