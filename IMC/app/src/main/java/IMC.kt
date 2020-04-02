import android.os.Parcel
import android.os.Parcelable

class IMC (var peso:Double, var altura:Double):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readDouble(),
        parcel.readDouble()
    ) {
    }

    fun calcularIMC(): String {
        var resultado = peso / (altura * altura)
        var txtResult = if (resultado < 18.5) {
            "Sua classificação é 'Magreza', IMC = " + "%.2f".format(resultado)
        } else if (resultado in 18.5..24.99) {
            "Sua classificação é 'Normal', IMC = " + "%.2f".format(resultado)
        } else if (resultado in 25.00..29.99) {
            "Sua classificação é 'Sobrepeso', IMC = " + "%.2f".format(resultado)
        } else if (resultado in 30.00..39.99) {
            "Sua classificação é 'Obesidade', IMC = " + "%.2f".format(resultado)
        } else {
            "Sua classificação é 'Obesidade Grave', IMC = " + "%.2f".format(resultado)
        }
        return txtResult
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeDouble(peso)
        parcel.writeDouble(altura)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<IMC> {
        override fun createFromParcel(parcel: Parcel): IMC {
            return IMC(parcel)
        }

        override fun newArray(size: Int): Array<IMC?> {
            return arrayOfNulls(size)
        }
    }

}