package com.example.musicapp

import androidx.annotation.DrawableRes

sealed class Screen(val title : String, val route : String) {

    sealed class BottomScreen(val bTitle: String, val bRoute: String, @DrawableRes val icon: Int) :
        Screen(bTitle, bRoute) {
            object Home : BottomScreen(
                bTitle = "Home",
                bRoute = "home",
                R.drawable.baseline_music_video_24
            )
            object Library : BottomScreen(
                bTitle = "Library",
                bRoute = "library",
                R.drawable.baseline_library_music_24
            )
            object Browse : BottomScreen(
                bTitle = "Browse",
                bRoute = "browse",
                R.drawable.baseline_apps_24
            )
    }

    sealed class DrawerScreen(val dTitle : String, val dRoute : String, @DrawableRes val icon : Int)
        : Screen(dTitle, dRoute) {
            object Account : DrawerScreen(
                dTitle = "Account",
                dRoute = "account",
                R.drawable.ic_account
            )
            object Subscription : DrawerScreen(
                dTitle = "Subscription",
                dRoute = "subscription",
                R.drawable.ic_subscription
            )
            object AddAccount : DrawerScreen(
                dTitle = "Add Account",
                dRoute = "add_account",
                R.drawable.ic_add_account
            )
        }
}
val screenInBottom = listOf(
    Screen.BottomScreen.Home,
    Screen.BottomScreen.Library,
    Screen.BottomScreen.Browse
)
val screensInDrawer = listOf(
    Screen.DrawerScreen.Account,
    Screen.DrawerScreen.AddAccount,
    Screen.DrawerScreen.Subscription
)