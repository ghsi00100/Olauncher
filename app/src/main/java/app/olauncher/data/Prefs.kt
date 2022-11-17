package app.olauncher.data

import android.content.Context
import android.content.SharedPreferences
import android.view.Gravity
import androidx.appcompat.app.AppCompatDelegate

class Prefs(context: Context) {
    //this is step 1 of me trying to help making app count more dynamic being listed insted of hard coded. 
    // by no meance this is production ready and will need your review
    private val PREFS_FILENAME = "app.olauncher"

    private val FIRST_OPEN = "FIRST_OPEN"
    private val FIRST_SETTINGS_OPEN = "FIRST_SETTINGS_OPEN"
    private val FIRST_HIDE = "FIRST_HIDE"
    private val LOCK_MODE = "LOCK_MODE"
    private val HOME_APPS_NUM = "HOME_APPS_NUM"
    private val AUTO_SHOW_KEYBOARD = "AUTO_SHOW_KEYBOARD"
    private val KEYBOARD_MESSAGE = "KEYBOARD_MESSAGE"
    private val DAILY_WALLPAPER = "DAILY_WALLPAPER"
    private val DAILY_WALLPAPER_URL = "DAILY_WALLPAPER_URL"
    private val WALLPAPER_UPDATED_DAY = "WALLPAPER_UPDATED_DAY"
    private val HOME_ALIGNMENT = "HOME_ALIGNMENT"
    private val HOME_BOTTOM_ALIGNMENT = "HOME_BOTTOM_ALIGNMENT"
    private val APP_LABEL_ALIGNMENT = "APP_LABEL_ALIGNMENT"
    private val STATUS_BAR = "STATUS_BAR"
    private val DATE_TIME_VISIBILITY = "DATE_TIME_VISIBILITY"
    private val SWIPE_LEFT_ENABLED = "SWIPE_LEFT_ENABLED"
    private val SWIPE_RIGHT_ENABLED = "SWIPE_RIGHT_ENABLED"
    private val SCREEN_TIMEOUT = "SCREEN_TIMEOUT"
    private val HIDDEN_APPS = "HIDDEN_APPS"
    private val HIDDEN_APPS_UPDATED = "HIDDEN_APPS_UPDATED"
    private val SHOW_HINT_COUNTER = "SHOW_HINT_COUNTER"
    private val APP_THEME = "APP_THEME"
    private val ABOUT_CLICKED = "ABOUT_CLICKED"
    private val RATE_CLICKED = "RATE_CLICKED"
    private val RENAME_TIP_SHOWN = "RENAME_TIP_SHOWN"
    private val SWIPE_DOWN_ACTION = "SWIPE_DOWN_ACTION"

    // private val APP_NAME_1 = "APP_NAME_1"
    // private val APP_NAME_2 = "APP_NAME_2"
    // private val APP_NAME_3 = "APP_NAME_3"
    // private val APP_NAME_4 = "APP_NAME_4"
    // private val APP_NAME_5 = "APP_NAME_5"
    // private val APP_NAME_6 = "APP_NAME_6"
    // private val APP_NAME_7 = "APP_NAME_7"
    // private val APP_NAME_8 = "APP_NAME_8"
    private val APP_NAMES = mutableListOf<String>()
    // private val APP_PACKAGE_1 = "APP_PACKAGE_1"
    // private val APP_PACKAGE_2 = "APP_PACKAGE_2"
    // private val APP_PACKAGE_3 = "APP_PACKAGE_3"
    // private val APP_PACKAGE_4 = "APP_PACKAGE_4"
    // private val APP_PACKAGE_5 = "APP_PACKAGE_5"
    // private val APP_PACKAGE_6 = "APP_PACKAGE_6"
    // private val APP_PACKAGE_7 = "APP_PACKAGE_7"
    // private val APP_PACKAGE_8 = "APP_PACKAGE_8"
    private val APP_PACKAGES = mutableListOf<String>()
    // private val APP_ACTIVITY_CLASS_NAME_1 = "APP_ACTIVITY_CLASS_NAME_1"
    // private val APP_ACTIVITY_CLASS_NAME_2 = "APP_ACTIVITY_CLASS_NAME_2"
    // private val APP_ACTIVITY_CLASS_NAME_3 = "APP_ACTIVITY_CLASS_NAME_3"
    // private val APP_ACTIVITY_CLASS_NAME_4 = "APP_ACTIVITY_CLASS_NAME_4"
    // private val APP_ACTIVITY_CLASS_NAME_5 = "APP_ACTIVITY_CLASS_NAME_5"
    // private val APP_ACTIVITY_CLASS_NAME_6 = "APP_ACTIVITY_CLASS_NAME_6"
    // private val APP_ACTIVITY_CLASS_NAME_7 = "APP_ACTIVITY_CLASS_NAME_7"
    // private val APP_ACTIVITY_CLASS_NAME_8 = "APP_ACTIVITY_CLASS_NAME_8"
    private val APP_ACTIVITY_CLASS_NAMES = mutableListOf<String>()
    // private val APP_USER_1 = "APP_USER_1"
    // private val APP_USER_2 = "APP_USER_2"
    // private val APP_USER_3 = "APP_USER_3"
    // private val APP_USER_4 = "APP_USER_4"
    // private val APP_USER_5 = "APP_USER_5"
    // private val APP_USER_6 = "APP_USER_6"
    // private val APP_USER_7 = "APP_USER_7"
    // private val APP_USER_8 = "APP_USER_8"
    private val APP_USERS = mutableListOf<String>()

