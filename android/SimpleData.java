package com.example.caucse.myparcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class SimpleData implements Parcelable {


    int number;
    String message;

    public SimpleData(int number, String message) {
        this.number = number;
        this.message = message;
    } // 생성자

    public SimpleData(Parcel src) {
        number = src.readInt();
        message = src.readString();
    } // read해서  할당하겠다

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public SimpleData createFromParcel(Parcel src) {
            return new SimpleData(src);
        }

        public SimpleData[] newArray(int size) {
         return new SimpleData[size];
        }
    }; //객체를 만들어 주면서 할당
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(number);
        dest.writeString(message);
    }
}
