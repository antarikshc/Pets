package com.example.android.pets.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

public final class PetContract {

    private PetContract() {
    }

    /**
     * Constants for ContentProvider
     **/
    public static final String CONTENT_AUTHORITY = "com.example.android.pets";
    private static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    public final static String PATH_PETS = "pets";
    public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PETS);

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

        /**
         * Returns whether or not the given gender is {@link #GENDER_UNKNOWN}, {@link #GENDER_MALE},
         * or {@link #GENDER_FEMALE}.
         */
        public static boolean isValidGender(int gender) {
            return gender == GENDER_UNKNOWN || gender == GENDER_MALE || gender == GENDER_FEMALE;
        }

        /**
         * The MIME type of the {@link #CONTENT_URI} for a list of pets.
         */
        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PETS;

        /**
         * The MIME type of the {@link #CONTENT_URI} for a single pet.
         */
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PETS;

    }
}
