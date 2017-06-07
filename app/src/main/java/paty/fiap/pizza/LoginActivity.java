package paty.fiap.pizza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.TextInputLayout;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout tilLogin ;
    private TextInputLayout tilSenha ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tilLogin=(TextInputLayout) findViewById(R.id.tilLogin);
        tilSenha=(TextInputLayout) findViewById(R.id.tilSenha);
    }
    public void cadastrar(View v){

        String login = tilLogin.getEditText().getText().toString();
        String senha = tilSenha.getEditText().getText().toString();

        System.out.println(login);
        System.out.println(senha);


        if(login.equals("fiap") && senha.equals("123")){
            Intent intent=new Intent(this, PedidoActivity.class);
            intent.putExtra("usuario",login);
           startActivity(intent);
            finish();
        }else{
            Toast.makeText(this,"Usúario ou senha inválidos",Toast.LENGTH_SHORT).show();
        }


    }
}
