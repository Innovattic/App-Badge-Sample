plugins {
    id("com.android.application")
    id("kotlin-android")
    id("ru.cleverpumpkin.badge")
}

android {
    compileSdk = 30

    defaultConfig {
        applicationId = "ru.cleverpumpkin.appbadge.sample"

        minSdk = 21
        targetSdk = 30
        versionCode = 1
        versionName = "0.1.0"
    }
}

badge {
    iconNames = listOf(
        "@mipmap/ic_launcher_custom",
        "@mipmap/ic_launcher_foreground"
    )
    buildTypes {
        create("debug") {
            enabled = true
            text = "Something"
        }
    }
}

dependencies {
    implementation(project(":sample-library"))
}
