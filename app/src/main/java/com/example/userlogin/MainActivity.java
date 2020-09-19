package com.example.userlogin;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
// builder = new android.support.v7.app.AlertDialog.Builder(AlertDialogActivity.this);
public class MainActivity extends AppCompatActivity {
    EditText name;  //用户名
    EditText pass;  //密码
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //写代码
        name=(EditText) findViewById(R.id.inputusername);  //获取用户名
        pass=(EditText) findViewById(R.id.inputpassword);  //获取密码

    }
    //登录验证代码
    public void  Check(View v) {
        String mname = "abc";
        String mpass = "123";
        String user = name.getText().toString().trim();
        String pwd = pass.getText().toString().trim();
        if (user.equals(mname) && pwd.equals(mpass)) {
            Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "登陆失败", Toast.LENGTH_SHORT).show();
        }
    }

}
