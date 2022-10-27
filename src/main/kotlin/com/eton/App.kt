package com.eton


import com.eton.model.AppArgs
import com.eton.ui.feature.MainActivity
import com.theapache64.cyclone.core.Application
import com.toxicbakery.logging.Arbor
import com.toxicbakery.logging.Seedling


class App(
    appArgs: AppArgs,
) : Application() {

    companion object {
        lateinit var appArgs: AppArgs
    }

    init {
        App.appArgs = appArgs
    }

    override fun onCreate() {
        super.onCreate()
        Arbor.sow(Seedling())

        Arbor.d("Starting app...")

        val splashIntent = MainActivity.getStartIntent()
        startActivity(splashIntent)
    }
}

/**
 * The magic begins here
 */
fun main() {
    val version = System.getProperty("app.version") ?: "Dev"
    val appArgs = AppArgs(
        appName = "Eton", // To show on the title bar
        version = version, // To show on the title bar.
        versionCode = 100 // To compare with the latest version code (in case if you want to prompt update)
    )

    App(appArgs).onCreate()
}
