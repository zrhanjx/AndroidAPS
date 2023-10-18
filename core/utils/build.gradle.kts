plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("kotlin-allopen")
    id("android-module-dependencies")
    id("all-open-dependencies")
    id("test-dependencies")
}

apply(from = "${project.rootDir}/core/main/jacoco_global.gradle")

android {
    namespace = "app.aaps.core.utils"
}

dependencies {

    api(Libs.jodaTimeAndroid)

    //Firebase
    api(platform(Libs.Google.Firebase.firebaseBom))
    api(Libs.Google.Firebase.analytics)
    api(Libs.Google.Firebase.crashlytics)
    // StatsActivity not in use now
    // api(Libs.Google.Firebase.messaging)
    // api(Libs.Google.Firebase.auth)
    // api(Libs.Google.Firebase.database)

    //CryptoUtil
    api(Libs.spongycastleCore)
    api(Libs.Google.tinkAndroid)

    //WorkManager
    api(Libs.AndroidX.workRuntimeKtx) // DataWorkerStorage

    api(Libs.Dagger.android)
    api(Libs.Dagger.androidSupport)
}