    private val APP_NAME_SWIPE_LEFT = "APP_NAME_SWIPE_LEFT"
    private val APP_NAME_SWIPE_RIGHT = "APP_NAME_SWIPE_RIGHT"
    private val APP_PACKAGE_SWIPE_LEFT = "APP_PACKAGE_SWIPE_LEFT"
    private val APP_PACKAGE_SWIPE_RIGHT = "APP_PACKAGE_SWIPE_RIGHT"
    private val APP_ACTIVITY_CLASS_NAME_SWIPE_LEFT = "APP_ACTIVITY_CLASS_NAME_SWIPE_LEFT"
    private val APP_ACTIVITY_CLASS_NAME_SWIPE_RIGHT = "APP_ACTIVITY_CLASS_NAME_SWIPE_RIGHT"
    private val APP_USER_SWIPE_LEFT = "APP_USER_SWIPE_LEFT"
    private val APP_USER_SWIPE_RIGHT = "APP_USER_SWIPE_RIGHT"

    private val prefs: SharedPreferences = context.getSharedPreferences(PREFS_FILENAME, 0);

    var firstOpen: Boolean
        get() = prefs.getBoolean(FIRST_OPEN, true)
        set(value) = prefs.edit().putBoolean(FIRST_OPEN, value).apply()

    var firstSettingsOpen: Boolean
        get() = prefs.getBoolean(FIRST_SETTINGS_OPEN, true)
        set(value) = prefs.edit().putBoolean(FIRST_SETTINGS_OPEN, value).apply()

    var firstHide: Boolean
        get() = prefs.getBoolean(FIRST_HIDE, true)
        set(value) = prefs.edit().putBoolean(FIRST_HIDE, value).apply()

//    var lockModeOn: Boolean
//        get() = prefs.getBoolean(LOCK_MODE, false)
//        set(value) = prefs.edit().putBoolean(LOCK_MODE, value).apply()

    var autoShowKeyboard: Boolean
        get() = prefs.getBoolean(AUTO_SHOW_KEYBOARD, true)
        set(value) = prefs.edit().putBoolean(AUTO_SHOW_KEYBOARD, value).apply()

    var keyboardMessageShown: Boolean
        get() = prefs.getBoolean(KEYBOARD_MESSAGE, false)
        set(value) = prefs.edit().putBoolean(KEYBOARD_MESSAGE, value).apply()

    var dailyWallpaper: Boolean
        get() = prefs.getBoolean(DAILY_WALLPAPER, false)
        set(value) = prefs.edit().putBoolean(DAILY_WALLPAPER, value).apply()

    var dailyWallpaperUrl: String
        get() = prefs.getString(DAILY_WALLPAPER_URL, "").toString()
        set(value) = prefs.edit().putString(DAILY_WALLPAPER_URL, value).apply()

