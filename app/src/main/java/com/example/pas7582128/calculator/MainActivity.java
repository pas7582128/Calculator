package com.example.pas7582128.calculator;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
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
                int size=str.length();
                if(size==0){
                    str="0";
                    Expr.setText("0");
                }
                else if(size==1 && str.charAt(0)=='0'){

                }
                else if(size==1){
                    str=str+"0";
                    Expr.setText(Expr.getText().toString()+'0');
                }
                else{
                    int flag1=1;
                    int i;
                    for(i=size-1;i>=0;i--){
                        if(str.charAt(i)=='+' || str.charAt(i)=='-' ||str.charAt(i)=='*' || str.charAt(i)=='/'){
                            flag1=0;
                            break;
                        }
                    }
                    if(flag1==1) {
                        str=str+"0";
                        Expr.setText(Expr.getText().toString() + '0');
                    }
                    else{
                        String tmp=str.substring(i+1,size);
                        if(tmp.length()==1 && tmp.charAt(0)=='0'){

                        }
                        else{
                            str=str+"0";
                            Expr.setText(Expr.getText().toString() + '0');
                        }
                    }
                }
//                if(str.length()==1 && str.charAt(0)=='0') {
//
//                }
//                else{
//                    for(int i=str.length()-1;i>=0;i--){
//                        if(str.charAt(i)=='+' || str.charAt(i)=='-' || str.charAt(i)=='*' || str.charAt(i)=='/'){
//
//                            break;
//                        }
//                    }
//                    str=Expr.getText().toString()+"0";
//                    Expr.setText(Expr.getText().toString() + "0");
//                }

                Expression e1=new Expression(str);
                str=String.valueOf(e1.calculate());
                if(!str.equals("NaN"))
                Result.setText(str);
                else{
                    Result.setText("Can't devide by 0");
                }
            }
        });

        ButtonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=Expr.getText().toString();
