package ramirez.lopez.appoperaciones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var resultado = 0
    var listaOperaciones = arrayOf("+","-","*")
    var operacionElegida = listaOperaciones.random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        suma()
        if (operacionElegida == "+"){
            btnVeri.setOnClickListener {
                if (etOper.text.isNotEmpty()){
                    verificarRespuesta()
                }else{
                    m("Ingresa una respuesta")
                }
            }
        }
        if (operacionElegida == "-"){
            btnVeri.setOnClickListener {
                if (etOper.text.isNotEmpty()){
                    verificarRespuesta()
                }else{
                    m("Ingresa una respuesta")
                }
            }
        }
        if (operacionElegida == "*"){
            btnVeri.setOnClickListener {
                if (etOper.text.isNotEmpty()){
                    verificarRespuesta()
                }else{
                    m("Ingresa una respuesta")
                }
            }
        }
    }

    fun m(mensaje:String){
        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show()
    }

    fun verificarRespuesta(){
        if (operacionElegida == "+"){
            btnVeri.setOnClickListener {
                if (etOper.text.isNotEmpty()){
                    if (etOper.getText().toString().toInt() == resultado){
                        val miIntent = Intent(this, SegundaActivity::class.java)
                        startActivity(miIntent)
                    }else{
                        val miIntent = Intent(this, TerceraActivity::class.java)
                        startActivity(miIntent)
                    }
                    operacionNueva()
                }else{
                    m("Ingresa una respuesta")
                }
            }
        }
        if (operacionElegida == "-"){
            btnVeri.setOnClickListener {
                if (etOper.text.isNotEmpty()){
                    if (etOper.getText().toString().toInt() == resultado){
                        val miIntent = Intent(this, SegundaActivity::class.java)
                        startActivity(miIntent)
                    }else{
                        val miIntent = Intent(this, TerceraActivity::class.java)
                        startActivity(miIntent)
                    }
                    operacionNueva()
                }else{
                    m("Ingresa una respuesta")
                }
            }
        }
        if (operacionElegida == "*"){
            btnVeri.setOnClickListener{
                if (etOper.text.isNotEmpty()){
                    if (etOper.getText().toString().toInt() == resultado){
                        val miIntent = Intent(this, SegundaActivity::class.java)
                        startActivity(miIntent)

                    }else{
                        val miIntent = Intent(this, TerceraActivity::class.java)
                        startActivity(miIntent)

                    }
                    operacionNueva()
                }else{
                    m("Ingresa una respuesta")
                }

            }
        }
    }

    fun operacionNueva(){
        operacionElegida = listaOperaciones.random()
        if (operacionElegida == "+"){
            suma()
        }
        if (operacionElegida == "-"){
            resta()
        }
        if (operacionElegida == "*"){
            multiplicacion()
        }
    }

    fun suma(){
        val num1 = Random.nextInt(1, 11)
        val num2 = Random.nextInt(1, 11)
        tvOper.text = "$num1 + $num2 = ?"
        resultado = num1 + num2
        etOper.text.clear()
    }

    fun resta(){
        val num1 = Random.nextInt(1, 11)
        val num2 = Random.nextInt(1, 11)
        tvOper.text = "$num1 - $num2 = ?"
        resultado = num1 - num2
        etOper.text.clear()
    }

    fun multiplicacion(){
        val num1 = Random.nextInt(1,11)
        val num2 = Random.nextInt(1,11)
        tvOper.text = "$num1 x $num2 = ?"
        resultado = num1 * num2
        etOper.text.clear()
    }
}