    var homeAppsNum: Int
        get() = prefs.getInt(HOME_APPS_NUM, 4)
        set(value) = prefs.edit().putInt(HOME_APPS_NUM, value).apply()

    var homeAlignment: Int
        get() = prefs.getInt(HOME_ALIGNMENT, Gravity.START)
        set(value) = prefs.edit().putInt(HOME_ALIGNMENT, value).apply()

    var homeBottomAlignment: Boolean
        get() = prefs.getBoolean(HOME_BOTTOM_ALIGNMENT, false)
        set(value) = prefs.edit().putBoolean(HOME_BOTTOM_ALIGNMENT, value).apply()

    var appLabelAlignment: Int
        get() = prefs.getInt(APP_LABEL_ALIGNMENT, Gravity.START)
        set(value) = prefs.edit().putInt(APP_LABEL_ALIGNMENT, value).apply()

    var showStatusBar: Boolean
        get() = prefs.getBoolean(STATUS_BAR, false)
        set(value) = prefs.edit().putBoolean(STATUS_BAR, value).apply()

    var dateTimeVisibility: Int
        get() = prefs.getInt(DATE_TIME_VISIBILITY, Constants.DateTime.ON)
        set(value) = prefs.edit().putInt(DATE_TIME_VISIBILITY, value).apply()

    var swipeLeftEnabled: Boolean
        get() = prefs.getBoolean(SWIPE_LEFT_ENABLED, true)
        set(value) = prefs.edit().putBoolean(SWIPE_LEFT_ENABLED, value).apply()

    var swipeRightEnabled: Boolean
        get() = prefs.getBoolean(SWIPE_RIGHT_ENABLED, true)
        set(value) = prefs.edit().putBoolean(SWIPE_RIGHT_ENABLED, value).apply()

    var appTheme: Int
        get() = prefs.getInt(APP_THEME, AppCompatDelegate.MODE_NIGHT_YES)
        set(value) = prefs.edit().putInt(APP_THEME, value).apply()

    var screenTimeout: Int
        get() = prefs.getInt(SCREEN_TIMEOUT, 30000) // Default: 30 seconds
        set(value) = prefs.edit().putInt(SCREEN_TIMEOUT, value).apply()

    var hiddenApps: MutableSet<String>
        get() = prefs.getStringSet(HIDDEN_APPS, mutableSetOf()) as MutableSet<String>
        set(value) = prefs.edit().putStringSet(HIDDEN_APPS, value).apply()

    var hiddenAppsUpdated: Boolean
        get() = prefs.getBoolean(HIDDEN_APPS_UPDATED, false)
        set(value) = prefs.edit().putBoolean(HIDDEN_APPS_UPDATED, value).apply()

    var toShowHintCounter: Int
        get() = prefs.getInt(SHOW_HINT_COUNTER, 1)
        set(value) = prefs.edit().putInt(SHOW_HINT_COUNTER, value).apply()

    var aboutClicked: Boolean
        get() = prefs.getBoolean(ABOUT_CLICKED, false)
        set(value) = prefs.edit().putBoolean(ABOUT_CLICKED, value).apply()

    var rateClicked: Boolean
        get() = prefs.getBoolean(RATE_CLICKED, false)
        set(value) = prefs.edit().putBoolean(RATE_CLICKED, value).apply()

    var renameTipShown: Boolean
        get() = prefs.getBoolean(RENAME_TIP_SHOWN, false)
        set(value) = prefs.edit().putBoolean(RENAME_TIP_SHOWN, value).apply()

    var swipeDownAction: Int
        get() = prefs.getInt(SWIPE_DOWN_ACTION, Constants.SwipeDownAction.NOTIFICATIONS)
        set(value) = prefs.edit().putInt(SWIPE_DOWN_ACTION, value).apply()

    // var appName1: String
    //     get() = prefs.getString(APP_NAME_1, "").toString()
    //     set(value) = prefs.edit().putString(APP_NAME_1, value).apply()

    // var appName2: String
    //     get() = prefs.getString(APP_NAME_2, "").toString()
    //     set(value) = prefs.edit().putString(APP_NAME_2, value).apply()

