package com.example.cmathew.kickchase.welcome;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;

public class OverviewSlide implements Parcelable {
    @DrawableRes
    private int drawableResourceId;
    @StringRes
    private int captionResourceId;
    @StringRes
    private int headerResourceId;
    @StringRes
    private int titleResourceId;

    public OverviewSlide(@StringRes int titleResourceId,
                        @StringRes int headerResId,
                        @StringRes int messageResId,
                        @DrawableRes int drawableResId) {
        this.titleResourceId = titleResourceId;
        this.headerResourceId = headerResId;
        this.captionResourceId = messageResId;
        this.drawableResourceId = drawableResId;
    }

    @DrawableRes
    public int getImage() {
        return drawableResourceId;
    }

    @StringRes
    public int getHeader() {
        return headerResourceId;
    }

    @StringRes
    public int getMessage() {
        return captionResourceId;
    }

    @StringRes
    public int getTitle() {
        return titleResourceId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    private OverviewSlide(Parcel in) {
        this.titleResourceId = in.readInt();
        this.headerResourceId = in.readInt();
        this.captionResourceId = in.readInt();
        this.drawableResourceId = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(getTitle());
        dest.writeInt(getHeader());
        dest.writeInt(getMessage());
        dest.writeInt(getImage());
    }

    public static final Parcelable.Creator<OverviewSlide> CREATOR = new Parcelable.Creator<OverviewSlide>() {
        @Override
        public OverviewSlide createFromParcel(Parcel in) {
            return new OverviewSlide(in);
        }

        @Override
        public OverviewSlide[] newArray(int size) {
            return new OverviewSlide[size];
        }
    };
}