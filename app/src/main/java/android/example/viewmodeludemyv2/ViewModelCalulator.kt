package android.example.viewmodeludemyv2

import androidx.lifecycle.ViewModel

class ViewModelCalulator(StartingSuma : Int):ViewModel()
{
private var Suma = 3

    init{
        Suma = StartingSuma
    }


    fun getUpdateSuma (Suma: Int): Int{
        this.Suma +=Suma
        return this.Suma
    }
    
    fun getCurrentSuma():Int{
        return Suma
    }


}