    // var appName3: String
    //     get() = prefs.getString(APP_NAME_3, "").toString()
    //     set(value) = prefs.edit().putString(APP_NAME_3, value).apply()

    // var appName4: String
    //     get() = prefs.getString(APP_NAME_4, "").toString()
    //     set(value) = prefs.edit().putString(APP_NAME_4, value).apply()

    // var appName5: String
    //     get() = prefs.getString(APP_NAME_5, "").toString()
    //     set(value) = prefs.edit().putString(APP_NAME_5, value).apply()

    // var appName6: String
    //     get() = prefs.getString(APP_NAME_6, "").toString()
    //     set(value) = prefs.edit().putString(APP_NAME_6, value).apply()

    // var appName7: String
    //     get() = prefs.getString(APP_NAME_7, "").toString()
    //     set(value) = prefs.edit().putString(APP_NAME_7, value).apply()

    // var appName8: String
    //     get() = prefs.getString(APP_NAME_8, "").toString()
    //     set(value) = prefs.edit().putString(APP_NAME_8, value).apply()
     var appNames: mutableListOf<String>
        get() = prefs.getString(APP_NAMES, "").toString() // not sure what has been done here might need some help to
        set(listOfValues) = {}//pls help how i do it i thought of somthing like this:
        //{for (i in 1..APP_USERS.size) {
        // APP_USERS[i-1] = "listOfValues[i-1]"
    // }}


    // var appPackage1: String
    //     get() = prefs.getString(APP_PACKAGE_1, "").toString()
    //     set(value) = prefs.edit().putString(APP_PACKAGE_1, value).apply()

    // var appPackage2: String
    //     get() = prefs.getString(APP_PACKAGE_2, "").toString()
    //     set(value) = prefs.edit().putString(APP_PACKAGE_2, value).apply()

    // var appPackage3: String
    //     get() = prefs.getString(APP_PACKAGE_3, "").toString()
    //     set(value) = prefs.edit().putString(APP_PACKAGE_3, value).apply()

    // var appPackage4: String
    //     get() = prefs.getString(APP_PACKAGE_4, "").toString()
    //     set(value) = prefs.edit().putString(APP_PACKAGE_4, value).apply()

    // var appPackage5: String
    //     get() = prefs.getString(APP_PACKAGE_5, "").toString()
    //     set(value) = prefs.edit().putString(APP_PACKAGE_5, value).apply()

    // var appPackage6: String
    //     get() = prefs.getString(APP_PACKAGE_6, "").toString()
    //     set(value) = prefs.edit().putString(APP_PACKAGE_6, value).apply()

    // var appPackage7: String
    //     get() = prefs.getString(APP_PACKAGE_7, "").toString()
    //     set(value) = prefs.edit().putString(APP_PACKAGE_7, value).apply()

    // var appPackage8: String
    //     get() = prefs.getString(APP_PACKAGE_8, "").toString()
    //     set(value) = prefs.edit().putString(APP_PACKAGE_8, value).apply()
     var appPackages: mutableListOf<String>
        get() = prefs.getString(APP_PACKAGES, "").toString() // not sure what has been done here might need some help to
        set(listOfValues) = {}//pls help how i do it i thought of somthing like this:
        //{for (i in 1..APP_PACKAGES.size) {
        // APP_PACKAGES[i-1] = "listOfValues[i-1]"
    // }}

    // var appActivityClassName1: String?
    //     get() = prefs.getString(APP_ACTIVITY_CLASS_NAME_1, "").toString()
    //     set(value) = prefs.edit().putString(APP_ACTIVITY_CLASS_NAME_1, value).apply()

    // var appActivityClassName2: String?
    //     get() = prefs.getString(APP_ACTIVITY_CLASS_NAME_2, "").toString()
    //     set(value) = prefs.edit().putString(APP_ACTIVITY_CLASS_NAME_2, value).apply()

    // var appActivityClassName3: String?
    //     get() = prefs.getString(APP_ACTIVITY_CLASS_NAME_3, "").toString()
    //     set(value) = prefs.edit().putString(APP_ACTIVITY_CLASS_NAME_3, value).apply()

