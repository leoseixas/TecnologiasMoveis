import android.os.Parcel
import android.os.Parcelable
import java.util.ArrayList

class Cerveja(val nome: String?, val ml: Double, val valor: Double) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readDouble(),
        parcel.readDouble()
    ) {
    }



    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nome)
        parcel.writeDouble(ml)
        parcel.writeDouble(valor)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Cerveja> {
        override fun createFromParcel(parcel: Parcel): Cerveja {
            return Cerveja(parcel)
        }

        override fun newArray(size: Int): Array<Cerveja?> {
            return arrayOfNulls(size)
        }
    }

}