//                if(str.length()==1 && str.charAt(0)=='0') {
//                    str="1";
//                    Expr.setText("1");
//                }
//                else{
//                    str=Expr.getText().toString()+"1";
//                    Expr.setText(Expr.getText().toString() + "1");
//                }
                String s="1";
                int size=str.length();
                int flag=1;
                int i;
                for(i=size-1;i>=0;i--){
                    if(str.charAt(i)=='+' || str.charAt(i)=='-' ||str.charAt(i)=='*' || str.charAt(i)=='/'){
                        flag=0;
                        break;
                    }
                }
                if(str.length()==1 && str.charAt(0)=='0') {
                    str=s;
                    Expr.setText(s);
                }
                else if(flag==1) {
                    str=str+s;
                    Expr.setText(Expr.getText() + s);
                }
                else{
                    String tmp=str.substring(i+1,size);
                    if(tmp.length()==1 && tmp.charAt(0)=='0'){
                        str=str.substring(0,size-1);
                        Expr.setText(str + s);
                        str=str+s;
                    }
                    else{
                        str=str+s;
                        Expr.setText(Expr.getText() + s);
                    }
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
//                if(str.length()==1 && str.charAt(0)=='0') {
//                    str="2";
//                    Expr.setText("2");
//                }
//                else{
//                    str=Expr.getText().toString()+"2";
//                    Expr.setText(Expr.getText().toString() + "2");
//                }
                String s="2";
                int size=str.length();
                int flag=1;
                int i;
                for(i=size-1;i>=0;i--){
                    if(str.charAt(i)=='+' || str.charAt(i)=='-' ||str.charAt(i)=='*' || str.charAt(i)=='/'){
                        flag=0;
                        break;
                    }
                }
                if(str.length()==1 && str.charAt(0)=='0') {
                    str=s;
                    Expr.setText(s);
                }
                else if(flag==1) {
                    str=str+s;
                    Expr.setText(Expr.getText() + s);
                }
                else{
                    String tmp=str.substring(i+1,size);
                    if(tmp.length()==1 && tmp.charAt(0)=='0'){
                        str=str.substring(0,size-1);
                        Expr.setText(str + s);
                        str=str+s;
                    }
                    else{
                        str=str+s;
                        Expr.setText(Expr.getText() + s);
                    }
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
//                if(str.length()==1 && str.charAt(0)=='0') {
//                    str="3";
//                    Expr.setText("3");
//                }
//                else{
//                    str=Expr.getText().toString()+"3";
//                    Expr.setText(Expr.getText().toString() + "3");
//                }
                String s="3";
                int size=str.length();
                int flag=1;
                int i;
                for(i=size-1;i>=0;i--){
                    if(str.charAt(i)=='+' || str.charAt(i)=='-' ||str.charAt(i)=='*' || str.charAt(i)=='/'){
                        flag=0;
                        break;
                    }
                }
                if(str.length()==1 && str.charAt(0)=='0') {
                    str=s;
                    Expr.setText(s);
                }
                else if(flag==1) {
                    str=str+s;
                    Expr.setText(Expr.getText() + s);
                }
                else{
                    String tmp=str.substring(i+1,size);
                    if(tmp.length()==1 && tmp.charAt(0)=='0'){
                        str=str.substring(0,size-1);
                        Expr.setText(str + s);
                        str=str+s;
                    }
                    else{
                        str=str+s;
                        Expr.setText(Expr.getText() + s);
                    }
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
//                if(str.length()==1 && str.charAt(0)=='0') {
//                    str="4";
//                    Expr.setText("4");
//                }
//                else{
//                    str=Expr.getText().toString()+"4";
//                    Expr.setText(Expr.getText().toString() + "4");
//                }
                String s="4";
                int size=str.length();
                int flag=1;
                int i;
                for(i=size-1;i>=0;i--){
                    if(str.charAt(i)=='+' || str.charAt(i)=='-' ||str.charAt(i)=='*' || str.charAt(i)=='/'){
                        flag=0;
                        break;
                    }
                }
                if(str.length()==1 && str.charAt(0)=='0') {
                    str=s;
                    Expr.setText(s);
                }
                else if(flag==1) {
                    str=str+s;
                    Expr.setText(Expr.getText() + s);
                }
                else{
                    String tmp=str.substring(i+1,size);
                    if(tmp.length()==1 && tmp.charAt(0)=='0'){
                        str=str.substring(0,size-1);
                        Expr.setText(str + s);
                        str=str+s;
                    }
                    else{
                        str=str+s;
                        Expr.setText(Expr.getText() + s);
                    }
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
//                if(str.length()==1 && str.charAt(0)=='0') {
//                    str="5";
//                    Expr.setText("5");
//                }
//                else{
//                    str=Expr.getText().toString()+"5";
//                    Expr.setText(Expr.getText().toString() + "5");
//                }
                String s="5";
                int size=str.length();
                int flag=1;
                int i;
                for(i=size-1;i>=0;i--){
                    if(str.charAt(i)=='+' || str.charAt(i)=='-' ||str.charAt(i)=='*' || str.charAt(i)=='/'){
                        flag=0;
                        break;
                    }
                }
                if(str.length()==1 && str.charAt(0)=='0') {
                    str=s;
                    Expr.setText(s);
                }
                else if(flag==1) {
                    str=str+s;
                    Expr.setText(Expr.getText() + s);
                }
                else{
                    String tmp=str.substring(i+1,size);
                    if(tmp.length()==1 && tmp.charAt(0)=='0'){
                        str=str.substring(0,size-1);
                        Expr.setText(str + s);
                        str=str+s;
                    }
                    else{
                        str=str+s;
                        Expr.setText(Expr.getText() + s);
                    }
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
//                if(str.length()==1 && str.charAt(0)=='0') {
//                    str="6";
//                    Expr.setText("6");
//                }
//                else{
//                    str=Expr.getText().toString()+"6";
//                    Expr.setText(Expr.getText().toString() + "6");
//                }
                String s="6";
                int size=str.length();
                int flag=1;
                int i;
                for(i=size-1;i>=0;i--){
                    if(str.charAt(i)=='+' || str.charAt(i)=='-' ||str.charAt(i)=='*' || str.charAt(i)=='/'){
                        flag=0;
                        break;
                    }
                }
                if(str.length()==1 && str.charAt(0)=='0') {
                    str=s;
                    Expr.setText(s);
                }
                else if(flag==1) {
                    str=str+s;
                    Expr.setText(Expr.getText() + s);
                }
                else{
                    String tmp=str.substring(i+1,size);
                    if(tmp.length()==1 && tmp.charAt(0)=='0'){
                        str=str.substring(0,size-1);
                        Expr.setText(str + s);
                        str=str+s;
                    }
                    else{
                        str=str+s;
                        Expr.setText(Expr.getText() + s);
                    }
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
//                if(str.length()==1 && str.charAt(0)=='0') {
//                    str="7";
//                    Expr.setText("7");
//                }
//                else{
//                    str=Expr.getText().toString()+"7";
//                    Expr.setText(Expr.getText().toString() + "7");
//                }
                String s="7";
                int size=str.length();
                int flag=1;
                int i;
                for(i=size-1;i>=0;i--){
                    if(str.charAt(i)=='+' || str.charAt(i)=='-' ||str.charAt(i)=='*' || str.charAt(i)=='/'){
                        flag=0;
                        break;
                    }
                }
                if(str.length()==1 && str.charAt(0)=='0') {
                    str=s;
                    Expr.setText(s);
                }
                else if(flag==1) {
                    str=str+s;
                    Expr.setText(Expr.getText() + s);
                }
                else{
                    String tmp=str.substring(i+1,size);
                    if(tmp.length()==1 && tmp.charAt(0)=='0'){
                        str=str.substring(0,size-1);
                        Expr.setText(str + s);
                        str=str+s;
                    }
                    else{
                        str=str+s;
                        Expr.setText(Expr.getText() + s);
                    }
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
//                if(str.length()==1 && str.charAt(0)=='0') {
//                    str="8";
//                    Expr.setText("8");
//                }
//                else{
//                    str=Expr.getText().toString()+"8";
//                    Expr.setText(Expr.getText().toString() + "8");
//                }
                String s="8";
                int size=str.length();
                int flag=1;
                int i;
                for(i=size-1;i>=0;i--){
                    if(str.charAt(i)=='+' || str.charAt(i)=='-' ||str.charAt(i)=='*' || str.charAt(i)=='/'){
                        flag=0;
                        break;
                    }
                }
                if(str.length()==1 && str.charAt(0)=='0') {
                    str=s;
                    Expr.setText(s);
                }
                else if(flag==1) {
                    str=str+s;
                    Expr.setText(Expr.getText() + s);
                }
                else{
                    String tmp=str.substring(i+1,size);
                    if(tmp.length()==1 && tmp.charAt(0)=='0'){
                        str=str.substring(0,size-1);
                        Expr.setText(str + s);
                        str=str+s;
                    }
                    else{
                        str=str+s;
                        Expr.setText(Expr.getText() + s);
                    }
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
//                if(str.length()==1 && str.charAt(0)=='0') {
//                    str="9";
//                    Expr.setText("9");
//                }
//                else{
//                    str=Expr.getText().toString()+"9";
//                    Expr.setText(Expr.getText().toString() + "9");
//                }
                String s="9";
                int size=str.length();
                int flag=1;
                int i;
                for(i=size-1;i>=0;i--){
                    if(str.charAt(i)=='+' || str.charAt(i)=='-' ||str.charAt(i)=='*' || str.charAt(i)=='/'){
                        flag=0;
                        break;
                    }
                }
                if(str.length()==1 && str.charAt(0)=='0') {
                    str=s;
                    Expr.setText(s);
                }
                else if(flag==1) {
                    str=str+s;
                    Expr.setText(Expr.getText() + s);
                }
                else{
                    String tmp=str.substring(i+1,size);
                    if(tmp.length()==1 && tmp.charAt(0)=='0'){
                        str=str.substring(0,size-1);
                        Expr.setText(str + s);
                        str=str+s;
                    }
                    else{
                        str=str+s;
                        Expr.setText(Expr.getText() + s);
                    }
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
                if(!str.equals("NaN"))
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
                if(!str.equals("NaN"))
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
                if(!str.equals("NaN"))
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

                if(!str.equals("NaN"))
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
                if(len==0){
                    Expr.setText("0.");
                }
                else if(str.charAt(str.length()-1)=='+' || str.charAt(str.length()-1)=='-' || str.charAt(str.length()-1)=='*' || str.charAt(str.length()-1)=='/' ){
                    Expr.setText(str+"0.");
                }
                else if(tmp_flag!=1)
                    Expr.setText(Expr.getText().toString()+".");

                Expression e1=new Expression(str);
                str=String.valueOf(e1.calculate());
                if(!str.equals("NaN"))
                Result.setText(str);
            }
        });


        ButtonBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=Expr.getText().toString();
                Expression e1;
                if(str.length()>=1)
                Expr.setText(str.substring(0,str.length()-1));
                if(str.length()==1){
                    Result.setText("0");
                }
                else if(str.length()>=1) {
                    if(str.length()>=4){
                        if(str.charAt(str.length()-2)=='.' && str.charAt(str.length()-3)=='0' && str.charAt(str.length()-4)=='/'){
                            Result.setText("Can't devide by 0");
                            return;
                        }
                    }
                    if(str.length()>=2)
                    if(str.charAt(str.length()-2)=='.'){
                        str=str.substring(0,str.length()-2);
//                        String str2=str.substring(0, str.length() - 1);
//                        if(str2.length()>1)
//                            if(str2.charAt(str2.length()-1)=='+' || str2.charAt(str2.length()-1)=='-' ||str2.charAt(str2.length()-1)=='*' ||str2.charAt(str2.length()-1)=='/')
//                                e1=new Expression(str2.substring(0,str2.length()-1));
//                        if(!str.isEmpty())
//                            str = String.valueOf(e1.calculate());
//                        if (!str.equals("NaN"))
//                            Result.setText(str);
//                        else if(str.isEmpty())
//                            Result.setText("0");
//                        else
//                            Result.setText("Can't devide by 0");
                        e1=new Expression(str);
                        str=String.valueOf(e1.calculate());
                        Result.setText(str);
                        return;
                    }
                    e1 = new Expression(str.substring(0, str.length() - 1));
                    String str2=str.substring(0, str.length() - 1);
                    if(str2.length()>1)
                    if(str2.charAt(str2.length()-1)=='+' || str2.charAt(str2.length()-1)=='-' ||str2.charAt(str2.length()-1)=='*' ||str2.charAt(str2.length()-1)=='/')
                        e1=new Expression(str2.substring(0,str2.length()-1));
                    if(!str.isEmpty())
                        str = String.valueOf(e1.calculate());
                    if (!str.equals("NaN"))
                        Result.setText(str);
                    else if(str.isEmpty())
                        Result.setText("0");
                    else
                        Result.setText("Can't devide by 0");
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
                if(!str.equals("NaN"))
                    Result.setText(str);
                else
                    Result.setText("0");
                return false;
            }
        });

        ButtonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=Expr.getText().toString();

                if(str.charAt(str.length()-1)=='+' || str.charAt(str.length()-1)=='-' || str.charAt(str.length()-1)=='*' || str.charAt(str.length()-1)=='/'   ){
                    Expr.setText(Result.getText());
                    Result.setText("");
                    return;
                }
                Expression e1=new Expression(str);
                str=String.valueOf(e1.calculate());
                double a11=Double.parseDouble(str);

                int a13=(int)a11;
                String resu=String.valueOf((a13));

                if(a11==a13){
                    Result.setText(resu);
                }
                else if(!str.equals("NaN")) {
                    Expr.setText(str);
                    Result.setText("");
                }
                else{
                    Result.setText("Can't devide by 0");
                }
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