    // var appActivityClassName4: String?
    //     get() = prefs.getString(APP_ACTIVITY_CLASS_NAME_4, "").toString()
    //     set(value) = prefs.edit().putString(APP_ACTIVITY_CLASS_NAME_4, value).apply()

    // var appActivityClassName5: String?
    //     get() = prefs.getString(APP_ACTIVITY_CLASS_NAME_5, "").toString()
    //     set(value) = prefs.edit().putString(APP_ACTIVITY_CLASS_NAME_5, value).apply()

    // var appActivityClassName6: String?
    //     get() = prefs.getString(APP_ACTIVITY_CLASS_NAME_6, "").toString()
    //     set(value) = prefs.edit().putString(APP_ACTIVITY_CLASS_NAME_6, value).apply()

    // var appActivityClassName7: String?
    //     get() = prefs.getString(APP_ACTIVITY_CLASS_NAME_7, "").toString()
    //     set(value) = prefs.edit().putString(APP_ACTIVITY_CLASS_NAME_7, value).apply()

    // var appActivityClassName8: String?
    //     get() = prefs.getString(APP_ACTIVITY_CLASS_NAME_8, "").toString()
    //     set(value) = prefs.edit().putString(APP_ACTIVITY_CLASS_NAME_8, value).apply()

    var appActivityClassNames: mutableListOf<String>
        get() = prefs.getString(APP_ACTIVITY_CLASS_NAMES, "").toString() // not sure what has been done here might need some help to
        set(listOfValues) = {}//pls help how i do it i thought of somthing like this:
        //{for (i in 1..APP_ACTIVITY_CLASS_NAMES.size) {
        // APP_ACTIVITY_CLASS_NAMES[i-1] = "listOfValues[i-1]"
    // }}

    // var appUser1: String
    //     get() = prefs.getString(APP_USER_1, "").toString()
    //     set(value) = prefs.edit().putString(APP_USER_1, value).apply()

    // var appUser2: String
    //     get() = prefs.getString(APP_USER_2, "").toString()
    //     set(value) = prefs.edit().putString(APP_USER_2, value).apply()

    // var appUser3: String
    //     get() = prefs.getString(APP_USER_3, "").toString()
    //     set(value) = prefs.edit().putString(APP_USER_3, value).apply()

    // var appUser4: String
    //     get() = prefs.getString(APP_USER_4, "").toString()
    //     set(value) = prefs.edit().putString(APP_USER_4, value).apply()

    // var appUser5: String
    //     get() = prefs.getString(APP_USER_5, "").toString()
    //     set(value) = prefs.edit().putString(APP_USER_5, value).apply()

    // var appUser6: String
    //     get() = prefs.getString(APP_USER_6, "").toString()
    //     set(value) = prefs.edit().putString(APP_USER_6, value).apply()

    // var appUser7: String
    //     get() = prefs.getString(APP_USER_7, "").toString()
    //     set(value) = prefs.edit().putString(APP_USER_7, value).apply()

    // var appUser8: String
    //     get() = prefs.getString(APP_USER_8, "").toString()
    //     set(value) = prefs.edit().putString(APP_USER_8, value).apply()
    var appUsers : mutableListOf<String>
        get() = prefs.getString(APP_USERS, "").toString()
        set(listOfValues) = {}//pls help how i do it i thought of somthing like this:
        //{for (i in 1..APP_USERS.size) {
        // APP_USERS[i-1] = "listOfValues[i-1]"
    // }}

    var appNameSwipeLeft: String
        get() = prefs.getString(APP_NAME_SWIPE_LEFT, "Camera").toString()
        set(value) = prefs.edit().putString(APP_NAME_SWIPE_LEFT, value).apply()

    var appNameSwipeRight: String
        get() = prefs.getString(APP_NAME_SWIPE_RIGHT, "Phone").toString()
        set(value) = prefs.edit().putString(APP_NAME_SWIPE_RIGHT, value).apply()

    var appPackageSwipeLeft: String
        get() = prefs.getString(APP_PACKAGE_SWIPE_LEFT, "").toString()
        set(value) = prefs.edit().putString(APP_PACKAGE_SWIPE_LEFT, value).apply()

