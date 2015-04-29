package ua.in.mitya.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {//срабатывает при открытии приложения
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView =(TextView) findViewById(R.id.textView);
        button=(Button)findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                textView.setText("Привет Мир!");
            }
        });
    }

    public void sayHello(View view){
        textView.setText("Привет!");
    }


    @Override
    protected void onStart() {//после onCreate - подготовка активити к работе.
        super.onStart();
    }

    @Override
    protected void onResume() {//после onStart - активити доступно пользователю.
        super.onResume();
    }

    @Override
    protected void onPause() {//после onResume - при переходе на другой активити.
        //можно повторно вызвать onResume.
        super.onPause();
    }

    @Override
    protected void onStop() {//после onPause - делает текущее активити невидимым, помещает
        //в ОЗУ - на случай если пользователь к нему вернется.
        super.onStop();
    }

    @Override
    protected void onRestart() {//после onStop - возврат к невидимому активити без пересоздания.
        //вызовет метод onStart.
        super.onRestart();
    }

    @Override
    protected void onDestroy() {//после onStop. очистка стека от ненужных активити.
        super.onDestroy();
    }
    public void goToNewActivity(View v){
        Intent intent = new Intent(this, LastActivity.class);
        startActivity(intent);
    }
}
