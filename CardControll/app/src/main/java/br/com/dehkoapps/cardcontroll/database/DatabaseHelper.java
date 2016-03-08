package br.com.dehkoapps.cardcontroll.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {


    // Database info
    public static final String DATABASE_NAME = "CardControll.db";
    public static final int DATABASE_VERSION = 0;

    // Common variables
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_VALUE = "value";
    public static final String COLUMN_CREATION_DATE = "creation_date";
    public static final String COLUMN_MODIFICATION_DATE = "modification_date";

    public static final String TABLE_USER = "User";

    public static final String COLUMN_NAME= "name";
    public static final String COLUMN_PASSWORD = "password";
    public static final String COLUMN_EMAIL = "email";
    public static final String COLUMN_SALARY="salary";

    public static final String TABLE_CARD = "Card";

    public static final String COLUMN_USER_ID = "id_user";
    public static final String COLUMN_BANK = "bank";
    public static final String COLUMN_ACCOUNT_NUMBER = "account_number";
    public static final String COLUMN_VALID_THRU = "valid_thru";
    public static final String COLUMN_AGENCY = "agency";
    public static final String COLUMN_SECURITY_CODE = "security_code";
    public static final String COLUMN_LIMIT = "limit";
    public static final String COLUMN_BILL_VALIDITY = "bill_validity";

    public static final String TABLE_BILL = "Bill";

    public static final String COLUMN_CARD_ID = "id_card";
    public static final String COLUMN_DATE = "date";

    public static final String TABLE_ENTRY = "Entry";

    public static final String COLUMN_BILL_ID = "id_bill";
    public static final String COLUMN_TYPE = "type";
    public static final String COLUMN_DESCRIPTION = "description";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
