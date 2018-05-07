package com.example.android.pets.data;

import android.provider.BaseColumns;

public final class PetContract {

    private PetContract() {
    }

    public static abstract class PetEntry implements BaseColumns {

        /**
         * Constants for pets table
         **/
        public final static String TABLE_NAME = "pets";
        public final static String _ID = BaseColumns._ID;          //Type: INTEGER
        public final static String COLUMN_PET_NAME = "name";        //Type: TEXT
        public final static String COLUMN_PET_BREED = "breed";     //Type: TEXT
        public final static String COLUMN_PET_GENDER = "gender";   //Type: INTEGER
        public final static String COLUMN_PET_WEIGHT = "weight";   //Type: INTEGER

        /**
         * Constants for Gender
         **/
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;

    }
}