    var appActivityClassNameSwipeLeft: String?
        get() = prefs.getString(APP_ACTIVITY_CLASS_NAME_SWIPE_LEFT, "").toString()
        set(value) = prefs.edit().putString(APP_ACTIVITY_CLASS_NAME_SWIPE_LEFT, value).apply()

    var appPackageSwipeRight: String
        get() = prefs.getString(APP_PACKAGE_SWIPE_RIGHT, "").toString()
        set(value) = prefs.edit().putString(APP_PACKAGE_SWIPE_RIGHT, value).apply()

    var appActivityClassNameRight: String?
        get() = prefs.getString(APP_ACTIVITY_CLASS_NAME_SWIPE_RIGHT, "").toString()
        set(value) = prefs.edit().putString(APP_ACTIVITY_CLASS_NAME_SWIPE_RIGHT, value).apply()

    var appUserSwipeLeft: String
        get() = prefs.getString(APP_USER_SWIPE_LEFT, "").toString()
        set(value) = prefs.edit().putString(APP_USER_SWIPE_LEFT, value).apply()

    var appUserSwipeRight: String
        get() = prefs.getString(APP_USER_SWIPE_RIGHT, "").toString()
        set(value) = prefs.edit().putString(APP_USER_SWIPE_RIGHT, value).apply()

    fun getAppName(location: Int): String {
        return when (location) {
            //need to find a solution here to
            1 -> prefs.getString(APP_NAMES[0], "").toString()
            2 -> prefs.getString(APP_NAMES[1], "").toString()
            3 -> prefs.getString(APP_NAMES[2], "").toString()
            4 -> prefs.getString(APP_NAMES[3], "").toString()
            5 -> prefs.getString(APP_NAMES[4], "").toString()
            6 -> prefs.getString(APP_NAMES[5], "").toString()
            7 -> prefs.getString(APP_NAMES[6], "").toString()
            8 -> prefs.getString(APP_NAMES[7], "").toString()
            else -> ""
        }
    }

    fun getAppPackage(location: Int): String {
        return when (location) {
            //and here
            1 -> prefs.getString(APP_PACKAGE[0], "").toString()
            2 -> prefs.getString(APP_PACKAGE[1], "").toString()
            3 -> prefs.getString(APP_PACKAGE[2], "").toString()
            4 -> prefs.getString(APP_PACKAGE[3], "").toString()
            5 -> prefs.getString(APP_PACKAGE[4], "").toString()
            6 -> prefs.getString(APP_PACKAGE[5], "").toString()
            7 -> prefs.getString(APP_PACKAGE[6], "").toString()
            8 -> prefs.getString(APP_PACKAGE[7], "").toString()
            else -> ""
        }
    }

    fun getAppActivityClassName(location: Int): String {
        return when (location) {
            //and here
            1 -> prefs.getString(APP_ACTIVITY_CLASS_NAMES[0], "").toString()
            2 -> prefs.getString(APP_ACTIVITY_CLASS_NAMES[1], "").toString()
            3 -> prefs.getString(APP_ACTIVITY_CLASS_NAMES[2], "").toString()
            4 -> prefs.getString(APP_ACTIVITY_CLASS_NAMES[3], "").toString()
            5 -> prefs.getString(APP_ACTIVITY_CLASS_NAMES[4], "").toString()
            6 -> prefs.getString(APP_ACTIVITY_CLASS_NAMES[5], "").toString()
            7 -> prefs.getString(APP_ACTIVITY_CLASS_NAMES[6], "").toString()
            8 -> prefs.getString(APP_ACTIVITY_CLASS_NAMES[7], "").toString()
            else -> ""
        }
    }

    fun getAppUser(location: Int): String {
        return when (location) {
            //and so does here
            1 -> prefs.getString(APP_USERS[0], "").toString()
            2 -> prefs.getString(APP_USERS[1], "").toString()
            3 -> prefs.getString(APP_USERS[2], "").toString()
            4 -> prefs.getString(APP_USERS[3], "").toString()
            5 -> prefs.getString(APP_USERS[4], "").toString()
            6 -> prefs.getString(APP_USERS[5], "").toString()
            7 -> prefs.getString(APP_USERS[6], "").toString()
            8 -> prefs.getString(APP_USERS[7], "").toString()
            else -> ""
        }
    }
}