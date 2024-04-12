package bryan.cornejo.menudesplegabeeduardo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class fragmentr_configuracion : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       //Creo una variable que es igual a el fragment inflado
        //inflado significa que esta la vista conectada al codigo

        val root = inflater.inflate(R.layout.fragment_fragmentr_configuracion, container, false)

        //mandar a llamar el boton btnIngrear
        val btn_ingresar = root.findViewById<Button>(R.id.btn_ingresar)
        btn_ingresar.setOnClickListener {
            Toast.makeText(context, "Hola mundo", Toast.LENGTH_SHORT).show()
        }

        return root
    }



}